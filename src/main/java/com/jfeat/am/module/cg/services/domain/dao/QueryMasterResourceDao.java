package com.jfeat.am.module.cg.services.domain.dao;

import com.jfeat.am.module.cg.services.domain.model.MasterResourceRecord;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jfeat.crud.plus.QueryMasterDao;
import org.apache.ibatis.annotations.Param;
import com.jfeat.am.module.cg.services.gen.persistence.model.MasterResource;
import com.jfeat.am.module.cg.services.gen.crud.model.MasterResourceModel;

import java.util.Date;
import java.util.List;

/**
 * Created by Code generator on 2021-01-25
 */
public interface QueryMasterResourceDao extends QueryMasterDao<MasterResource> {
   /*
    * Query entity list by page
    */
    List<MasterResourceRecord> findMasterResourcePage(Page<MasterResourceRecord> page, @Param("record") MasterResourceRecord record,
                                            @Param("search") String search, @Param("orderBy") String orderBy,
                                            @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /*
     * Query entity model for details
     */
    MasterResourceModel queryMasterModel(@Param("id") Long id);
}