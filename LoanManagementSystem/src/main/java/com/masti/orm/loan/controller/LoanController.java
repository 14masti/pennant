package com.masti.orm.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.masti.orm.loan.model.LoanInputApplication;
import com.masti.orm.loan.service.LoanService;


@Controller
public class LoanController {
	
	private LoanService loanser;
	
	@Autowired
	public void LoanController(LoanService loanser)
	{
		this.loanser=loanser;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {	
		return "demo";
	}
	
	@RequestMapping(value = "/submitLoanApplication", method = RequestMethod.GET)
	public String LoanInput(@ModelAttribute("loanInputApplication") LoanInputApplication lnInput) {	
		System.out.println(lnInput);
		
		
		return "demo";
	}
}
