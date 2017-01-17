package com.smartcloud.Controller;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SmartCloudApplication  extends SpringBootServletInitializer implements CommandLineRunner{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(SmartCloudApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SmartCloudApplication.class, args);
	}
	@Override
	public void run(String... strings) throws Exception {
		// This method called before the server starts.
		// Additional configurations can be placed here.
	}
}
