package com.fourati.vanilla;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VanillaApplication {

	private static final Logger logger = LoggerFactory.getLogger(VanillaApplication.class);
	
	@Value("${server.port}")
	private Integer port;
	
	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(VanillaApplication.class);
		Environment env = app.run(args).getEnvironment();

		String protocol = "http";
		if (env.getProperty("server.ssl.key-store") != null)
			protocol = "https";
		logger.info(
			"\n----------------------------------------------------------\n\t"
			+ "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}{}\n\t"
			+ "External: \t{}://{}:{}{}\n\t"
			+ "Profile(s): \t{}\n\t"
			+ ("Swagger Link: \t{}://{}:{}{}/swagger-ui/index.html \n")
			+ "----------------------------------------------------------",
			env.getProperty("spring.application.name"), protocol, 
			env.getProperty("server.port"), env.getProperty("server.servlet.context-path"), protocol,
			InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"), env.getProperty("server.servlet.context-path"),
			env.getActiveProfiles(), protocol, 
			InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"), env.getProperty("server.servlet.context-path"));
	}
}
