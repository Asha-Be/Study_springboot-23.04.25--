package com.example.goodNeighbor5.member;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.goodNeighbor5.entity.MemberEntity;

@RestController
@RequestMapping("v1/member")
public class MemberController {

	private MemberService service;

	public MemberController(MemberService service) {
		super();
		this.service = service;
	}

	// 회원가입

	@PostMapping
	public void insertMember(@RequestBody CreateUserRequest request) {

		service.insertMember(request);
	}

	// 회원 조회

	@GetMapping("/{memberId}")
	public MemberEntity detailMember(@PathVariable Long memberId) {
		return service.detailMember (memberId);
	}

	// 회원 수정

	@PutMapping("/{memberId}")
	public void updateMember(@PathVariable Long memberId, @RequestBody UpdateUserRequest request) {
		service.updateMember(request , memberId);
	}

	// 회원 삭제

	@DeleteMapping("/{memberId}")
	public void deleteMember(@PathVariable Long memberId, @RequestBody DeleteUserRequest request) {
		service.deleteMember(memberId, request.getPassword());
	}

}
