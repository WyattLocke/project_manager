package com.wyattlocke.projectmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.wyattlocke.projectmanager.models.Checklist;
import com.wyattlocke.projectmanager.services.ChecklistService;

@Controller
public class ChecklistController {

	@Autowired
	private ChecklistService checklistService;
	
	//Change Venue
	@PutMapping("/venue/change/{projectId}/{id}")
	public String changeVenue(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getVenue().equals("in progress")) {
			checklist.setVenue("complete");
		}
		else if (checklist.getVenue().equals("complete")) {
			checklist.setVenue("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Catering
	@PutMapping("/catering/change/{projectId}/{id}")
	public String changeCatering(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getCatering().equals("in progress")) {
			checklist.setCatering("complete");
		}
		else if (checklist.getCatering().equals("complete")) {
			checklist.setCatering("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Entertainment
	@PutMapping("/entertainment/change/{projectId}/{id}")
	public String changeEntertainment(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getEntertainment().equals("in progress")) {
			checklist.setEntertainment("complete");
		}
		else if (checklist.getEntertainment().equals("complete")) {
			checklist.setEntertainment("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Shirts
	@PutMapping("/shirts/change/{projectId}/{id}")
	public String changeShirts(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getShirts().equals("in progress")) {
			checklist.setShirts("complete");
		}
		else if (checklist.getShirts().equals("complete")) {
			checklist.setShirts("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Hats
	@PutMapping("/hats/change/{projectId}/{id}")
	public String changeHats(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getHats().equals("in progress")) {
			checklist.setHats("complete");
		}
		else if (checklist.getHats().equals("complete")) {
			checklist.setHats("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Swag
	@PutMapping("/swag/change/{projectId}/{id}")
	public String changeSwag(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getSwag().equals("in progress")) {
			checklist.setSwag("complete");
		}
		else if (checklist.getSwag().equals("complete")) {
			checklist.setSwag("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Ditty Bags
	@PutMapping("/dittybags/change/{projectId}/{id}")
	public String changeDittyBags(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getDittyBags().equals("in progress")) {
			checklist.setDittyBags("complete");
		}
		else if (checklist.getDittyBags().equals("complete")) {
			checklist.setDittyBags("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Registration
	@PutMapping("/registration/change/{projectId}/{id}")
	public String changeRegistration(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getRegistration().equals("in progress")) {
			checklist.setRegistration("complete");
		}
		else if (checklist.getRegistration().equals("complete")) {
			checklist.setRegistration("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Website
	@PutMapping("/website/change/{projectId}/{id}")
	public String changeWebsite(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getWebsite().equals("in progress")) {
			checklist.setWebsite("complete");
		}
		else if (checklist.getWebsite().equals("complete")) {
			checklist.setWebsite("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Print Materials
	@PutMapping("/printmaterials/change/{projectId}/{id}")
	public String changePrintMaterials(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getPrintMaterials().equals("in progress")) {
			checklist.setPrintMaterials("complete");
		}
		else if (checklist.getPrintMaterials().equals("complete")) {
			checklist.setPrintMaterials("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Scoring Devices
	@PutMapping("/scoringdevices/change/{projectId}/{id}")
	public String changeScoringDevices(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getScoringDevices().equals("in progress")) {
			checklist.setScoringDevices("complete");
		}
		else if (checklist.getScoringDevices().equals("complete")) {
			checklist.setScoringDevices("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Bank
	@PutMapping("/bank/change/{projectId}/{id}")
	public String changeBank(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getBank().equals("in progress")) {
			checklist.setBank("complete");
		}
		else if (checklist.getBank().equals("complete")) {
			checklist.setBank("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Cash Bags
	@PutMapping("/cashbags/change/{projectId}/{id}")
	public String changeCashBags(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getCashBags().equals("in progress")) {
			checklist.setCashBags("complete");
		}
		else if (checklist.getCashBags().equals("complete")) {
			checklist.setCashBags("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
	
	//Change Cash Boxes
	@PutMapping("/cashboxes/change/{projectId}/{id}")
	public String changeCashBoxes(@PathVariable("id") Long id, @PathVariable("projectId") Long projectId) {
		Checklist checklist = checklistService.findChecklist(id);
		if (checklist.getCashBoxes().equals("in progress")) {
			checklist.setCashBoxes("complete");
		}
		else if (checklist.getCashBoxes().equals("complete")) {
			checklist.setCashBoxes("in progress");
		}
		checklistService.updateChecklist(checklist);
		return "redirect:/project/{projectId}";
	}
}
