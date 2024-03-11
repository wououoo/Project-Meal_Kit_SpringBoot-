package org.mealkitspringboot.controller;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.service.BomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Log4j
public class BomController {
    @Autowired
    private BomService bomService;

    /* BOM 현황 조회 */
    // http://localhost:8008/bomList
    @GetMapping("/bomList")
    public List<BomListVo> bomList(
            @RequestParam(value = "searchProdNm" required="false") String searchProdNm,
            @RequestParam(value = "searchProdDiv" required="false") String searchProdDiv,
            @RequestParam(value = "searchMatNm" required="false") String searchMatNm,
            Model model
    ) {
        List<BomListVo> bomListVoList = bomService.getBomList(searchProdNm, searchProdDiv, searchMatNm);

        model.addAttribute("bomListVoList", bomListVoList);
        model.addAttribute("searchProdNm", searchProdNm);
        model.addAttribute("searchProdDiv", searchProdDiv);
        model.addAttribute("searchMatNm", searchMatNm);
    }
}
