package com.poli.game.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="mechanics")
public class Mechanics {
	
	@Id
	private long id;
	private long score;
	private int xPossition;
	private int yPossition;
	private int orderMechanics;
	private String message;
	private String messageNotDone;
	private String messageDone;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageNotDone() {
		return messageNotDone;
	}
	public void setMessageNotDone(String messageNotDone) {
		this.messageNotDone = messageNotDone;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_mission", nullable = false)
	@JsonBackReference
	private Mission mission;
	
	
	public int getOrderMechanics() {
		return orderMechanics;
	}
	public void setOrderMechanics(int orderMechanics) {
		this.orderMechanics = orderMechanics;
	}

	public int getxPossition() {
		return xPossition;
	}
	public void setxPossition(int xPossition) {
		this.xPossition = xPossition;
	}
	public int getyPossition() {
		return yPossition;
	}
	public void setyPossition(int yPossition) {
		this.yPossition = yPossition;
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

	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	
}
