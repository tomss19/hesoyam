package com.hesoyam.hesoyam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HesoyamApplication {

	public static void main(String[] args) {
		SpringApplication.run(HesoyamApplication.class, args);
	}
        @GetMapping("/hello")
        public String hello(@RequestParam(value = "TOMS", defaultValue = "World") String name) {
                return String.format("Hello %s!", name);
        }
}
