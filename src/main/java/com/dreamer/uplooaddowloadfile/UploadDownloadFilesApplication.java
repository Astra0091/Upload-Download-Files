package com.dreamer.uplooaddowloadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStoragePojo.class})
public class UploadDownloadFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadDownloadFilesApplication.class, args);
	}

}
