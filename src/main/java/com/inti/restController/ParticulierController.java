package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Particulier;
import com.inti.service.interfaces.IParticulierService;

@RestController
public class ParticulierController {
	@Autowired
	IParticulierService particulierService;

	@RequestMapping(value = "particuliers", method = RequestMethod.GET)
	public List<Particulier> findAll() {
		return particulierService.findAll();
	}

	@RequestMapping(value = "particuliers/{idParticulier}", method = RequestMethod.GET)
	public Particulier findOne(@PathVariable("idParticulier") Long id) {
		return particulierService.findOne(id);
	}

	@RequestMapping(value = "particuliers", method = RequestMethod.POST)
	public Particulier saveParticulier(@RequestBody Particulier particulier) {
		return particulierService.save(particulier);
	}

	@RequestMapping(value = "particuliers/{idParticulier}", method = RequestMethod.DELETE)
	public void deleteParticulier(@PathVariable("idParticulier") Long id) {
		particulierService.delete(id);
	}

	@RequestMapping(value = "particuliers/{idParticulier}", method = RequestMethod.PUT)
	public Particulier updateParticulier(@PathVariable("idParticulier") Long id, @RequestBody Particulier particulier) {
		Particulier currentParticulier = particulierService.findOne(id);
		currentParticulier.setCin(particulier.getCin());
		currentParticulier.setNomParticulier(particulier.getNomParticulier());
		currentParticulier.setPrenomParticulier(particulier.getPrenomParticulier());
		return particulierService.save(currentParticulier);
	}
	
}
