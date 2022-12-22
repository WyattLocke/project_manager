package com.wyattlocke.projectmanager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wyattlocke.projectmanager.models.Personnel;
import com.wyattlocke.projectmanager.services.PersonnelService;
import com.wyattlocke.projectmanager.services.ProjectService;

@Controller
public class PersonnelController {

	@Autowired
	private PersonnelService personnelService;
	
	@Autowired
	private ProjectService projectService;
	
	//Render New Personnel
	@GetMapping("/personnel/new/{projectId}")
	public String newPersonnel(@PathVariable("projectId") Long projectId,
			@ModelAttribute("personnel") Personnel personnel, Model model) {
		model.addAttribute("project", projectService.findProject(projectId));
		return "newPersonnel.jsp";
	}
	
	//Process New Personnel
	@PostMapping("/personnel/new/{projectId}")
	public String newPersonnel(@Valid @ModelAttribute("personnel") Personnel personnel,
			BindingResult result, @PathVariable("projectId") Long projectId) {
		if(result.hasErrors()) {
			return "newPersonnel.jsp";
		}
		personnelService.createPersonnel(personnel);
		return "redirect:/project/{projectId}";
	}
	
	//Delete
		@DeleteMapping("/personnel/delete/{projectId}/{personnelId}")
		public String destroySponsor(@PathVariable("personnelId") Long personnelId,
				@PathVariable("projectId") Long projectId) {
			personnelService.deletePersonnel(personnelId);
			return "redirect:/project/{projectId}";
		}
}
