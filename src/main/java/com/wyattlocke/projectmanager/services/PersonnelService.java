package com.wyattlocke.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyattlocke.projectmanager.models.Personnel;
import com.wyattlocke.projectmanager.repositories.PersonnelRepository;

@Service
public class PersonnelService {

	@Autowired
	PersonnelRepository personnelRepo;
	
	public List<Personnel> allPersonnel() {
		return personnelRepo.findAll();
	}
	
	public Personnel createPersonnel(Personnel personnel) {
		return personnelRepo.save(personnel);
	}
	
	public Personnel updatePersonnel(Personnel personnel) {
		return personnelRepo.save(personnel);
	}
	
	public Personnel findPersonnel(Long id) {
		Optional<Personnel> optionalPersonnel = personnelRepo.findById(id);
		if(optionalPersonnel.isPresent()) {
			return optionalPersonnel.get();
		}
		return null;
	}
	
	public void deletePersonnel(Long id) {
		personnelRepo.deleteById(id);
	}
}
