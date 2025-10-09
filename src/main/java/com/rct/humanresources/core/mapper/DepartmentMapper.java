package com.rct.humanresources.core.mapper;

import com.rct.humanresources.core.model.DepartmentDTO;
import com.rct.humanresources.infra.persistence.entity.Department;
import org.mapstruct.Mapper;

/**
 * Department - MapStruct Mapper interface
 */
@Mapper(componentModel = "spring")
public interface DepartmentMapper extends BaseMapper<Department, DepartmentDTO>{

}
