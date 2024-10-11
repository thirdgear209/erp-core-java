package com.thirdgear.example.erp_api_demo.controller;

@RestController
@RequestMapping("/tanks")
public class TankController {
	
    @Autowired
    TankService tankService;

    @GetMapping
    public Iterable<Tank> getTanks(){
    	Iterable<Tank> tanks =  tankService.getTanks();
        return tanks;
    } 
    

}
