package com.thirdgear.example.erp_api_demo.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.entity.OperationCode;

@Service("OperationCode")
public interface OperationCodeService{

    public Iterable<OperationCode>getOperationCodes();
}