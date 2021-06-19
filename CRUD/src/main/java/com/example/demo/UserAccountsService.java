package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountsService {
	
	@Autowired
	private UserAccountsRepository repo;
	
	public List<UserAccounts> listAllAccounts(){
		return repo.findAll();
	}
	
	public void create(UserAccounts userAccounts) {
		repo.save(userAccounts);
	}
	
	public UserAccounts get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
