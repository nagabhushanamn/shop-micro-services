package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping
	public Account create(@RequestBody Account account) {
		return accountRepository.save(account);
	}

	@GetMapping
	public List<Account> list() {
		return accountRepository.findAll();
	}
	
	@GetMapping(value="/{user}")
	public Account list(@PathVariable String user) {
		return accountRepository.findOne(user);
	}
	
	

}
