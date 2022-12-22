package com.wyattlocke.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyattlocke.projectmanager.models.Sponsor;
import com.wyattlocke.projectmanager.repositories.SponsorRepository;

@Service
public class SponsorService {

	@Autowired
	SponsorRepository sponsorRepo;
	
	public List<Sponsor> allSponsors() {
		return sponsorRepo.findAll();
	}
	
	public Sponsor createSponsor(Sponsor sponsor) {
		return sponsorRepo.save(sponsor);
	}
	
	public Sponsor updateSponsor(Sponsor sponsor) {
		return sponsorRepo.save(sponsor);
	}
	
	public Sponsor findSponsor(Long id) {
		Optional<Sponsor> optionalSponsor = sponsorRepo.findById(id);
		if(optionalSponsor.isPresent()) {
			return optionalSponsor.get();
		}
		return null;
	}
	
	public void deleteSponsor(Long id) {
		sponsorRepo.deleteById(id);
	}
}
