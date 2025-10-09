package com.rct.humanresources.core.service;

import com.rct.humanresources.infra.delivery.exception.NoSuchElementFoundException;
import com.rct.humanresources.core.model.DepartmentDTO;
import com.rct.humanresources.core.mapper.DepartmentMapper;
import com.rct.humanresources.infra.persistence.entity.Department;
import com.rct.humanresources.infra.persistence.repository.DepartmentRepository;
import com.rct.humanresources.infra.persistence.repository.EmployerRepository;
import com.rct.humanresources.core.stubs.dto.DepartmentDTOStub;
import com.rct.humanresources.core.stubs.entity.DepartmentStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import module java.base;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceTest {
    @InjectMocks
    private DepartmentService service;
    @Mock
    private DepartmentRepository repository;
    @Mock
    private EmployerRepository employerRepository;
    @Mock
    private DepartmentMapper mapper;

    DepartmentDTO expectedDTO;
    List<DepartmentDTO> expectedDTOs;
    Department expectedModel;
    List<Department> expectedModels;

    @BeforeEach
    void setup() {
        expectedModel = DepartmentStub.any();
        expectedDTO = DepartmentDTOStub.any();
        expectedDTOs = DepartmentDTOStub.anyList();
        expectedModels = DepartmentStub.anyList();
    }

    @Test
    void testCreate() {
        doReturn(expectedModel)
                .when(repository)
                .save(expectedModel);
        mockMapperModel();

        var actual = this.service.save(expectedDTO);
        assertEquals(expectedDTO, actual);
    }

    @Test
    void testSave() {
        doReturn(expectedModel)
                .when(repository)
                .save(expectedModel);
        mockMapperModel();

        var actual = this.service.save(expectedDTO);
        assertEquals(expectedDTO, actual);
    }

    @Test
    void testFindById() {
        doReturn(Optional.of(expectedModel))
                .when(repository)
                .findById(any());
        mockMapperDTO();

        var actual = this.service.findById(1L);

        assertEquals(expectedDTO, actual);
    }

    @Test()
    void testFindByIdNotFound() {
        doReturn(Optional.empty())
                .when(repository)
                .findById(any());

        assertThrows(NoSuchElementFoundException.class, () -> this.service.findById(1L));

    }

    @Test
    void testFindAll() {
        doReturn(expectedModels)
                .when(repository)
                .findAll();
        mockMapperList();

        var actualList = this.service.findAll();

        assertEquals(expectedDTOs, actualList);
        assertEquals(expectedDTOs.size(), actualList.size());
    }

    @Test
    void testFindAllEmptyList() {
        doReturn(Collections.emptyList())
                .when(repository)
                .findAll();

        var actualList = this.service.findAll();

        assertEquals(Collections.emptyList(), actualList);
        assertEquals(0, actualList.size());
    }

    @Test
    void testDeleteById() {
        doNothing()
                .when(repository)
                .deleteById(1L);

        service.delete(1L);

        verify(repository, only()).deleteById(any());
    }

    @Test
    void testUpdate() {
        doReturn(expectedModel)
                .when(repository)
                .save(any());
        mockMapperModel();

        doReturn(true).when(repository).existsById(1L);

        var actual = service.update(1L, expectedDTO);

        assertEquals(expectedDTO, actual);
    }

    private void mockMapperModel() {
        doReturn(expectedModel).when(mapper).toEntity(expectedDTO);
        doReturn(expectedDTO).when(mapper).toDTO(expectedModel);
    }

    private void mockMapperDTO() {
        doReturn(expectedDTO).when(mapper).toDTO(expectedModel);
    }

    private void mockMapperList() {
        doReturn(expectedDTOs).when(mapper).toDTOList(expectedModels);
    }

}
