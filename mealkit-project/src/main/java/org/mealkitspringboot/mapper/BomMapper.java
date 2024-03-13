package org.mealkitspringboot.mapper;

import org.apache.ibatis.annotations.Param;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;

import java.util.List;

public interface BomMapper {
    List<BomListVo> getProdNmList(String prodNm);        // select option 제품명
    int insert(BomListVo bomListVo);        // BOM 등록
    BomListVo read();                       // BOM 현황 조회
    int readCurrval();                      // 무한 스크롤(스크롤 위치 조회)
    int getCountByListSeq(Long listSeq);    // BOM 현황 전체 개수 조회(무한 스크롤에 사용)
    int delete(Long listSeq);               // BOM 삭제
    int update(BomListVo bom);              // BOM 수정

    List<BomListVo> getListWithSearch(@Param("cri") CriteriaVo cri);    // BOM 검색 조회


}
