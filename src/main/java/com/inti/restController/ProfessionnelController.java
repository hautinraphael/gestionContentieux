package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Professionnel;
import com.inti.service.interfaces.IProfessionnelService;

@CrossOrigin
@RestController
public class ProfessionnelController {
	@Autowired
	IProfessionnelService professionnelService;

	@RequestMapping(value = "professionnels", method = RequestMethod.GET)
	public List<Professionnel> findAll() {
		return professionnelService.findAll();
	}

	@RequestMapping(value = "professionnels/{idProfessionnel}", method = RequestMethod.GET)
	public Professionnel findOne(@PathVariable("idProfessionnel") Long id) {
		return professionnelService.findOne(id);
	}

	@RequestMapping(value = "professionnels", method = RequestMethod.POST)
	public Professionnel saveProfessionnel(@RequestBody Professionnel professionnel) {
		return professionnelService.save(professionnel);
	}

	@RequestMapping(value = "professionnels/{idProfessionnel}", method = RequestMethod.DELETE)
	public void deleteProfessionnel(@PathVariable("idProfessionnel") Long id) {
		professionnelService.delete(id);
	}

	@RequestMapping(value = "professionnels/{idProfessionnel}", method = RequestMethod.PUT)
	public Professionnel updateProfessionnel(@PathVariable("idProfessionnel") Long id, @RequestBody Professionnel professionnel) {
		Professionnel currentProfessionnel = professionnelService.findOne(id);
		currentProfessionnel.setRaisonSociale(professionnel.getRaisonSociale());
		return professionnelService.save(currentProfessionnel);
	}

}
