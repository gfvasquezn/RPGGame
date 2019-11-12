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
@Table(name="quest_order")
public class QuestOrder {
	
	@Id
	private long id;
	private long idPreviousQuest;
	private long currentQuest;
	private long idNextQuest;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdPreviousQuest() {
		return idPreviousQuest;
	}
	public void setIdPreviousQuest(long idPreviousQuest) {
		this.idPreviousQuest = idPreviousQuest;
	}
	public long getCurrentQuest() {
		return currentQuest;
	}
	public void setCurrentQuest(long currentQuest) {
		this.currentQuest = currentQuest;
	}
	public long getIdNextQuest() {
		return idNextQuest;
	}
	public void setIdNextQuest(long idNextQuest) {
		this.idNextQuest = idNextQuest;
	}
	
}
