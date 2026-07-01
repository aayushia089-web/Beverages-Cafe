package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Beverage;
import com.example.demo.exception.BeverageSavedException;
import com.example.demo.repository.BeverageMongoRepository;

@Service
public class BeverageService {

	@Autowired
	private BeverageMongoRepository beverageMongoRepository;

	public Beverage addRecord(Beverage record) {
		Beverage savedRecord = beverageMongoRepository.save(record);

		if (savedRecord == null)
			throw new BeverageSavedException("Record Saved - Failed");
		return savedRecord;
	}

	public List<Beverage> addAllRecords(List<Beverage> records) {
		List<Beverage> savedRecords = beverageMongoRepository.saveAll(records);
		if (savedRecords.isEmpty())
			throw new BeverageSavedException("Record Saved - Failed");
		return savedRecords;
	}
}
