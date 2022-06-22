package com.mosa.gestions.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.mosa.gestions.entities.Reclamation;

import com.mosa.gestions.service.RecService;


@Controller
public class RecController {
	@Autowired
	RecService recService;

	
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap)
	{
		
	    
	    Reclamation prod = new Reclamation();
	    //affedter une catégorie par défaut au produit pour éviter le pb avec une catégorie null
        modelMap.addAttribute("reclamation",prod);
        modelMap.addAttribute("mode", "new");
    
        return "formRec";
	}
	@RequestMapping("/saveRec")
	public String saveRec(@Valid Reclamation produit, BindingResult bindingResult) {
	
		if (bindingResult.hasErrors()) return "formRec";
		recService.saveReclamation(produit);
	return "redirect:/ListeRecs";
	}
	
	@RequestMapping("/ListeRecs")
	public String listeRecs(ModelMap modelMap,

	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)

	{
	Page<Reclamation> prods = recService.getAllReclamationsParPage(page, size);
	modelMap.addAttribute("reclamations", prods);

	modelMap.addAttribute("pages", new int[prods.getTotalPages()]);

	modelMap.addAttribute("currentPage", page);
	return "listeRecs";
	}
	
	@RequestMapping("/supprimerRec")
	public String supprimerRec(@RequestParam("id") Long id,
	ModelMap modelMap,
	
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
		recService.deleteReclamationById(id);
		Page<Reclamation> prods = recService.getAllReclamationsParPage(page,

		size);

		modelMap.addAttribute("reclamations", prods);
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		modelMap.addAttribute("size", size);
		return "listeRecs";
	}
	
	
	@RequestMapping("/modifierRec")
	public String editerRec(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Reclamation p= recService.getReclamation(id);
		
	modelMap.addAttribute("reclamation", p);
	modelMap.addAttribute("mode", "edit");
	return "formRec";
	}
	@RequestMapping("/updateRec")
	public String updateRec(@ModelAttribute("produit") Reclamation produit,
	@RequestParam("date") String date,
	ModelMap modelMap) throws ParseException

	{
	//conversion de la date

	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date datePla = dateformat.parse(String.valueOf(date));
	produit.setDatePla(datePla);
	recService.updateReclamation(produit);
	List<Reclamation> prods = recService.getAllReclamations();
	modelMap.addAttribute("reclamations", prods);
	return "listeRecs";
	}
	
}
