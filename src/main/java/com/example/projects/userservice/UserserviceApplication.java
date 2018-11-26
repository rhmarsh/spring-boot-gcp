package com.example.projects.userservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class UserserviceApplication  extends SpringBootServletInitializer{

	private static Logger log = LogManager.getLogger(UserserviceApplication.class);
	public static void main(String[] args) {
		//SpringApplication.run(UserserviceApplication.class, args);
		SpringApplication app = new SpringApplication(UserserviceApplication.class);
		Environment env = app.run(args).getEnvironment();
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\thttp://localhost:{}\n" +
						"----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"));
	}
}
