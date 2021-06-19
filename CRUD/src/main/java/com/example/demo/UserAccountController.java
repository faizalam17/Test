package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {

	@Autowired
	private UserAccountsService service;
	
	@GetMapping("/userAccounts")
	public List<UserAccounts> listAccounts(){
		return service.listAllAccounts();
	}
	
	@GetMapping("/userAccounts/{id")
	public ResponseEntity<UserAccounts> get(@PathVariable Long id) {
		try {
			UserAccounts userAccounts=service.get(id);	
			return new ResponseEntity<UserAccounts>(userAccounts,HttpStatus.OK);
		}
		catch(NoSuchElementException ex) {
			return new ResponseEntity<UserAccounts>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/userAccounts")
	public void add(@RequestBody UserAccounts userAccounts) {
		service.create(userAccounts);
	}
	
	@PutMapping("/userAccounts/{id}")
	public ResponseEntity<UserAccounts> update(@RequestBody UserAccounts userAccounts,@PathVariable Long id) {
		try {
			UserAccounts currentUser=service.get(id);
			service.create(userAccounts);
			return new ResponseEntity<UserAccounts>(HttpStatus.OK);
		}
		catch(NoSuchElementException ex) {
			return new ResponseEntity<UserAccounts>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/userAccounts/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	
}
