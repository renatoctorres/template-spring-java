package com.rct.humanresources.core.service;

import com.rct.humanresources.core.mapper.EmployerMapper;
import com.rct.humanresources.core.model.EmployerDTO;
import com.rct.humanresources.infra.persistence.entity.Employer;
import com.rct.humanresources.infra.persistence.repository.EmployerRepository;
import org.springframework.stereotype.Service;

/**
 * EmployerService interface
 */
@Service
public class EmployerService extends BaseService<
        Employer,
        EmployerDTO,
        EmployerRepository,
        EmployerMapper> {

    public EmployerService(EmployerRepository repository, EmployerMapper mapper) {
        super(repository, mapper);
    }
}