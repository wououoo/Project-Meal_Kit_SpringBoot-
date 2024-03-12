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

    /* BOM 등록 서비스 */
    @Override
    public int register(BomListVo bomListVo) {
        log.info("register......" + bomListVo);
        return bomMapper.insert(bomListVo);
    }

    /* BOM 현황 조회 서비스 */
    @Override
    public BomListVo get() {
        log.info("get........");
        return bomMapper.read();
    }

    /* BOM 현황 조회(검색 기능) 서비스 */
    @Override
    public List<BomListVo> get(CriteriaVo cri) {
        log.info("get BOM 현황 조회.......");

        List<BomListVo> listWithSearch = bomMapper.getListWithSearch(cri);
        return listWithSearch;
    }

    /* BOM 수정 서비스 */
    @Override
    public int modify(BomListVo bomListVo) {
        log.info("modify......" + bomListVo);
        return bomMapper.update(bomListVo);
    }

    /* BOM 삭제 서비스 */
    @Override
    public int remove(Long listSeq) {
        log.info("remove......" + listSeq);
        return bomMapper.delete(listSeq);
    }

    /* BOM 목록 전체 개수 조회 서비스(무한 스크롤에 사용) */
    @Override
    public int getTotalCount(Long listSeq) {
        return bomMapper.getCountByListSeq(listSeq);
    }
    @Override
    public int getCurrVal() {
        return bomMapper.readCurrval();
    }
}
