package com.waheed.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.waheed.erp.model.Purchase;
import com.waheed.erp.service.PurchaseService;
import com.waheed.erp.service.impl.PurchaseServiceImpl;

 
@Controller
public class Helloworld {
	private PurchaseService purchaseService;
	
	@Autowired(required=true)
	
	public void setPersonService(PurchaseService ps){
		this.purchaseService = ps;
	}
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", "This is ");
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping(value = "/purchase", method = RequestMethod.GET)
	public String purchaseForm(Model model) {
		model.addAttribute("purchase", new Purchase());
		return "purchaseForm";
	}
	
	@RequestMapping(value = "/addPurchase", method = RequestMethod.POST)
	public String addPurchase(@ModelAttribute("purchase") Purchase p) {
		
		if(p.getPurchaseId() == 0){
			//new person, add it
			this.purchaseService.addPurchase(p);
		}else{
			//existing person, call update
			this.purchaseService.updatePurchase(p);
		}
		return "redirect:/purchase";
	}
	
	
	
	
	
	
	
	
	
}


