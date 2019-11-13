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
@Table(name="mission_history")
public class MissionHistory {
	
	public long getMissionFrom() {
		return missionFrom;
	}
	public void setMissionFrom(long missionFrom) {
		this.missionFrom = missionFrom;
	}
	public long getMissionTo() {
		return missionTo;
	}
	public void setMissionTo(long missionTo) {
		this.missionTo = missionTo;
	}
	@Id
	private long id;
	private long missionFrom;
	private long missionTo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	private User user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
