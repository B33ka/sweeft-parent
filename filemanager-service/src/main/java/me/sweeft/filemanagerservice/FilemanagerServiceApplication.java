package me.sweeft.filemanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class FilemanagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilemanagerServiceApplication.class, args);
	}

}
