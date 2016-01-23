package com.basis;


import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class City {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private Date date;
	
	@Persistent
	private String name;
	
	@Persistent
	private Double foodBasket;
	
	@Persistent
	private Double apartmentsCost ;
	
	@Persistent
	private Double population;
	
	@Persistent
	private Double area;
	
	@Persistent
	private Double doctors;
	
	@Persistent
	private Double budgetForCitizen;
	
	@Persistent
	private Double numberOfOffenders;
	
	@Persistent
	private Double numberOfCrimes;
	
	@Persistent
	private Double whoLeft;
	
	@Persistent
	private Double whoArrived;
	
	@Persistent
	private Double transport;
	
	@Persistent
	private Double queueInKindergartens;
	
	@Persistent
	private Double numberOfSchools;
	
	@Persistent
	private Double profitOrganizations;
	
	@Persistent
	private Double averageSalary;
	
	@Persistent
	private Double numberOfMarriages;
	
	@Persistent
	private Double numberOfDivorces;
	
	@Persistent
	private Double peopleInSport;
	
	@Persistent
	private Double sportsSchools;
	
	@Persistent
	private Double numberOfMuseums;
	
	@Persistent
	private String soundcloud;
	
	@Persistent
	private Double koord1;
	
	@Persistent
	private Double koord2;
	
	
	
	public Double getKoord1() {
		return koord1;
	}
	public void setKoord1(Double koord1) {
		this.koord1 = koord1;
	}
	public Double getKoord2() {
		return koord2;
	}
	public void setKoord2(Double koord2) {
		this.koord2 = koord2;
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
	public Double getFoodBasket() {
		return foodBasket;
	}
	public void setFoodBasket(Double foodBasket) {
		this.foodBasket = foodBasket;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getApartmentsCost() {
		return apartmentsCost;
	}
	public void setApartmentsCost(Double apartmentsCost) {
		this.apartmentsCost = apartmentsCost;
	}
	public Double getPopulation() {
		return population;
	}
	public void setPopulation(Double population) {
		this.population = population;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getDoctors() {
		return doctors;
	}
	public void setDoctors(Double doctors) {
		this.doctors = doctors;
	}
	public Double getBudgetForCitizen() {
		return budgetForCitizen;
	}
	public void setBudgetForCitizen(Double budgetForCitizen) {
		this.budgetForCitizen = budgetForCitizen;
	}
	public Double getNumberOfOffenders() {
		return numberOfOffenders;
	}
	public void setNumberOfOffenders(Double numberOfOffenders) {
		this.numberOfOffenders = numberOfOffenders;
	}
	public Double getNumberOfCrimes() {
		return numberOfCrimes;
	}
	public void setNumberOfCrimes(Double numberOfCrimes) {
		this.numberOfCrimes = numberOfCrimes;
	}
	public Double getWhoLeft() {
		return whoLeft;
	}
	public void setWhoLeft(Double whoLeft) {
		this.whoLeft = whoLeft;
	}
	public Double getWhoArrived() {
		return whoArrived;
	}
	public void setWhoArrived(Double whoArrived) {
		this.whoArrived = whoArrived;
	}
	public Double getTransport() {
		return transport;
	}
	public void setTransport(Double transport) {
		this.transport = transport;
	}
	public Double getQueueInKindergartens() {
		return queueInKindergartens;
	}
	public void setQueueInKindergartens(Double queueInKindergartens) {
		this.queueInKindergartens = queueInKindergartens;
	}
	public Double getNumberOfSchools() {
		return numberOfSchools;
	}
	public void setNumberOfSchools(Double numberOfSchools) {
		this.numberOfSchools = numberOfSchools;
	}
	public Double getProfitOrganizations() {
		return profitOrganizations;
	}
	public void setProfitOrganizations(Double profitOrganizations) {
		this.profitOrganizations = profitOrganizations;
	}
	public Double getAverageSalary() {
		return averageSalary;
	}
	public void setAverageSalary(Double averageSalary) {
		this.averageSalary = averageSalary;
	}
	public Double getNumberOfMarriages() {
		return numberOfMarriages;
	}
	public void setNumberOfMarriages(Double numberOfMarriages) {
		this.numberOfMarriages = numberOfMarriages;
	}
	public Double getNumberOfDivorces() {
		return numberOfDivorces;
	}
	public void setNumberOfDivorces(Double numberOfDivorces) {
		this.numberOfDivorces = numberOfDivorces;
	}
	public Double getPeopleInSport() {
		return peopleInSport;
	}
	public void setPeopleInSport(Double peopleInSport) {
		this.peopleInSport = peopleInSport;
	}
	public Double getSportsSchools() {
		return sportsSchools;
	}
	public void setSportsSchools(Double sportsSchools) {
		this.sportsSchools = sportsSchools;
	}
	public Double getNumberOfMuseums() {
		return numberOfMuseums;
	}
	public void setNumberOfMuseums(Double numberOfMuseums) {
		this.numberOfMuseums = numberOfMuseums;
	}
	public String getSoundcloud() {
		return soundcloud;
	}
	public void setSoundcloud(String soundcloud) {
		this.soundcloud = soundcloud;
	}
	
	

	
	

}
