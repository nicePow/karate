package com.example.prj.common.code.service;

import com.example.prj.common.code.dto.CommonCodeOneDto;
import com.example.prj.common.code.vo.CommonCodeVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CommonCodeService {

    private String[] codeArray = new String[]{"USE_YN"};
    private String[] codeNmArray = new String[]{"Y", "N"};

    public CommonCodeOneDto getCodeSearchOne(CommonCodeVo commonCodeVo){
        log.debug("CommonCodeService : {}, {}", commonCodeVo.getCode(), commonCodeVo.getCodeName());
        String cd = commonCodeVo.getCode();
        String nm = commonCodeVo.getCodeName();

        return CommonCodeOneDto.builder().code(cd).codeName(nm).build();
    }

}
