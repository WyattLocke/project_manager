package com.wyattlocke.projectmanager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wyattlocke.projectmanager.models.FundraisingItem;

@Repository
public interface FundraisingItemRepository extends CrudRepository<FundraisingItem, Long>{

	List<FundraisingItem> findAll();
}
