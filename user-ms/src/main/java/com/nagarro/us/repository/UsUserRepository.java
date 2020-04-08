package com.nagarro.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.us.entity.UsUserVO;

public interface UsUserRepository extends JpaRepository<UsUserVO, Long> {
	
}
