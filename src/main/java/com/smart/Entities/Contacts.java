package com.smart.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contacts {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String nickname;
	private String work;
	private String email;
	private String phone;
	private String image;
	@Column(length =1000)
	private String Description;
	
	@ManyToOne
	private User user;
	
	
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Contacts(int cId, String name, String nickname, String work, String email, String phone, String image,
			String description) {
		super();
		this.cId = cId;
		this.name = name;
		this.nickname = nickname;
		this.work = work;
		this.email = email;
		this.phone = phone;
		this.image = image;
		Description = description;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contacts [cId=" + cId + ", name=" + name + ", nickname=" + nickname + ", work=" + work + ", email="
				+ email + ", phone=" + phone + ", image=" + image + ", Description=" + Description + "]";
	}
	
	
	
	
}
