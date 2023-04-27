package com.example.goodNeighbor5.member;

public class DeleteUserRequest {
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DeleteUserRequest [password=" + password + ", getPassword()=" + getPassword() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
