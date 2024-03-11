package org.mealkitspringboot.service;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;
import org.mealkitspringboot.mapper.BomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
public class BomServiceImpl implements BomService {
    @Autowired
    private BomMapper bomMapper;

    /* 제품명 옵션 검색 서비스 */
    @Override
    public List<BomListVo> getProdNmOption(String searchProdNm) {
        List<BomListVo> searchList = bomMapper.getProdNmOption(searchProdNm);
        return searchList;
    }

    /* 제품 규격 옵션 검색 */
    @Override
    public List<BomListVo> getProdDivOption(String searchProdDiv) {
        List<BomListVo> searchList = bomMapper.getProdNmOption(searchProdDiv);
        return searchList;
    }

    /* 제품명 옵션 검색 */
    public List<BomListVo> getMatNmOption(String searchMatNm) {
        List<BomListVo> searchList = bomMapper.getProdNmOption(searchMatNm);
        return searchList;
    }

    /* BOM 현황 조회(검색) 서비스 */
    @Override
    public List<BomListVo> getBomList(CriteriaVo cri) {
        log.info("getBomList.......");
        return bomMapper.getBomList(cri);
    }
}
