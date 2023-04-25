package com.example.goodNeighbor5.member;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	private MemberService service;

	public MemberController(MemberService service) {
		super();
		this.service = service;
	}
	
	

}
