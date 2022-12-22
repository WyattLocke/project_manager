package com.wyattlocke.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyattlocke.projectmanager.models.FundraisingItem;
import com.wyattlocke.projectmanager.repositories.FundraisingItemRepository;

@Service
public class FundraisingItemService {

	@Autowired
	FundraisingItemRepository itemRepo;
	
	public List<FundraisingItem> allItems() {
		return itemRepo.findAll();
	}
	
	public FundraisingItem createItem(FundraisingItem item) {
		return itemRepo.save(item);
	}
	
	public FundraisingItem updateItem(FundraisingItem item) {
		return itemRepo.save(item);
	}
	
	public FundraisingItem findItem(Long id) {
		Optional<FundraisingItem> optionalItem = itemRepo.findById(id);
		if(optionalItem.isPresent()) {
			return optionalItem.get();
		}
		return null;
	}
	
	public void deleteItem(Long id) {
		itemRepo.deleteById(id);
	}
}
