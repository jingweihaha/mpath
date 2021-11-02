package com.zjw.mpath.service;

import com.zjw.mpath.domain.AppProgram;
import com.zjw.mpath.domain.Consultant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author jingw
 * @created 11/1/2021 10:28 PM
 * @project mpath
 */
public interface ConsultantService {

    Consultant saveConsultant(Consultant appProgram);

    Consultant modifyConsultant(Consultant appProgram);

    Consultant deleteConsultant(Consultant appProgram);

    Page<Consultant> searchConsultant(Pageable pageable);

    Consultant searchConsultantById(Long id);
}
