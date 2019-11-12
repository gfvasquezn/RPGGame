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
@Table(name="spent_score")
public class SpentScore {
	
	@Id
	private long id;
	private long spentScore;
	private long score;
	private String objectSpending;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	private User user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSpentScore() {
		return spentScore;
	}
	public void setSpentScore(long spentScore) {
		this.spentScore = spentScore;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public String getObjectSpending() {
		return objectSpending;
	}
	public void setObjectSpending(String objectSpending) {
		this.objectSpending = objectSpending;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
