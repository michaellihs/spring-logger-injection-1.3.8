package com.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Stackoverflow40117503Application {

	public static void main(String[] args) {
		SpringApplication.run(Stackoverflow40117503Application.class, args);

	}

	@Configuration
	public class LoggerConf {

		@Bean
		public Logger log(InjectionPoint ip) {
			return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
		}

	}

	@RestController
	public class Controller {

		@Autowired
		private Logger log;

		@RequestMapping("/")
		public String home() {
			log.warn("waaaaaaaaaaaaaaaaaaaaaaaaaaaarning");
			return "Hello World!";
		}

	}

}
