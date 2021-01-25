package com.jfeat.am.module.cg.services.gen.crud.service.impl;
// ServiceImpl start

            
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jfeat.crud.plus.FIELD;
import com.jfeat.am.module.cg.services.gen.persistence.model.MasterResource;
import com.jfeat.am.module.cg.services.gen.persistence.dao.MasterResourceMapper;
import com.jfeat.am.module.cg.services.gen.crud.service.CRUDMasterResourceService;
import org.springframework.stereotype.Service;
import com.jfeat.crud.base.exception.BusinessCode;
import com.jfeat.crud.base.exception.BusinessException;
import javax.annotation.Resource;
import com.jfeat.crud.plus.impl.CRUDServiceOnlyImpl;

/**
 * <p>
 *  implementation
 * </p>
 *CRUDMasterResourceService
 * @author Code generator
 * @since 2021-01-25
 */

@Service
public class CRUDMasterResourceServiceImpl  extends CRUDServiceOnlyImpl<MasterResource> implements CRUDMasterResourceService {





        @Resource
        protected MasterResourceMapper masterResourceMapper;

        @Override
        protected BaseMapper<MasterResource> getMasterMapper() {
                return masterResourceMapper;
        }







}


