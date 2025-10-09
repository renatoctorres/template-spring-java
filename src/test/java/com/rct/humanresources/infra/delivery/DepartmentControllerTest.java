package com.rct.humanresources.infra.delivery;

import java.util.List;
import com.rct.humanresources.TemplateSpringBootApplication;
import com.rct.humanresources.core.model.DepartmentDTO;
import com.rct.humanresources.core.service.DepartmentService;
import com.rct.humanresources.core.stubs.dto.DepartmentDTOStub;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
@ContextConfiguration(classes = TemplateSpringBootApplication.class)
class DepartmentControllerTest {
    @MockitoBean
    private DepartmentService service;
    @Autowired
    private MockMvc mockMvc;
    private final List<DepartmentDTO> expectedDTOs = DepartmentDTOStub.anyList();

    @Test
    void assertReturnSuccessWhenFindAll() throws Exception {
        given(service.findAll()).willReturn(expectedDTOs);
        mockMvc.perform(get("/departments")
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
