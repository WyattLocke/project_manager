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

import com.wyattlocke.projectmanager.models.FundraisingItem;
import com.wyattlocke.projectmanager.services.FundraisingItemService;
import com.wyattlocke.projectmanager.services.ProjectService;

@Controller
public class FundraisingItemController {

	@Autowired
	private FundraisingItemService itemService;
	
	@Autowired
	private ProjectService projectService;
	
	//Render New Item
	@GetMapping("/item/new/{projectId}")
	public String newItem(@PathVariable("projectId") Long projectId,
			@ModelAttribute("fundraisingItem") FundraisingItem fundraisingItem,
			Model model) {
		model.addAttribute("project", projectService.findProject(projectId));
		return "newItem.jsp";
	}
	
	//Process New Item
	@PostMapping("/item/new/{projectId}")
	public String newItem(@Valid @ModelAttribute("fundrasingItem") FundraisingItem fundraisingItem,
			BindingResult result, @PathVariable("projectId") Long projectId) {
		if(result.hasErrors()) {
			return "newItem.jsp";
		}
		itemService.createItem(fundraisingItem);
		return "redirect:/project/{projectId}";
	}
	
	//Delete
		@DeleteMapping("/item/delete/{projectId}/{itemId}")
		public String destroySponsor(@PathVariable("itemId") Long itemId,
				@PathVariable("projectId") Long projectId) {
			itemService.deleteItem(itemId);
			return "redirect:/project/{projectId}";
		}
}
