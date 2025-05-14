package com.example.manytoone.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytoone.entity.Org;

import com.example.manytoone.serviceimple.OrgServiceImple;

@RestController
@RequestMapping("Org")
public class OrgController {
	private	OrgServiceImple orgServiceImple;

	public OrgController(OrgServiceImple orgServiceImple) {
		super();
		this.orgServiceImple = orgServiceImple;
	}

	@PostMapping
	public ResponseEntity<Org> addEntity(@RequestBody Org Org)
	{
		Org e1=orgServiceImple.addOrg(Org);
		return new ResponseEntity<Org>(e1, HttpStatus.CREATED);

	}
	@GetMapping
	public ResponseEntity<List<Org>> getEntity()
	{
		List<Org> e1=orgServiceImple.getOrgs();
		return new ResponseEntity<List<Org>>(e1, HttpStatus.OK);

	}


}
