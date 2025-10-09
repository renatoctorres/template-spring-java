package com.rct.humanresources.infra.delivery;

import com.rct.humanresources.core.mapper.BaseMapper;
import com.rct.humanresources.core.model.BaseDTO;
import com.rct.humanresources.core.service.BaseService;
import com.rct.humanresources.infra.persistence.entity.BaseEntity;
import com.rct.humanresources.infra.persistence.repository.BaseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;


public abstract class BaseController<
        E extends BaseEntity,
        D extends BaseDTO,
        R extends BaseRepository<E>,
        M extends BaseMapper<E, D>,
        S extends BaseService<E, D, R, M>> {

    protected final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(OK)
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public ResponseEntity<D> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public ResponseEntity<D> create(@RequestBody D dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @PutMapping("/{id}")
    @ResponseStatus(CREATED)
    public ResponseEntity<D> update(@PathVariable Long id, @RequestBody D dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}