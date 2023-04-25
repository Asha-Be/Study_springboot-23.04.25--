package com.example.goodNeighbor5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.goodNeighbor5.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {


}
