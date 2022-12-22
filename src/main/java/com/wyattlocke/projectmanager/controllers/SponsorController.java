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

import com.wyattlocke.projectmanager.models.Sponsor;
import com.wyattlocke.projectmanager.services.ProjectService;
import com.wyattlocke.projectmanager.services.SponsorService;

@Controller
public class SponsorController {

	@Autowired
	private SponsorService sponsorService;
	
	@Autowired
	private ProjectService projectService;
	
	//Render New Sponsor
	@GetMapping("/sponsor/new/{projectId}")
	public String newSponsor(@PathVariable("projectId") Long projectId, @ModelAttribute("sponsor") Sponsor sponsor,
			Model model) {
		model.addAttribute("project", projectService.findProject(projectId));
		return "newSponsor.jsp";
	}
	
	//Process New Sponsor
	@PostMapping("/sponsor/new/{projectId}")
	public String newSponsor(@Valid @ModelAttribute("sponsor") Sponsor sponsor, 
			BindingResult result, @PathVariable("projectId") Long projectId) {
		if(result.hasErrors()) {
			return "newSponsor.jsp";
		}
		sponsorService.createSponsor(sponsor);
		return "redirect:/project/{projectId}";
	}
	
	//Delete
	@DeleteMapping("/sponsor/delete/{projectId}/{sponsorId}")
	public String destroySponsor(@PathVariable("sponsorId") Long sponsorId,
			@PathVariable("projectId") Long projectId) {
		sponsorService.deleteSponsor(sponsorId);
		return "redirect:/project/{projectId}";
	}
}
