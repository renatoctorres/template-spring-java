package com.rct.humanresources.infra.delivery;

import com.rct.humanresources.core.mapper.EmployerMapper;
import com.rct.humanresources.core.model.EmployerDTO;

import com.rct.humanresources.core.service.EmployerService;
import com.rct.humanresources.infra.persistence.entity.Employer;
import com.rct.humanresources.infra.persistence.repository.EmployerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Employer Controller - Rest API
 *
 */
@RestController
@RequestMapping("/employers")
@Slf4j
public class EmployerController extends BaseController<
        Employer,
        EmployerDTO,
        EmployerRepository,
        EmployerMapper,
        EmployerService> {

    public EmployerController(EmployerService service) {
        super(service);
    }

}
