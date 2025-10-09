package com.rct.humanresources.core.mapper;

import com.rct.humanresources.core.model.BaseDTO;
import com.rct.humanresources.infra.persistence.entity.BaseEntity;

import java.util.List;

public interface BaseMapper<T extends BaseEntity, D extends BaseDTO> {
    D toDTO(T entity);
    T toEntity(D dto);

    default List<D> toDTOList(List<T> entities) {
        return entities == null ? List.of() : entities.stream()
                .map(this::toDTO)
                .toList();
    }

}