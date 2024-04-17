package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ACMCollectionService;

import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/apis")
@NoArgsConstructor
public class ACMCollectionController {

	@Autowired
	private ACMCollectionService s;
	

	@GetMapping("/NbDossierByCollectionType")
	public ResponseEntity<Void> getNombreDossierByCollectionType(){
		s.indexVoletCollectionByCollectionType();
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/NbDossierByOwnerName")
	public ResponseEntity<Void> getNombreDossierByOwnerName(){
		s.indexVoletCollectionByOwnerName();
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/NbDossierByCustomerName")
	public ResponseEntity<Void> getNombreDossierByCustomerName(){
		s.indexVoletCollectionByCustomerName();
		return ResponseEntity.ok().build();
	}	
	
	@GetMapping("/NbDossierByStatut")
	public ResponseEntity<Void> getNombreDossierByStaut(){
		s.indexVoletCollectionByStatut();
		return ResponseEntity.ok().build();
	}	
	
	@GetMapping("/NbDossierByBranch")
	public ResponseEntity<Void> getNombreDossierByBranch(){
		s.indexVoletCollectionByBranch();
		return ResponseEntity.ok().build();
	}	
}



