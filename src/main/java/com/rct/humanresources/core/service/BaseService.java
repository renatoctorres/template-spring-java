package com.rct.humanresources.core.service;

import com.rct.humanresources.core.mapper.BaseMapper;
import com.rct.humanresources.core.model.BaseDTO;
import com.rct.humanresources.infra.delivery.exception.NoSuchElementFoundException;
import com.rct.humanresources.infra.persistence.entity.BaseEntity;
import com.rct.humanresources.infra.persistence.repository.BaseRepository;
import org.springframework.transaction.annotation.Transactional;
import module java.base;

@Transactional
public abstract class BaseService<
        E extends BaseEntity,
        D extends BaseDTO,
        R extends BaseRepository<E>,
        M extends BaseMapper<E, D>> {

    protected final R repository;
    protected final M mapper;


    protected BaseService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<D> findAll() {
        return mapper.toDTOList(repository.findAll());
    }

    public D findById(Long id) {
        return repository
                .findById(id)
                .map(mapper::toDTO)
                .orElseThrow(NoSuchElementFoundException::new);
    }

    public D save(D dto) {
        E entity = mapper.toEntity(dto);
        E saved = repository.save(entity);
        return mapper.toDTO(saved);
    }

    public D update(Long id, D dto) {

        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Entity not found for update: " + id);
        }
        E entity = mapper.toEntity(dto);

        return mapper.toDTO(repository.save(entity));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
