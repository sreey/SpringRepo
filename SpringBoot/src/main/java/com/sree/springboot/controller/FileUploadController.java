package com.sree.springboot.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

	//Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "C://temp//";
	
    @PostMapping("/upload") // //new annotation since 4.3
	public void singleFileUpload(@RequestParam("file") MultipartFile file){
		try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            System.out.println("Uploaded FileName"+file.getOriginalFilename());
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
}
