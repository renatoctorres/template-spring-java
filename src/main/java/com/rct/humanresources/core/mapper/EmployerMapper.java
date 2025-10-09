package com.rct.humanresources.core.mapper;

import com.rct.humanresources.core.model.EmployerDTO;
import com.rct.humanresources.infra.persistence.entity.Employer;
import org.mapstruct.Mapper;

/**
 * Employer - MapStruct Mapper interface
 */
@Mapper(componentModel = "spring")
public interface EmployerMapper extends BaseMapper<Employer, EmployerDTO>{
}
