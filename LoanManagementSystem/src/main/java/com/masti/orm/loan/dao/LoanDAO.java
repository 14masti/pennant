package com.masti.orm.loan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class LoanDAO {
	
	@PersistenceContext
	private EntityManager em;

}
