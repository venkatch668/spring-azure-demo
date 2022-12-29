package com.javatechie.azure.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

	List<String> names =  new ArrayList<String>();

	@GetMapping("/")
	public String welcome(){
		return "welcome venkat";
	}
	
	@GetMapping("/getnames")
	public List<String> getNames(){
		return names;
	}
	
	@PostMapping("/getnames")
	public String appendName(@RequestParam String name){
		names.add(name);
		return "added successfully";
	}
	
	@DeleteMapping("/getnames")
	public String clearNames(){
		names = new ArrayList<String>();
		return "cleared sucessfully";
	}
	
}
