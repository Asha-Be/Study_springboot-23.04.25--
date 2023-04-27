package com.example.goodNeighbor5.member;

import java.time.LocalDateTime;

public class UpdateUserRequest {

	private Long memberId;
	private String password;
	private String nickname;

	private String tel;

	private LocalDateTime updateDate;

	public Long getMemberId() {
		return memberId;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}

	public String getTel() {
		return tel;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	@Override
	public String toString() {
		return "UpdateUserRequest [memberId=" + memberId + ", password=" + password + ", nickname=" + nickname
				+ ", tel=" + tel + ", updateDate=" + updateDate + "]";
	}

}
