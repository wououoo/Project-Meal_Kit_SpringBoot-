package org.mealkitspringboot.controller;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;
import org.mealkitspringboot.service.BomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Log4j
@RequestMapping("/bom/")
public class BomController {
    private final BomService bomService;

    public BomController(BomService bomService) {
        this.bomService = bomService;
    }

    @GetMapping("/getBomList")
    public String getList(CriteriaVo cri, Model model) {
        log.info("getBomList");

        List<BomListVo> prodNmList = bomService.getProdNmList();
        List<BomListVo> prodDivList = bomService.getProdDivList();
        List<BomListVo> matNmList = bomService.getMatNmList();
        List<BomListVo> bomList = bomService.getList(cri);

        model.addAttribute("prodNmList", prodNmList);
        model.addAttribute("prodDivList", prodDivList);
        model.addAttribute("matNmList", matNmList);
        model.addAttribute("bomList", bomList);     // "bom"이라는 이름으로 모델에 BOM 현황 리스트를 담음

        return "/bom/getBomList";        // 해당하는 뷰의 이름을 반환
    }
}
