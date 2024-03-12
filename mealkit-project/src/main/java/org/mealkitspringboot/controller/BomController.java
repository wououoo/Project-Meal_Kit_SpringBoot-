package org.mealkitspringboot.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;
import org.mealkitspringboot.service.BomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/bom/")
@RestController
@Log4j
public class BomController {
    @Autowired
    private BomService bomService;

    /* BOM 등록 작업 */
    // http://localhost:8003/bom/bomInsertForm/register
    @PostMapping(value = "/register",
            produces = {MediaType.TEXT_PLAIN_VALUE })
    public ResponseEntity<String> create(@RequestBody BomListVo bomListVo) {
        log.info("BomListVO: " + bomListVo);

        int insertCount = bomService.register(bomListVo);
        log.info("BOM INSERT COUNT: " + insertCount);

        // 삼항 연산자 처리
        return insertCount == 1 ? new ResponseEntity<>("success", HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /* BOM 제품명 옵션 */
    @GetMapping("/getProdNmList")
    public void getProdNmList(String searchProdNm, Model model) {
        List<BomListVo> bomVoList = bomService.getProdNmList(searchProdNm);
        model.addAttribute("prodNmList", bomVoList);
    }



    /* BOM 현황 조회(검색) */
    // http://localhost:8003/bom/getBomList
    /*@GetMapping(value = "/getBomList",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BomListVo>> getBomList(
            @PathVariable("searchProdNm") String prodNm,
            @PathVariable("searchProdDiv") String prodDiv,
            @PathVariable("searchMatNm") String matNm
    ) {
        log.info("getBomList...........");
        CriteriaVo cri = new CriteriaVo(prodNm, prodDiv, matNm);
        log.info(cri);

        return new ResponseEntity<>(bomService.getBomList(cri), HttpStatus.OK);
    }*/

    // RestController의 수정/삭제/조회는 JSON이나 문자열을 반환하도록 설계한다.
    /* BOM 현황 조회 */
    @GetMapping(value = "/getBomList",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BomListVo> get() {
        log.info("getBomList.......");
        return new ResponseEntity<>(bomService.get(), HttpStatus.OK);
    }

    /* BOM 삭제 */
    @DeleteMapping(value = "/{listSeq}", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> remove(@PathVariable("listSeq") Long listSeq) {
        log.info("remove: " + listSeq);

        return bomService.remove(listSeq) == 1
                ? new ResponseEntity<>("success", HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /* BOM 수정 */
    @RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH},
        value = "/{listSeq}",
        consumes = "application/json",
        produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> modify(
            @RequestBody BomListVo bomListVo,
            @PathVariable("listSeq") Long listSeq
    ) {
        bomListVo.setListSeq(listSeq);
        log.info("listSeq: " + listSeq);
        log.info("modify: " + bomListVo);

        return bomService.modify(bomListVo) == 1
                ? new ResponseEntity<>("success", HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
