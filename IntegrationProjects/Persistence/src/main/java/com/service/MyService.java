package com.service;

import javax.persistence.EntityManager;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.entity.mng.Student;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

@Singleton
public class MyService implements IntService {

	@Inject
	Provider<EntityManager> emp;


	@Override
	@Transactional
	public void finds(int id,String name,int age) {

		EntityManager em=emp.get();
		System.out.println("Done");

	}

}
