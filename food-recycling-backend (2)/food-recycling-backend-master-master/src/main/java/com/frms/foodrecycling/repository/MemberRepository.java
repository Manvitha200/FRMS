package com.frms.foodrecycling.repository;

import com.frms.foodrecycling.entity.Donor;
import com.frms.foodrecycling.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member , Integer> {

    Optional<Member> findByEmail(String email);
}
