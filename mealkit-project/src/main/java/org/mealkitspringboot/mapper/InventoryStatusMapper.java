package org.mealkitspringboot.mapper;

import org.mealkitspringboot.domain.FinishedProductVO;
import org.mealkitspringboot.domain.InvenMateVO;
import java.util.List;

public interface InventoryStatusMapper {
    List<FinishedProductVO> selectInvenProd();

    List<InvenMateVO> selectInvenMate();
}
