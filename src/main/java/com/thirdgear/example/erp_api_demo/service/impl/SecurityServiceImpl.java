package com.thirdgear.example.erp_api_demo.service.impl;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.service.SecurityService;

@Service("SecurityService")
public class SecurityServiceImpl implements SecurityService{

	@Override
	public boolean isTokenValid(String token) {
		if(token==null) {
			return false;
		}
        // TODO: Perform third-party API call
        return token.equals("12345");
	}
	
}
