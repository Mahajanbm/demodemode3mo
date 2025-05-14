package com.example.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytoone.entity.Org;

public interface OrgRepository extends JpaRepository<Org, Integer> {

}
