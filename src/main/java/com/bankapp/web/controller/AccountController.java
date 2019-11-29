package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

import com.bankapp.model.entities.Account;
import com.bankapp.model.service.AccountService;

@Controller
public class AccountController {

	@GetMapping("/accountmgt")
	public String accountMenu(){
		return "account_mgt";
	}
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/allaccounts")
	public ModelAndView allAccounts(ModelAndView mv){
		mv.addObject("accounts", accountService.getAllAccounts());
		mv.setViewName("allaccounts");
		return mv;
	}
	
}








