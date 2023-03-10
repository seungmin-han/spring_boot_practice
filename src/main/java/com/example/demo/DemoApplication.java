package com.example.demo;

import java.io.File;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.TempDTO;
import com.example.demo.service.TempService;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	TempService tempService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/temp")
	public ArrayList<TempDTO> temp() {
		return tempService.getItems();
	}

	@PostMapping("/file")
	public File fileUpload(@RequestParam(value = "files") MultipartFile[] files) {
		File file = new File(files[0].getOriginalFilename());
		try {
			files[0].transferTo(file);
		} catch(Exception exception) {
			System.err.println(exception);
		}
		
		return file;
	}

}
