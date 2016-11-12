package br.com.unilago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unilago.dao.DataRepository;
import br.com.unilago.dao.MatrizRepository;
import br.com.unilago.model.ControleAcesso;

@Controller
public class MatrizController {
	
	@Autowired
	private MatrizRepository service;
	
	@Autowired
	private DataRepository repo;
	
	@RequestMapping("/matriz")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("lista-matriz");
		mv.addObject("objetos", repo.getObjetos());
		mv.addObject("sujeitos", repo.getSujeitos());
		mv.addObject("view", new ControleAcesso());
		return mv;
	}
	
	@RequestMapping(value = "/matriz-valid", method = RequestMethod.POST)
	public ModelAndView validar(ControleAcesso view){
	
		ModelAndView mv = new ModelAndView("lista-matriz");
		mv.addObject("objetos", repo.getObjetos());
		mv.addObject("sujeitos", repo.getSujeitos());
		mv.addObject("view", new ControleAcesso());
		
		
		mv.addObject("checkMsg", service.validar(view));
		
		
		return mv;
	}

}
