package com.example.goodNeighbor5.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member")
public class MemberEntity {

	// 아이디, 비밀번호, 닉네임, 이름, 전화번호, 등록날짜, 수정날짜

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String memberId;
	
	@Column(nullable = true, unique = true)
	private String userId;
	
	@Column(nullable = true)
	private String password;

	@Column(nullable = true)
	private String nickname;
	
	@Column(nullable = true)
	private String name;
	
	@Column(nullable = true)
	private String tel;
	
	@Column(nullable = true)
	private LocalDateTime createDate;
	
	@Column(nullable = true)
	private LocalDateTime userDate;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUserDate() {
		return userDate;
	}

	public void setUserDate(LocalDateTime userDate) {
		this.userDate = userDate;
	}

	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userId=" + userId + ", password=" + password + ", nickname="
				+ nickname + ", name=" + name + ", tel=" + tel + ", createDate=" + createDate + ", userDate=" + userDate
				+ "]";
	}

}
