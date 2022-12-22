package com.wyattlocke.projectmanager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wyattlocke.projectmanager.models.Checklist;
import com.wyattlocke.projectmanager.models.Project;
import com.wyattlocke.projectmanager.services.ChecklistService;
import com.wyattlocke.projectmanager.services.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ChecklistService checklistService; 
	
	//Render Project Dash
	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("projects", projectService.allProjects());
		return "index.jsp";
	}
	
	//Render Show Project
	@GetMapping("/project/{id}")
	public String showProject(@PathVariable("id") Long id, Model model) {
		model.addAttribute("project", projectService.findProject(id));
		model.addAttribute("checklist", checklistService.findChecklist(id));
		return "showProject.jsp";
	}
	
	//Render Read-Only Project
	@GetMapping("/project/readonly")
	public String showReadOnlyProject(@RequestParam(value="code", required=true) String code, Model model) {
		model.addAttribute("project", projectService.findProjectByCode(code));
		Project project = projectService.findProjectByCode(code);
		model.addAttribute("checklist", checklistService.findChecklist(project.getChecklist().getId()));
		
		return "showReadOnly.jsp";
	}
	
	//Render New Project
	@GetMapping("/project/new")
	public String newProject(@ModelAttribute("project") Project project) {
		return "newProject.jsp";
	}
	
	//Process New Project
	@PostMapping("/project/new")
	public String createProject(@Valid @ModelAttribute("project") Project project,
			BindingResult result) {
		if(result.hasErrors()) {
			return "newProject.jsp";
		}
		projectService.createProject(project);
		
		Checklist checklist = new Checklist();
		checklist.setProject(project);
		checklistService.createChecklist(checklist);
		
		return "redirect:/";
	}
}
