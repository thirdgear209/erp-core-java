package com.thirdgear.example.erp_api_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.entity.Tank;
import com.thirdgear.example.erp_api_demo.repo.TankRepository;
import com.thirdgear.example.erp_api_demo.service.TankService;

public class TankServiceImpl implements TankService{
	
	@Autowired
	private TankRepository repo;

	@Override
	public Iterable<Tank> getTanks() {
		return repo.findAll();
	}
	
	
	
}