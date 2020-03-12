package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Phase;
import com.inti.service.interfaces.IPhaseService;

@RestController
public class PhaseController {
	@Autowired
	IPhaseService phaseService;

	@RequestMapping(value = "phases", method = RequestMethod.GET)
	public List<Phase> findAll() {
		return phaseService.findAll();
	}

	@RequestMapping(value = "phases/{idPhase}", method = RequestMethod.GET)
	public Phase findOne(@PathVariable("idPhase") Long id) {
		return phaseService.findOne(id);
	}

	@RequestMapping(value = "phases", method = RequestMethod.POST)
	public Phase savePhase(@RequestBody Phase phase) {
		return phaseService.save(phase);
	}

	@RequestMapping(value = "phases/{idPhase}", method = RequestMethod.DELETE)
	public void deletePhase(@PathVariable("idPhase") Long id) {
		phaseService.delete(id);
	}

	@RequestMapping(value = "phases/{idPhase}", method = RequestMethod.PUT)
	public Phase updatePhase(@PathVariable("idPhase") Long id, @RequestBody Phase phase) {
		Phase currentPhase = phaseService.findOne(id);
		currentPhase.setNomPhase(phase.getNomPhase());
		currentPhase.setDateDebutPhase(phase.getDateDebutPhase());
		currentPhase.setDateFinPhase(phase.getDateFinPhase());
		currentPhase.setTache(phase.getTache());
		return phaseService.save(currentPhase);
	}

}
