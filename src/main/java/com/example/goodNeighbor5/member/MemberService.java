package com.example.goodNeighbor5.member;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.goodNeighbor5.entity.*;
import com.example.goodNeighbor5.repository.MemberRepository;

@Service
public class MemberService {

	private MemberRepository repository;

	public MemberService(MemberRepository repository) {
		super();
		this.repository = repository;
	}

	// 회원가입 -----------

	public void insertMember(CreateUserRequest request) {

		var entity = new MemberEntity();

		entity.setMemberId(request.getMemberId());
		entity.setUserId(request.getUserId());
		entity.setPassword(request.getPassword());
		entity.setName(request.getName());
		entity.setNickname(request.getNickname());
		entity.setTel(request.getTel());
		entity.setCreateDate(LocalDateTime.now());
		entity.setUpdateDate(LocalDateTime.now());

		repository.save(entity);
	}

	// 회원조회

	public MemberEntity detailMember(Long memberId) {
		return repository.findById(memberId).orElseThrow(null);
	}

	// 회원 수정

	public void updateMember(UpdateUserRequest request, Long memberId) {

		var entity = repository.findById(memberId);
//				.orElseThrow(() -> NeighborException.from());

		entity.setPassword(request.getPassword());
		entity.setNickname(request.getNickname());
		entity.setTel(request.getTel());
		entity.setUpdateDate(LocalDateTime.now());

		repository.save(entity);
	}

	// 회원탈퇴

	public void deleteMember(Long memberId, String Password) {
		var entity = repository.findById(memberId);

		if (!entity.getPassword().equals(Password)) {
//			throw
		}

		repository.deleteById(memberId);
	}

}
