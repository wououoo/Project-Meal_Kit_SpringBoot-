package org.mealkitspringboot.service;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.mapper.BomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
public class BomServiceImpl implements BomService {
    @Autowired
    private BomMapper bomMapper;

    /* BOM 현황 조회 서비스 */
    @Override
    public List<BomListVo> getBomList(String searchProdNm, String searchProdDiv, String searchMatNm) {
        List<BomListVo> bomListVoList = bomMapper.getBomList(searchProdNm, searchProdDiv, searchMatNm);

        return bomListVoList;
    }
}
