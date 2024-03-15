package org.mealkitspringboot.controller;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;
import org.mealkitspringboot.service.BomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Log4j
@RequestMapping("/bom/")
public class BomController {
    private final BomService bomService;

    public BomController(BomService bomService) {
        this.bomService = bomService;
    }

    /* BOM 현황 조회(with 검색) */
    @GetMapping("/getBomList")
    public String getList(CriteriaVo cri, Model model) {
        log.info("getBomList");

        List<BomListVo> prodNmList = bomService.getProdNmList();        // 제품명 콤보박스로 데이터 가져오기
        List<BomListVo> prodDivList = bomService.getProdDivList();      // 제품종류 콤보박스로 데이터 가져오기
        List<BomListVo> matNmList = bomService.getMatNmList();          // 재료명 콤보박스로 데이터 가져오기
        List<BomListVo> bomList = bomService.getList(cri);              // BOM 현황 리스트(with 검색)

        model.addAttribute("prodNmList", prodNmList);
        model.addAttribute("prodDivList", prodDivList);
        model.addAttribute("matNmList", matNmList);
        model.addAttribute("bomList", bomList);     // "bom"이라는 이름으로 모델에 BOM 현황 리스트를 담음

        return "/bom/getBomList";        // 해당하는 뷰의 이름을 반환
    }

    /* BOM 삭제 */
    @PostMapping("/remove")
    public String remove(
//            @RequestParam("bomId") List<String> bomIds,
//            @RequestParam("matId") List<String> matIds,
            String[] chks,           // bomId, matIds
//            List<String> chks,           // bomId, matIds
            RedirectAttributes rttr
    ) {
        List<String> listBomMatIds = Arrays.asList(chks);
        List<String> bomIds = new ArrayList<>();
        List<String> matIds = new ArrayList<>();

        listBomMatIds.forEach(bomMatId -> {
            // split(",")로 할 경우, 1개만 삭제할 때 문제가 되므로 -로 바꿈(jsp 코드도 수정함.)
            String[] arrBomMatId = bomMatId.split("-");
            bomIds.add(arrBomMatId[0]);
            matIds.add(arrBomMatId[1]);
        });

        for(int i=0; i<bomIds.size(); i++) {
            Long bomId = Long.valueOf(bomIds.get(i).trim());
            Long matId = Long.valueOf(matIds.get(i).trim());

            log.info("remove....., bomIds: " + bomId + ", matIds: " + matId);
            bomService.removeOne(bomId, matId);
        }

        return "redirect:/bom/getBomList";
    }



}
