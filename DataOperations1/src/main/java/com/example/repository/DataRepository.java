package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity,Long>  {

}
