package com.Programz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.Programz"})
public class ProgramzApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramzApplication.class, args);
	}

}
