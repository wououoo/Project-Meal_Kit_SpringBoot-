package org.mealkitspringboot.service;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomDeleteDto;
import org.mealkitspringboot.domain.BomListDto;
import org.mealkitspringboot.domain.BomModifyDto;
import org.mealkitspringboot.domain.CriteriaDto;
import org.mealkitspringboot.mapper.BomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j
@Service
public class BomServiceImpl implements BomService {
    @Autowired
    private BomMapper bomMapper;

    /* select option 제품명 */
    @Override
    public List<BomListDto> getProdNmList() {
        log.info("getProdNmList....." );
        return bomMapper.getProdNmList();
    }

    /* select option 제품규격 */
    @Override
    public List<BomListDto> getProdDivList() {
        log.info("getProdDivList.....");
        return bomMapper.getProdDivList();
    }

    /* select option 재료명 */
    @Override
    public List<BomListDto> getMatNmList() {
        log.info("getProdNmList.....");
        return bomMapper.getMatNmList();
    }

    /* BOM 현황 조회(검색 기능) 서비스 */
    @Override
    public List<BomListDto> getList(CriteriaDto cri) {
        log.info("getList.........");

        return bomMapper.getList(cri);
    }

    /* BOM 등록 서비스 */
    @Override
    @Transactional
    public int registerBom(BomListDto bomListDto) {
        log.info("register......" + bomListDto);

        // 1. 제품정보 처리
        // if product id 있으면 skip 없으면 insert 처리
        //bomMapper.insert(bomListVo)

        // 2. 재료정보 처리
        // if material id 있으면 skip 없으면 insert 처리
        // bomMapper.insert(bomListVo)

        // 3.
        // bomMapper.insert(bomListVo)

        return bomMapper.insert(bomListDto);
    }

    /* BOM 수정 서비스 */
    @Override
    public boolean modify(BomModifyDto bomModifyDto) {
        log.info("modify......" + bomModifyDto);
        return bomMapper.update(bomModifyDto) == 1;
        // 정상적인 수정/삭제가 이루어지면 1이라는 값이 반환되므로,
        // '==' 연산자를 이용하여 true/false를 처리할 수 있다.
    }

    /* BOM 삭제 서비스 */
    @Override
    public boolean remove(Long bomId, Long matId) {
        log.info("remove....., bomIds: " + bomId + ", matIds: " + matId);
        BomDeleteDto bomVo = new BomDeleteDto();
        bomVo.setBomId(bomId);
        bomVo.setMatId(matId);
        return bomMapper.delete(bomVo) == 1;
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
