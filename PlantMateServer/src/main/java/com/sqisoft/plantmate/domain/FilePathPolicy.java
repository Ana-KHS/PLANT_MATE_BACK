/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * @author jynius
 */
public interface FilePathPolicy {
	
	public static class DateDependentPolicy implements FilePathPolicy {

		private static final ZoneId ZONE_ID = ZoneId.systemDefault();
		private static final String FORMAT = "yyyyMM" + File.separatorChar + "dd";
		private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(FORMAT);
		private static final char SEPARATOR = File.separatorChar;
		
		@Override
		public String create(String filename) {
			
			LocalDateTime time = LocalDateTime.now();
			String folder = time.format(FORMATTER);
			long name = time.atZone(ZONE_ID).toInstant().toEpochMilli();
			Optional<String> extension = getExtension(filename);
			
			return String.format("date%c%s%c%d%s", SEPARATOR, folder, SEPARATOR, name, extension.get());
		}
	}

	String create(String filename);

	default Optional<String> getExtension(String filename) {
		return Optional.ofNullable(filename)
			      .filter(f -> f.contains("."))
			      .map(f -> f.substring(filename.lastIndexOf(".")));
	}
}
