package com.poli.game.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="map")
public class Map {
	
	@Id
	private long id;
	private String backgroundPath;
	private String characterMap;
	private boolean firstMap;
	private boolean finalMap;
	@OneToOne(mappedBy = "map")
	private UserStage userStage;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_quest", nullable = false)
	@JsonBackReference
	private Quest quest;
	

    
	public boolean isFirstMap() {
		return firstMap;
	}
	public void setFirstMap(boolean firstMap) {
		this.firstMap = firstMap;
	}
	public Quest getQuest() {
		return quest;
	}
	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	public boolean isFinalMap() {
		return finalMap;
	}
	public void setFinalMap(boolean finalMap) {
		this.finalMap = finalMap;
	}
	
	public UserStage getUserStage() {
		return userStage;
	}
	public void setUserStage(UserStage userStage) {
		this.userStage = userStage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	public String getCharacterMap() {
		return characterMap;
	}
	public String getBackgroundPath() {
		return backgroundPath;
	}
	public void setBackgroundPath(String backgroundPath) {
		this.backgroundPath = backgroundPath;
	}
	public void setCharacterMap(String characterMap) {
		this.characterMap = characterMap;
	}
	
	
}
