package com.example.manytoone.service;

import java.util.List;

import com.example.manytoone.entity.Org;

public interface OrgService {
	Org addOrg(Org org);
	Org updateOrg(Org org);
	List<Org> getOrgs();
	void deleteOrg(int id);
}
