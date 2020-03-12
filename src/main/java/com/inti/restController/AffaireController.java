package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Affaire;
import com.inti.service.interfaces.IAffaireService;

@CrossOrigin
@RestController
public class AffaireController {
	@Autowired
	IAffaireService affaireService;

	@RequestMapping(value = "affaires", method = RequestMethod.GET)
	public List<Affaire> findAll() {
		return affaireService.findAll();
	}

	@RequestMapping(value = "affaires/{idAffaire}", method = RequestMethod.GET)
	public Affaire findOne(@PathVariable("idAffaire") Long id) {
		return affaireService.findOne(id);
	}

	@RequestMapping(value = "affaires", method = RequestMethod.POST)
	public Affaire saveAffaire(@RequestBody Affaire affaire) {
		return affaireService.save(affaire);
	}

	@RequestMapping(value = "affaires/{idAffaire}", method = RequestMethod.DELETE)
	public void deleteAffaire(@PathVariable("idAffaire") Long id) {
		affaireService.delete(id);
	}

	@RequestMapping(value = "affaires/{idAffaire}", method = RequestMethod.PUT)
	public Affaire updateAffaire(@PathVariable("idAffaire") Long id, @RequestBody Affaire affaire) {
		Affaire currentAffaire = affaireService.findOne(id);
		currentAffaire.setReference(affaire.getReference());
		currentAffaire.setTitreAffaire(affaire.getTitreAffaire());
		currentAffaire.setDescriptionAffaire(affaire.getDescriptionAffaire());
		currentAffaire.setStatutAffaire(affaire.getStatutAffaire());
		currentAffaire.setDocuments(affaire.getDocuments());
		currentAffaire.setTaches(affaire.getTaches());
		return affaireService.save(currentAffaire);
	}

}
