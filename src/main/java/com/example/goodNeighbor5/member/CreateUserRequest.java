package com.example.goodNeighbor5.member;

import java.time.LocalDateTime;

public class CreateUserRequest {

	private Long memberId;
	private String userId;
	private String password;
	private String nickname;
	private String name;

	private String tel;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	public Long getMemberId() {
		return memberId;
	}
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getNickname() {
		return nickname;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	@Override
	public String toString() {
		return "CreateUserRequest [memberId=" + memberId + ", userId=" + userId + ", password=" + password
				+ ", nickname=" + nickname + ", name=" + name + ", tel=" + tel + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
