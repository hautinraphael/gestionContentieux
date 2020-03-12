package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Document;
import com.inti.service.interfaces.IDocumentService;

@RestController
public class DocumentController {
	@Autowired
	IDocumentService documentService;

	@RequestMapping(value = "documents", method = RequestMethod.GET)
	public List<Document> findAll() {
		return documentService.findAll();
	}

	@RequestMapping(value = "documents/{idDocument}", method = RequestMethod.GET)
	public Document findOne(@PathVariable("idDocument") Long id) {
		return documentService.findOne(id);
	}

	@RequestMapping(value = "documents", method = RequestMethod.POST)
	public Document saveDocument(@RequestBody Document document) {
		return documentService.save(document);
	}

	@RequestMapping(value = "documents/{idDocument}", method = RequestMethod.DELETE)
	public void deleteDocument(@PathVariable("idDocument") Long id) {
		documentService.delete(id);
	}

	@RequestMapping(value = "documents/{idDocument}", method = RequestMethod.PUT)
	public Document updateDocument(@PathVariable("idDocument") Long id, @RequestBody Document document) {
		Document currentDocument = documentService.findOne(id);
		currentDocument.setDateCreationDoc(document.getDateCreationDoc());
		currentDocument.setNomDoc(document.getNomDoc());
		currentDocument.setDescriptionDoc(document.getDescriptionDoc());
		currentDocument.setAffaire(document.getAffaire());
		return documentService.save(currentDocument);
	}
}
