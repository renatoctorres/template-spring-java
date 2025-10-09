package com.rct.humanresources.infra.delivery;

import com.rct.humanresources.core.mapper.DepartmentMapper;
import com.rct.humanresources.core.model.DepartmentDTO;
import com.rct.humanresources.core.service.DepartmentService;
import com.rct.humanresources.infra.persistence.entity.Department;
import com.rct.humanresources.infra.persistence.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Department Controller - Rest API
 *
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController extends BaseController<
        Department,
        DepartmentDTO,
        DepartmentRepository,
        DepartmentMapper,
        DepartmentService> {

    public DepartmentController(DepartmentService service) {
        super(service);
    }
}
