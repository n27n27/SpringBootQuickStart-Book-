package com.springboot.service;

import java.util.List;

import com.springboot.domain.BoardVO;

public interface BoardService
{
	String hello(String name);	
	BoardVO getBoard();	
	List<BoardVO> getBoardList();
}
