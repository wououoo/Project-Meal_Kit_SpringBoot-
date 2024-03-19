package org.mealkitspringboot.controller;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.FinishedProductVO;
import org.mealkitspringboot.domain.InvenMateVO;
import org.mealkitspringboot.service.InventoryStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@Log4j
public class InvenController {
    @Autowired
    private InventoryStatusService inventoryStatusService;

    @GetMapping("/inventoryStatus")
    public String inventoryStatus(
            Model model) {
        List<FinishedProductVO> finishedProductVOList = inventoryStatusService.selectInvenProd();
        List<InvenMateVO> invenMateVOList = inventoryStatusService.selectInvenMate();
        model.addAttribute("finishedProductVOList",finishedProductVOList);
        model.addAttribute("invenMateVOList",invenMateVOList);
        return "/users/inventoryStatus";
    }
}
