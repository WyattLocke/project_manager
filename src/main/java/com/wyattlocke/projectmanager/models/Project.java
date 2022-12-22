package com.wyattlocke.projectmanager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects")
public class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message="Name is required")
	@Size(min = 2, max = 60, message="Name must be between 5 and 60 characters")
	private String name;
	
	@NotEmpty(message="Code is required")
	@Size(min = 5, max = 60, message="Code must be between 5 and 60 characters")
	private String code;
	
	@NotEmpty(message="Description is required")
	@Size(min = 5, max = 250, message="Description must be between 5 and 60 characters")
	private String description;
	
	@NotEmpty(message="Venue is required")
	@Size(min = 5, max = 250, message="Venue must be between 5 and 60 characters")
	private String venue;
	
	@NotEmpty(message="Catering is required")
	@Size(min = 5, max = 250, message="Catering must be between 5 and 60 characters")
	private String catering;
	
	@NotEmpty(message="Entertainment is required")
	@Size(min = 5, max = 250, message="Entertainment must be between 5 and 60 characters")
	private String entertainment;
	
	private String complete;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @OneToOne(mappedBy="project", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Checklist checklist;
    
    @OneToMany(mappedBy="project", fetch=FetchType.LAZY)
    private List<Personnel> personnel;
    
    @OneToMany(mappedBy="project", fetch=FetchType.LAZY)
    private List<Sponsor> sponsors;
    
    @OneToMany(mappedBy="project", fetch=FetchType.LAZY)
    private List<FundraisingItem> fundraisingItems;
    
    
    public Project() {
    	this.complete = "false";
    }
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCatering() {
		return catering;
	}

	public void setCatering(String catering) {
		this.catering = catering;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Checklist getChecklist() {
		return checklist;
	}

	public void setChecklist(Checklist checklist) {
		this.checklist = checklist;
	}

	public List<Personnel> getPersonnel() {
		return personnel;
	}

	public void setPersonnel(List<Personnel> personnel) {
		this.personnel = personnel;
	}

	public List<Sponsor> getSponsors() {
		return sponsors;
	}

	public void setSponsors(List<Sponsor> sponsors) {
		this.sponsors = sponsors;
	}

	public List<FundraisingItem> getFundraisingItems() {
		return fundraisingItems;
	}

	public void setFundraisingItems(List<FundraisingItem> fundraisingItems) {
		this.fundraisingItems = fundraisingItems;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}
    
}
