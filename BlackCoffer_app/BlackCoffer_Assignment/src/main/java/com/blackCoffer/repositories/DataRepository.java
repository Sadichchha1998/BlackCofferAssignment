package com.blackCoffer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackCoffer.entities.DataEntity;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Integer> {

}