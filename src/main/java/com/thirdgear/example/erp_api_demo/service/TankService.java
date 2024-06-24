package com.thirdgear.example.erp_api_demo.service;
import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.entity.Tank;

@Service("Tank")
public interface TankService{
	
	public Iterable<Tank>getTanks();
}