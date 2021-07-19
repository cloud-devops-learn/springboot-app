package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springboot.controller.EmployeeController;
import com.springboot.service.EmployeeService;

//@ComponentScan("com.springboot.controller")
//@ComponentScan(basePackageClasses = EmployeeController.class)
//@ComponentScan(basePackageClasses = EmployeeService.class)
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackageClasses = EmployeeController.class)
//@EnableJpaRepositories("com.springboot.repository")
//@ComponentScan(basePackages="com.springboot.controller")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
