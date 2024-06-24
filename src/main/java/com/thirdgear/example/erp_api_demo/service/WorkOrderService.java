package com.thirdgear.example.erp_api_demo.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.entity.WorkOrder;

@Service("WorkOrder")
public interface WorkOrderService{
	
	public Iterable<WorkOrder>getWorkOrders();
	
}