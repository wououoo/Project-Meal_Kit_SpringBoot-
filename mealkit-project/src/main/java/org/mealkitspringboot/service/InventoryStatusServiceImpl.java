package org.mealkitspringboot.service;

import lombok.extern.log4j.Log4j;
import org.mealkitspringboot.domain.FinishedProductVO;
import org.mealkitspringboot.domain.InvenMateVO;
import org.mealkitspringboot.mapper.InventoryStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Log4j
@Service
public class InventoryStatusServiceImpl implements InventoryStatusService{
    @Autowired
    private InventoryStatusMapper invenMapper;
    @Override
    public List<FinishedProductVO> selectInvenProd() {
        List<FinishedProductVO> finishedProductVOList = invenMapper.selectInvenProd();
        return finishedProductVOList;
    }

    @Override
    public List<InvenMateVO> selectInvenMate() {
        List<InvenMateVO> invenMateVOList = invenMapper.selectInvenMate();
        return invenMateVOList;
    }
}
