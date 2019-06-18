package com.ibm.jmatos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Autowired
	private ProfileRepository repository;
	
	@GetMapping("/profile/all")
	public List<Profile> retrieveAll() {
		return repository.findAll();
	}
	
	
	//
	@PostMapping("/profile/add")
	public Profile save(@RequestBody Profile profile){
		return repository.save(profile);
	}
}
