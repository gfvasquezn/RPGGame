	package com.poli.game.entities;
	
	import java.util.HashSet;
	import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
	
	@Entity
	@Table(name="user")
	public class User {
		
		@Id
		@Column(name="id_user")
		private long id;
		private String user_name;
		private String password;
		private String score;
		
		
	    @OneToMany (fetch=FetchType.LAZY, mappedBy="user")
	    private Set<SpentScore> spentScore= new HashSet<SpentScore> (0);
	    
	    @OneToMany (fetch=FetchType.LAZY, mappedBy="user")
	    private Set<missionHistory> missionHistory= new HashSet<missionHistory> (0);
		
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "user_stage_id",     referencedColumnName = "id")
	    private UserStage userStage;

	    
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
		public Set<SpentScore> getSpentScore() {
			return spentScore;
		}
		public void setSpentScore(Set<SpentScore> spentScore) {
			this.spentScore = spentScore;
		}
		public UserStage getUserStage() {
			return userStage;
		}
		public void setUserStage(UserStage userStage) {
			this.userStage = userStage;
		}
		
		
	}
