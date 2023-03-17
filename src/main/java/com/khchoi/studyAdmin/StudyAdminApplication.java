package com.khchoi.studyAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StudyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyAdminApplication.class, args);
	}

}
