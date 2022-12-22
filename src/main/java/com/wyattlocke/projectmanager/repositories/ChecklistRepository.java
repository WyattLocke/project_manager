package com.wyattlocke.projectmanager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wyattlocke.projectmanager.models.Checklist;

@Repository
public interface ChecklistRepository extends CrudRepository<Checklist, Long>{

	List<Checklist> findAll();
}
