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
@Table(name="mission_order")
public class MissionOrder {
	
	@Id
	private long id;
	private long idPreviousOrder;
	private long currentOrder;
	private long idNextOrder;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdPreviousOrder() {
		return idPreviousOrder;
	}
	public void setIdPreviousOrder(long idPreviousOrder) {
		this.idPreviousOrder = idPreviousOrder;
	}
	public long getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(long currentOrder) {
		this.currentOrder = currentOrder;
	}
	public long getIdNextOrder() {
		return idNextOrder;
	}
	public void setIdNextOrder(long idNextOrder) {
		this.idNextOrder = idNextOrder;
	}

	

	
}
