package com.example.manytoone.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manytoone.entity.Org;
import com.example.manytoone.repository.OrgRepository;
import com.example.manytoone.service.OrgService;
@Service
public class OrgServiceImple implements OrgService {

	private	OrgRepository orgRepository;

	
	
	public OrgServiceImple(OrgRepository orgRepository) {
		super();
		this.orgRepository = orgRepository;
	}

	@Override
	public Org addOrg(Org org) {
		Org o1=orgRepository.save(org);
		return o1;
	}

	@Override
	public Org updateOrg(Org org) {
		Org o1=orgRepository.findById(org.getRegNo()).get();
		o1.setName(org.getName());
		o1.setCity(org.getCity());
		Org o2=orgRepository.save(o1);
		return o2;
	}

	@Override
	public List<Org> getOrgs() {
		List<Org> l1=orgRepository.findAll();
		return l1;
	}

	@Override
	public void deleteOrg(int id) {
		orgRepository.deleteById(id);

	}

}
