package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ACMLoanService;

import lombok.NoArgsConstructor;


@RestController
@RequestMapping("/apis")
@NoArgsConstructor
public class ACMLoanController {

	@Autowired
	private ACMLoanService s;
	
	
	
	
}
