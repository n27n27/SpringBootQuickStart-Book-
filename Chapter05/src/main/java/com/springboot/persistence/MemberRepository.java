package com.springboot.persistence;

import org.springframework.data.repository.CrudRepository;

import com.springboot.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>
{

}
