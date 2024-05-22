package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.DataEntity;

public interface DataService {

	DataEntity insertData(DataEntity value);

	List<DataEntity> pullData();

	Optional<DataEntity> pullDataById(Long id);

	void deleteData();
	
	void delDataById(Long id);

	DataEntity updateData(DataEntity value, Long id);

	

}
