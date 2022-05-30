package com.hems.kennzeichen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hems.kennzeichen.entity.Kennzeichen;
import com.hems.kennzeichen.repository.KennzeichenRepository;


@Service
@Transactional
public class KennzeichenService {
	
	@Autowired
	private KennzeichenRepository repo;
	
	public List<Kennzeichen> listAll() {
		return repo.findAll();
	}
	
	public void save(Kennzeichen kennzeichen) {
		repo.save(kennzeichen);
	}
	
	public Kennzeichen get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public List<Kennzeichen> findAllByAutokennzeichen(String autokennzeichen) {
		return repo.findAllByAutokennzeichen(autokennzeichen);
	}

}
