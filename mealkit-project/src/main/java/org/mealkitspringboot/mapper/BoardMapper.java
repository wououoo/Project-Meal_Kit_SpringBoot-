package org.mealkitspringboot.mapper;

import org.mealkitspringboot.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

  int insertBoard(BoardVO boardVO);
  List<BoardVO> readBoard(int orderNum);
  int delBoard(int order_num);
  int updateBoard(BoardVO boardVO);
  List<BoardVO> readBoardList();
}
