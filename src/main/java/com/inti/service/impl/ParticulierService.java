package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Particulier;
import com.inti.repositories.ParticulierRepository;
import com.inti.service.interfaces.IParticulierService;

@Service
public class ParticulierService implements IParticulierService {
	
	@Autowired
	ParticulierRepository particulierRepository;

	@Override
	public List<Particulier> findAll() {
		return particulierRepository.findAll();
	}

	@Override
	public Particulier findOne(Long id) {
		return particulierRepository.findOne(id);
	}

	@Override
	public Particulier save(Particulier particulier) {
		return particulierRepository.save(particulier);
	}

	@Override
	public void delete(Long id) {
		particulierRepository.delete(id);
	}

}
