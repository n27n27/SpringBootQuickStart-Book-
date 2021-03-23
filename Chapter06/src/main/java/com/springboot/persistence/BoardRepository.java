package com.springboot.persistence;

import org.springframework.data.repository.CrudRepository;

import com.springboot.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>
{

}
