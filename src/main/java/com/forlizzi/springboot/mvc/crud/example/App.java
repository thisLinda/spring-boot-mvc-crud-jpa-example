//https://javatechonline.com/spring-boot-mvc-crud-example/?fbclid=IwAR0-B3enEBG7LrSXnrEULm7j2cTPvMSY4FX9Ne7LRN2bHh77EcL-9xxb1W4
// https://hackernoon.com/package-your-react-app-with-spring-boot-a-how-to-guide-cdfm329w
// http://localhost:8888/invoice/
package com.forlizzi.springboot.mvc.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.forlizzi.springboot.mvc.crud.example")
@ComponentScan("com.forlizzi.springboot.mvc.crud.example")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}