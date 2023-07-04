/*
 * 
 */
package com.sqisoft.plantmate.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sqisoft.plantmate.domain.UploadFile;
import com.sqisoft.plantmate.service.UploadFileService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

/**
 * @author jynius
 */
@RestController
@RequestMapping("/api/file")
@Tag(name="파일", description="파일을 다룬다.")
public class FileController {

	@Resource
	private UploadFileService service;
	@Resource(name="uploadRootDirectory")
	private File uploadRootDirectory;
	
    @GetMapping("/{id}")
	@Operation(
			summary="파일 다운로드 처리",
			description="파일 다운로드 요청을 처리한다.",
			tags={"파일"})
	public ResponseEntity<InputStreamResource> download(@PathVariable("id") Integer id) {
 
        // Load file as Resource
    	UploadFile dbfile = service.selectOne(id);

		MediaType contentType = null;
		try {
			contentType = MediaType.parseMediaType(dbfile.getType());
		}
		catch (Exception e) {
	        // Fallback to the default content type if type could not be determined
			if(contentType == null) {
			    contentType = MediaType.APPLICATION_OCTET_STREAM;
			}
		}
		
		String desposition = String.format("attachment; filename=\"%s\"", dbfile.getName());
//		No converter for [class java.io.File] with preset Content-Type 'image/jpeg'];
		File realfile = new File(uploadRootDirectory, dbfile.getPath());
		InputStreamResource resource;
		try {
			resource = new InputStreamResource(new FileInputStream(realfile));
	        return ResponseEntity.ok()
	                .contentType(contentType)
	                .header(HttpHeaders.CONTENT_DISPOSITION, desposition)
	                .body(resource);
		}
		catch (FileNotFoundException e) {
	        return ResponseEntity.notFound().build();
		}

	}
	
    @PostMapping(path="", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	@Operation(
			summary="파일 업로드 처리",
			description="파일 업로드 요청을 처리한다.",
			tags={"파일"})
	public ResponseEntity<UploadFile> upload(@RequestBody final MultipartFile mpfile) {

    	UploadFile dbfile = new UploadFile();
    	dbfile.setParam(mpfile.getName());
    	dbfile.setName(mpfile.getOriginalFilename());
    	dbfile.setType(mpfile.getContentType());
    	dbfile.setSize(mpfile.getSize());
    	
    	File realfile = new File(uploadRootDirectory, dbfile.getPath());
    	File directory = realfile.getParentFile();
    	if(!directory.exists() && !directory.mkdirs()) {
    		throw new IllegalStateException("Can't create directory[" + directory + "]!");
    	}
    	
    	try {
			mpfile.transferTo(realfile);
		}
    	catch (IllegalStateException | IOException e) {
    		throw new IllegalStateException("Can't copy file[" + mpfile + "] to [" + realfile + "]!");
		}
    	
    	int affected = service.save(dbfile);
    	if(affected==0) {
    		throw new IllegalStateException("Can't save file[" + dbfile + "]!");
    	}
    	
    	UploadFile saved = service.selectOne(dbfile.getId());
    	
    	return ResponseEntity.of(Optional.of(saved));
    }
}
