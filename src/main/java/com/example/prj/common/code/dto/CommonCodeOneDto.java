package com.example.prj.common.code.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonCodeOneDto {
    private String code;
    private String codeName;
}
