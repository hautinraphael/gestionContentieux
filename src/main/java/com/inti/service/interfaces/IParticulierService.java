package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Particulier;

public interface IParticulierService {
	List<Particulier> findAll();

	Particulier findOne(Long id);

	Particulier save(Particulier particulier);

	void delete(Long id);

}
