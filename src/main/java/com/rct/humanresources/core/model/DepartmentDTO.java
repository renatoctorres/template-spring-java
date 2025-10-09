package com.rct.humanresources.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Department DTO
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO extends BaseDTO {
    @JsonProperty("nome")
    private String name;
    @JsonProperty("descricao")
    private String description;
}
