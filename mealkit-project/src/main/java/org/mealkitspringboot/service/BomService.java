package org.mealkitspringboot.service;

import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;

import java.util.List;

public interface BomService {
    /* 제품명 옵션 검색 */
    List<BomListVo> getProdNmOption(String searchProdNm);

    /* 제품 규격 옵션 검색 */
    List<BomListVo> getProdDivOption(String searchProdDiv);

    /* 제품명 옵션 검색 */
    List<BomListVo> getMatNmOption(String searchMatNm);

    /* BOM 현황 조회 및 검색 */
    List<BomListVo> getBomList(CriteriaVo cri);
}
