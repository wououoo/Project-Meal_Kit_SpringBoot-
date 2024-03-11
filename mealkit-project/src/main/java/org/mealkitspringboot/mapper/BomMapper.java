package org.mealkitspringboot.mapper;

import org.mealkitspringboot.domain.BomListVo;

import java.util.List;

public interface BomMapper {
    List<BomListVo> getBomList(String searchProdNm, String searchProdDiv, String searchMatNm);
}
