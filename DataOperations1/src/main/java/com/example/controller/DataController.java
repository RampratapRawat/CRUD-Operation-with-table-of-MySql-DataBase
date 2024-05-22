package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.example.entity.DataEntity;
import com.example.service.DataService;

@RestController
public class DataController {
    private DataService service;

	public DataController(DataService service) {
		super();
		this.service = service;
	}
	
	//Post the data inside table
	@PostMapping("/insert")
	public DataEntity change1(@RequestBody DataEntity value) {
		return service.insertData(value);
	}
	
	//Get all data from inside the table
	@GetMapping("/check")
	public List<DataEntity> change2(){
		return service.pullData();
	}
	
	//Get DataRow from table by Id 
	@GetMapping("/check/{id}")
	public Optional<DataEntity> change3(@PathVariable Long id) {
		return service.pullDataById(id);
	}
	
	//Delete all data from table
	@DeleteMapping("/del")
	public String change4() {
		service.deleteData();
		return "Your table data has been drop";
	}
	
	//Delete rowdata from table by id
	@DeleteMapping("/del/{id}")
	public String change5(@PathVariable Long id){
		service.delDataById(id);
		return "Id row has been deleted";
	}
	
	//for update the table data
	@PutMapping("/update/{id}")
	public DataEntity change6(@PathVariable Long id, @RequestBody DataEntity value) {
		return service.updateData(value,id);
	}
}
