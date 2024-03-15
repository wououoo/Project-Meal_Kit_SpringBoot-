package org.mealkitspringboot.service;

import org.apache.ibatis.annotations.Param;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;

import java.util.List;

public interface BomService {
    List<BomListVo> getProdNmList();     // select option 제품명
    List<BomListVo> getProdDivList();   // select option 제품 규격
    List<BomListVo> getMatNmList();       // select option 재료명
    List<BomListVo> getList(CriteriaVo cri);    // BOM 목록 조회(검색 기능 포함)
    int register(BomListVo bomListVo);          // BOM 작성
   /* int getCurrval();*/
    int modify(BomListVo bomListVo);            // BOM 수정
    boolean remove(Long bomId, Long matId);       // BOM 삭제
    boolean removeOne(Long bomId, Long matId);       // BOM 삭제
    int getTotalCount(Long listSeq);            // BOM 전체 개수 조회(무한 스크롤에 사용)


}
