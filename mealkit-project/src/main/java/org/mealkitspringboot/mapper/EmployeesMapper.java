package org.mealkitspringboot.mapper;

import org.mealkitspringboot.domain.EmployeesVO;
import java.util.List;

public interface EmployeesMapper {
    List<EmployeesVO> selectEmployees();

    int insertEmployees(EmployeesVO employeesVO);
}
