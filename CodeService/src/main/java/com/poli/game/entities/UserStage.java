package com.poli.game.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_stage")
public class UserStage {
	
	@Id	
	private long id;
	private long idUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_quest",     referencedColumnName = "id")
    private Quest quest;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_map",     referencedColumnName = "id")
    private Map map;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_mission",     referencedColumnName = "id")
    private Mission mission;

    
	public Quest getQuest() {
		return quest;
	}
	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
		
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}


}
