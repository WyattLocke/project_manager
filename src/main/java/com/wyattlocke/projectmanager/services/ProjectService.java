package com.wyattlocke.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyattlocke.projectmanager.models.Project;
import com.wyattlocke.projectmanager.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepo;
	
	public List<Project> allProjects() {
		return projectRepo.findAll();
	}
	
	public Project createProject(Project project) {
		return projectRepo.save(project);
	}
	
	public Project updateProject(Project project) {
		return projectRepo.save(project);
	}
	
	public Project findProject(Long id) {
		Optional<Project> optionalProject = projectRepo.findById(id);
		if (optionalProject.isPresent()) {
			return optionalProject.get();
		}
		return null;
	}
	
	public Project findProjectByCode(String code) {
		Project project = projectRepo.findByCode(code);
		if(project == null) {
			return null;
		}
		return project;
	}
	
	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}
}
