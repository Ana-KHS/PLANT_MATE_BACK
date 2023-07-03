/*
 * 
 */
package com.sqisoft.plantmate;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jynius
 */
@Configuration
public class DirectoryConfig {

	@Value("${spring.servlet.multipart.location}")
	private String root;
	private File uploadRootDirectory;

	@Bean("uploadRootDirectory")
	public File getUploadRootDirectory() {
		
		if(uploadRootDirectory==null) {
			uploadRootDirectory = new File(root);
			if(!uploadRootDirectory.exists() && !uploadRootDirectory.mkdirs()) {
				throw new IllegalStateException("Can't create directory[" + uploadRootDirectory + "]!");
			}
		}
		
		return uploadRootDirectory;
	}
}
