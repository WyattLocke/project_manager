package com.wyattlocke.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyattlocke.projectmanager.models.Checklist;
import com.wyattlocke.projectmanager.repositories.ChecklistRepository;

@Service
public class ChecklistService {

	@Autowired
	ChecklistRepository checklistRepo;
	
	public List<Checklist> allCheclists() {
		return checklistRepo.findAll();
	}
	
	public Checklist createChecklist(Checklist checklist) {
		return checklistRepo.save(checklist);
	}
	
	public Checklist updateChecklist(Checklist checklist) {
		return checklistRepo.save(checklist);
	}
	
	public Checklist findChecklist(Long id) {
		Optional<Checklist> optionalChecklist = checklistRepo.findById(id);
		if(optionalChecklist.isPresent()) {
			return optionalChecklist.get();
		}
		return null;
	}
	
	public void deleteChecklist(Long id) {
		checklistRepo.deleteById(id);
	}
}
