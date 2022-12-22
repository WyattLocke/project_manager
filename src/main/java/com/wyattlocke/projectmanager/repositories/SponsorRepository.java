package com.wyattlocke.projectmanager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wyattlocke.projectmanager.models.Sponsor;

@Repository
public interface SponsorRepository extends CrudRepository<Sponsor, Long>{

	List<Sponsor> findAll();
}
