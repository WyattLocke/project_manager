package com.wyattlocke.projectmanager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wyattlocke.projectmanager.models.Personnel;

@Repository
public interface PersonnelRepository extends CrudRepository<Personnel, Long> {

	List<Personnel> findAll();
}
