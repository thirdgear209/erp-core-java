
package com.thirdgear.example.erp_api_demo.entity;
import javax.persistence.*;
import java.lang.Long;


@Entity
@Table(name="operation-code")
public class OperationCode{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String name;
	
}