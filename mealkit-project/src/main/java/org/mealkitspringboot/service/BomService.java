package org.mealkitspringboot.service;

import org.apache.ibatis.annotations.Param;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;

import java.util.List;

public interface BomService {
    int register(BomListVo bomListVo);          // BOM 작성
    int getCurrval();
    BomListVo get();                            // BOM 현황 조회
    int modify(BomListVo bomListVo);            // BOM 수정
    int remove(Long listSeq);                   // BOM 삭제
    int getTotalCount(Long listSeq);            // BOM 전체 개수 조회(무한 스크롤에 사용)
    List<BomListVo> get(CriteriaVo cri); // BOM 현황 조회(검색)

}
