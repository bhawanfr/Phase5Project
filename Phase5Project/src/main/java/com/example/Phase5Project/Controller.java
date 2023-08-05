package com.example.Phase5Project;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/
@RestController
public class Controller {
	Logger log=LoggerFactory.getLogger(Controller.class);
	@GetMapping("/add")
	public String add(@RequestParam double num1, @RequestParam double num2) {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Add Operation At " + localDateTime);
		return String.valueOf(num1 + num2);
	}

	@GetMapping("/subtract")
	public String subtract(@RequestParam double num1, @RequestParam double num2) {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Subtract Operation At " + localDateTime);
		return String.valueOf(num1 - num2);
	}

	@GetMapping("/multiply")
	public String multiply(@RequestParam double num1, @RequestParam double num2) {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Multiply Operation At " + localDateTime);
		return String.valueOf(num1 * num2);
	}

	@GetMapping("/divide")
	public String divide(@RequestParam double num1, @RequestParam double num2) {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Divide Operation At " + localDateTime);
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return String.valueOf(num1 / num2);
	}
}
