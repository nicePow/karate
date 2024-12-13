package com.example.prj.common.code.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;

@RestController
@RequestMapping("v1/common/CommoonCode")
@Tag(name="CommonCodeController", description = "공통코드 조회")
@RequiredArgsConstructor
public class CommonCodeController {
    
    @GetMapping
    @Operation(summary = "공통코드 단건조회" , description = "공통코드 단건조회")
    @Parameter(name="code", description = "조회활 코드", example = "USE_YN")
    @Parameter(name="codeNm", description = "조회활 코드명", example = "사용여부")
    public String codeSearchOne(@RequestParam String code, @RequestParam String codeNm){
        return code + codeNm;
    }
        
}
