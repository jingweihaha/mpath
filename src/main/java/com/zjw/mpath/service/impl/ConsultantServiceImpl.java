package com.zjw.mpath.service.impl;

import com.zjw.mpath.domain.Consultant;
import com.zjw.mpath.service.ConsultantService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author jingw
 * @created 11/1/2021 10:29 PM
 * @project mpath
 */
@Service
public class ConsultantServiceImpl implements ConsultantService {
    @Override
    public Consultant saveConsultant(Consultant appProgram) {
        return null;
    }

    @Override
    public Consultant modifyConsultant(Consultant appProgram) {
        return null;
    }

    @Override
    public Consultant deleteConsultant(Consultant appProgram) {
        return null;
    }

    @Override
    public Page<Consultant> searchConsultant(Pageable pageable) {
        return null;
    }

    @Override
    public Consultant searchConsultantById(Long id) {
        return null;
    }
}
