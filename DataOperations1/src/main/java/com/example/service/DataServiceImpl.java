package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entity.DataEntity;
import com.example.repository.DataRepository;
@Service
public class DataServiceImpl implements DataService {
	private DataRepository repo;

	public DataServiceImpl(DataRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public DataEntity insertData(DataEntity value) {
		return repo.save(value);
	}

	@Override
	public List<DataEntity> pullData() {
		return repo.findAll();
	}

	@Override
	public Optional<DataEntity> pullDataById(Long id) {
		return repo.findById(id);
	}

	@Override
	public void deleteData() {
		repo.deleteAll();
	
	}

	@Override
	public void delDataById(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public DataEntity updateData(DataEntity value, Long id) {
		Optional<DataEntity> entity=repo.findById(id);
		if(entity.isPresent()) {
			DataEntity num=entity.get();
			num.setId(value.getId());
			num.setName(value.getName());
			num.setSurname(value.getSurname());
			num.setCity(value.getCity());
		
		return repo.save(num);}
		else {
			throw new RuntimeException("Id is not found"); 
		}
	}

}
