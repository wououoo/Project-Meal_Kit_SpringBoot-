package org.mealkitspringboot.mapper;

import org.mealkitspringboot.domain.BomDeleteDto;
import org.mealkitspringboot.domain.BomListDto;
import org.mealkitspringboot.domain.BomModifyDto;
import org.mealkitspringboot.domain.CriteriaDto;

import java.util.List;

public interface BomMapper {
    List<BomListDto> getProdNmList();        // select option 제품명
    List<BomListDto> getProdDivList();     // select option 제품 규격
    List<BomListDto> getMatNmList();         // select option 재료명
    List<BomListDto> getList(CriteriaDto cri);   // BOM 전체 목록 조회
    int insert(BomListDto bomListDto);        // BOM 등록
    int readCurrval();                      // 무한 스크롤(스크롤 위치 조회)
    int getCountByListSeq(Long listSeq);    // BOM 현황 전체 개수 조회(무한 스크롤에 사용)
    int delete(BomDeleteDto bomDeleteDto);       // BOM 삭제
    int update(BomModifyDto bom);              // BOM 수정

    /*List<BomListVo> getListWithSearch(@Param("cri") CriteriaVo cri);    // BOM 검색 조회*/


}
