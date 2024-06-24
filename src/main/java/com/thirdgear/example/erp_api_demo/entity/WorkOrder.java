package com.thirdgear.example.erp_api_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="work-order")
public class WorkOrder{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
}