package com.poli.game.entities;

import java.util.HashSet;
import java.util.Set;

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
@Table(name="mission")
public class Mission {
	
	@Id
	private long id;
	private String backgroundPath;
	private String characterMap;
	private boolean firstMission;
	private boolean finalMission;
	private int numberOfMechanics;

	public int getNumberOfMechanics() {
		return numberOfMechanics;
	}
	public void setNumberOfMechanics(int numberOfMechanics) {
		this.numberOfMechanics = numberOfMechanics;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Set<Mechanics> getMechanics() {
		return mechanics;
	}
	public void setMechanics(Set<Mechanics> mechanics) {
		this.mechanics = mechanics;
	}
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_map", nullable = false)
	private Map map;
	
	@OneToOne(mappedBy = "mission")
    private UserStage userStage;
	
    @OneToMany (fetch=FetchType.LAZY, mappedBy="mission")
    private Set<Mechanics> mechanics= new HashSet<Mechanics> (0);
	
	public boolean isFirstMission() {
		return firstMission;
	}
	public void setFirstMission(boolean firstMission) {
		this.firstMission = firstMission;
	}
	public boolean isFinalMission() {
		return finalMission;
	}
	public void setFinalMission(boolean finalMission) {
		this.finalMission = finalMission;
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
	public String getBackgroundPath() {
		return backgroundPath;
	}
	public void setBackgroundPath(String backgroundPath) {
		this.backgroundPath = backgroundPath;
	}
	public void setId(long id) {
		this.id = id;
	}


	public String getCharacterMap() {
		return characterMap;
	}
	public void setCharacterMap(String characterMap) {
		this.characterMap = characterMap;
	}

}
