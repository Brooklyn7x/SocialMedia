package com.faceweb.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;








@Entity
public class friendlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long friendId;
	String receiverfrinend ;
	String senderfriend;
	String status;
	@ManyToOne
	faceuser f1;
	
	
	
	public String getSenderfriend() {
		return senderfriend;
	}



	public void setSenderfriend(String senderfriend) {
		this.senderfriend = senderfriend;
	}



	public long getFriendId() {
		return friendId;
	}



	public void setFriendId(long friendId) {
		this.friendId = friendId;
	}



	public String getReceiverfrinend() {
		return receiverfrinend;
	}



	public void setReceiverfrinend(String receiverfrinend) {
		this.receiverfrinend = receiverfrinend;
	}



	public faceuser getF1() {
		return f1;
	}



	public void setF1(faceuser f1) {
		this.f1 = f1;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
