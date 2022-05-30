package com.hems.kennzeichen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hems.kennzeichen.entity.Kennzeichen;
import com.hems.kennzeichen.service.KennzeichenService;

@Controller
public class KennzeichenController {
	
	@Autowired
	private KennzeichenService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Kennzeichen> listKennzeichen = service.listAll();
		model.addAttribute("listKennzeichen", listKennzeichen);
		return "index";
	}
	@RequestMapping("/new")
	public String showNewKennzeichenPage(Model model) {
		Kennzeichen kennzeichen = new Kennzeichen();
		model.addAttribute("kennzeichen", kennzeichen);
		
		return "new_kennzeichen";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveKennzeichen(@ModelAttribute("kennzeichen")Kennzeichen kennzeichen) {
		service.save(kennzeichen);
		
		return "redirect:/";
	}
		
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditKennzeichenPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_kennzeichen");
		Kennzeichen kennzeichen = service.get(id);
		mav.addObject("kennzeichen", kennzeichen);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteKennzeichen(@PathVariable(name = "id" )int id) {
		service.delete(id);
		return "redirect:/";
	}
	
	
}
