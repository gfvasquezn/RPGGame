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

@Entity
@Table(name="quest")
public class Quest {
		
	@Id
	private long id;
	
	private String backgroundPath;
	private String ChatacterMap;
	private boolean firstQuest;
	private boolean finalQuest;

    @OneToMany (fetch=FetchType.LAZY, mappedBy="quest")
    private Set<Map> Map= new HashSet<Map> (0);
	
	public Set<Map> getMap() {
		return Map;
	}
	public void setMap(Set<Map> map) {
		Map = map;
	}
	@OneToOne(mappedBy = "quest")
    private UserStage userStage;

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
	
	public String getBackgroundPath() {
		return backgroundPath;
	}
	public void setBackgroundPath(String backgroundPath) {
		this.backgroundPath = backgroundPath;
	}
	public String getChatacterMap() {
		return ChatacterMap;
	}
	public void setChatacterMap(String chatacterMap) {
		ChatacterMap = chatacterMap;
	}
	public boolean isFirstQuest() {
		return firstQuest;
	}
	public void setFirstQuest(boolean firstQuest) {
		this.firstQuest = firstQuest;
	}
	public boolean isFinalQuest() {
		return finalQuest;
	}
	public void setFinalQuest(boolean finalQuest) {
		this.finalQuest = finalQuest;
	}
	

}
