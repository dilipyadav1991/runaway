//Reference: https://www.codeproject.com/Tips/1040097/Create-a-Simple-Web-Server-in-Java-HTTP-Server

package com.example.dilip.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
		SpringApplication.run(WebServiceApplication.class, args);
	}
}
