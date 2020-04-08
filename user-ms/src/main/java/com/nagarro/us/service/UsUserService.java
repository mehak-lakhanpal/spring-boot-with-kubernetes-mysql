package com.nagarro.us.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.us.entity.UsUserVO;
import com.nagarro.us.repository.UsUserRepository;

@Service
public class UsUserService {
	
	@Autowired
	private UsUserRepository usUserRepository;
	
	public UsUserVO getUserDetails(Long id) {
		return usUserRepository.getOne(id);
	}
	
}
