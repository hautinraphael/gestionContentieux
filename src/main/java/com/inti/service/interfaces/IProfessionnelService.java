package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Professionnel;

public interface IProfessionnelService {
	List<Professionnel> findAll();

	Professionnel findOne(Long id);

	Professionnel save(Professionnel professionnel);

	void delete(Long id);

}
