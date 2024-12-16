package com.example.prj.common.code.vo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CommonCodeVo {

    private String code;
    private String codeName;

}
