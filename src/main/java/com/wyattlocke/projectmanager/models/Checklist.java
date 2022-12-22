package com.wyattlocke.projectmanager.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="checklists")
public class Checklist {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String venue;
	private String catering;
	private String entertainment;
	private String cashBags;
	private String cashBoxes;
	private String bank;
	private String registration;
	private String website;
	private String printMaterials;
	private String scoringDevices;
	private String swag;
	private String dittyBags;
	private String shirts;
	private String hats;

	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="project_id")
    private Project project;
	
	public Checklist() {
		this.venue = "in progress";
		this.catering = "in progress";
		this.entertainment = "in progress";
		this.cashBags = "in progress";
		this.cashBoxes = "in progress";
		this.bank = "in progress";
		this.registration = "in progress";
		this.website = "in progress";
		this.printMaterials = "in progress";
		this.scoringDevices = "in progress";
		this.swag = "in progress";
		this.dittyBags = "in progress";
		this.shirts = "in progress";
		this.hats = "in progress";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCashBags() {
		return cashBags;
	}

	public void setCashBags(String cashBags) {
		this.cashBags = cashBags;
	}

	public String getCashBoxes() {
		return cashBoxes;
	}

	public void setCashBoxes(String cashBoxes) {
		this.cashBoxes = cashBoxes;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPrintMaterials() {
		return printMaterials;
	}

	public void setPrintMaterials(String printMaterials) {
		this.printMaterials = printMaterials;
	}

	public String getScoringDevices() {
		return scoringDevices;
	}

	public void setScoringDevices(String scoringDevices) {
		this.scoringDevices = scoringDevices;
	}

	public String getSwag() {
		return swag;
	}

	public void setSwag(String swag) {
		this.swag = swag;
	}

	public String getDittyBags() {
		return dittyBags;
	}

	public void setDittyBags(String dittyBags) {
		this.dittyBags = dittyBags;
	}

	public String getShirts() {
		return shirts;
	}

	public void setShirts(String shirts) {
		this.shirts = shirts;
	}

	public String getHats() {
		return hats;
	}

	public void setHats(String hats) {
		this.hats = hats;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
	
