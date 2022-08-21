package com.sistema.core.model.abstractions;

import java.util.List;

public interface BaseMapper<ENTIDADE, DTO> {


    ENTIDADE toEntity(DTO dto);

    DTO toDto(ENTIDADE entidade);

    List<ENTIDADE> toEntity(List<DTO> dtos);

    List<DTO> toDto(List<ENTIDADE> entidades);
}
