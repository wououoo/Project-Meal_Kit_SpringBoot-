package org.mealkitspringboot.service;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;
import org.mealkitspringboot.mapper.BomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Log4j
@Service
public class BomServiceImpl implements BomService {
    @Autowired
    private BomMapper bomMapper;

    /* select option 제품명 */
    @Override
    public List<BomListVo> getProdNmList() {
        log.info("getProdNmList....." );
        return bomMapper.getProdNmList();
    }

    /* select option 제품규격 */
    @Override
    public List<BomListVo> getProdDivList() {
        log.info("getProdDivList.....");
        return bomMapper.getProdNmList();
    }

    /* select option 재료명 */
    @Override
    public List<BomListVo> getMatNmList() {
        log.info("getProdNmList.....");
        return bomMapper.getProdNmList();
    }

    /* BOM 현황 조회(검색 기능) 서비스 */
    @Override
    public List<BomListVo> getList(CriteriaVo cri) {
        log.info("getList.........");

        return bomMapper.getList(cri);
    }

    /* BOM 등록 서비스 */
    @Override
    @Transactional
    public int register(BomListVo bomListVo) {
        log.info("register......" + bomListVo);

        // 1. 제품정보 처리
        // if product id 있으면 skip 없으면 insert 처리
        //bomMapper.insert(bomListVo)

        // 2. 재료정보 처리
        // if material id 있으면 skip 없으면 insert 처리
        // bomMapper.insert(bomListVo)

        // 3.
        // bomMapper.insert(bomListVo)

        return bomMapper.insert(bomListVo);
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
    /*@Override
    public int getCurrVal() {
        return bomMapper.readCurrval();
    }*/
}
