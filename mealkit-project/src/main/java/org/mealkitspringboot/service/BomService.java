package org.mealkitspringboot.service;

import org.mealkitspringboot.domain.BomListVo;

import java.util.List;

public interface BomService {
    // BOM 현황 조회
    List<BomListVo> getBomList(String searchProdNm, String searchProdDiv, String searchMatNm);
}
