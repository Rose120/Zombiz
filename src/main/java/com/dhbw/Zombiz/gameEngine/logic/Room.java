package com.dhbw.Zombiz.gameEngine.logic;

public class Room extends AGameElement {

	
	
	int id;
	String name;
	String picturePath;
	String description;
	String act; 
	String chapter;
	String scene;
	String function;
	String mood;
	String locationId;
	String gameObjectsIncluded;
	String buildingFloor;
	
	

	
	public Room(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	//getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getScene() {
		return scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getGameObjectsIncluded() {
		return gameObjectsIncluded;
	}

	public void setGameObjectsIncluded(String gameObjectsIncluded) {
		this.gameObjectsIncluded = gameObjectsIncluded;
	}

	public String getBuildingFloor() {
		return buildingFloor;
	}

	public void setBuildingFloor(String buildingFloor) {
		this.buildingFloor = buildingFloor;
	}
	
	
	
	

}
