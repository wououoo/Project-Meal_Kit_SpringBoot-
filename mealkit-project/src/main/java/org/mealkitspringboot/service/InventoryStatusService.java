package org.mealkitspringboot.service;

import org.mealkitspringboot.domain.FinishedProductVO;
import org.mealkitspringboot.domain.InvenMateVO;
import java.util.List;

public interface InventoryStatusService {
    List<FinishedProductVO> selectInvenProd();

    List<InvenMateVO> selectInvenMate();
}
