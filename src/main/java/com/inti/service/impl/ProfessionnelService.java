package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Professionnel;
import com.inti.repositories.ProfessionnelRepository;
import com.inti.service.interfaces.IProfessionnelService;

@Service
public class ProfessionnelService implements IProfessionnelService {
	
	@Autowired
	ProfessionnelRepository professionnelRepository;

	@Override
	public List<Professionnel> findAll() {
		return professionnelRepository.findAll();
	}

	@Override
	public Professionnel findOne(Long id) {
		return professionnelRepository.findOne(id);
	}

	@Override
	public Professionnel save(Professionnel professionnel) {
		return professionnelRepository.save(professionnel);
	}

	@Override
	public void delete(Long id) {
		professionnelRepository.delete(id);
	}

}
