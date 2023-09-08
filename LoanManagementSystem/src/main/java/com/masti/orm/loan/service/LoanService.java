package com.masti.orm.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masti.orm.loan.dao.LoanDAO;



@Service
public class LoanService {
	
	@Autowired
	private LoanDAO loandao;
	

}
