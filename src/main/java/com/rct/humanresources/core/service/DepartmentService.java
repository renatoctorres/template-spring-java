package com.rct.humanresources.core.service;

import com.rct.humanresources.core.mapper.DepartmentMapper;
import com.rct.humanresources.core.model.DepartmentDTO;
import com.rct.humanresources.infra.persistence.entity.Department;
import com.rct.humanresources.infra.persistence.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

/**
 * Department Service - Interface
 */

@Service
public class DepartmentService extends BaseService<
        Department,
        DepartmentDTO,
        DepartmentRepository,
        DepartmentMapper> {

    public DepartmentService(DepartmentRepository repository, DepartmentMapper mapper) {
        super(repository, mapper);
    }
}