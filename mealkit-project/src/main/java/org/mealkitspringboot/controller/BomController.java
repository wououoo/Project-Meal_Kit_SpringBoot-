package org.mealkitspringboot.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.BomListVo;
import org.mealkitspringboot.domain.CriteriaVo;
import org.mealkitspringboot.service.BomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Log4j
public class BomController {
    @Autowired
    private BomService bomService;

    /* BOM 현황 조회(검색) */
    // http://localhost:8008/bomList
    @GetMapping("/getBomList")
    public void bomList(CriteriaVo cri, Model model) {
        log.info("getBomList");

        List<BomListVo> bomVoList = bomService.getBomList(cri);
        model.addAttribute("bomList", bomVoList);
    }
}
