package com.jfeat.am.module.cg.api;
    
                                            
                    import com.jfeat.crud.plus.META;
import com.jfeat.am.core.jwt.JWTKit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.dao.DuplicateKeyException;
import com.jfeat.am.module.cg.services.domain.dao.QueryMasterResourceDao;
import com.jfeat.crud.base.tips.SuccessTip;
import com.jfeat.crud.base.request.Ids;
import com.jfeat.crud.base.tips.Tip;
import com.jfeat.am.module.log.annotation.BusinessLog;
import com.jfeat.crud.base.exception.BusinessCode;
import com.jfeat.crud.base.exception.BusinessException;
import com.jfeat.crud.plus.CRUDObject;
import com.jfeat.am.module.cg.api.permission.*;
import com.jfeat.am.common.annotation.Permission;
import java.math.BigDecimal;

import com.jfeat.am.module.cg.services.domain.service.*;
import com.jfeat.am.module.cg.services.domain.model.MasterResourceRecord;
import com.jfeat.am.module.cg.services.gen.persistence.model.MasterResource;

        import org.springframework.web.bind.annotation.RestController;
        
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSONArray;
/**
 * <p>
 *  api
 * </p>
 *
 * @author Code generator
 * @since 2021-01-25
 */
@RestController

@Api("MasterResource")
@RequestMapping("/api/crud/masterResource/masterResources")
public class MasterResourceEndpoint {

@Resource
            MasterResourceService masterResourceService;



@Resource
    QueryMasterResourceDao queryMasterResourceDao;

@BusinessLog(name = "MasterResource", value = "create MasterResource")
@Permission(MasterResourcePermission.MASTERRESOURCE_NEW)
@PostMapping
@ApiOperation(value = "新建 MasterResource",response = MasterResource.class)
public Tip createMasterResource(@RequestBody MasterResource entity){

        Integer affected=0;
        try{
                affected= masterResourceService.createMaster(entity);
    
        }catch(DuplicateKeyException e){
        throw new BusinessException(BusinessCode.DuplicateKey);
        }

        return SuccessTip.create(affected);
        }

@Permission(MasterResourcePermission.MASTERRESOURCE_VIEW)
@GetMapping("/{id}")
@ApiOperation(value = "查看 MasterResource",response = MasterResource.class)
public Tip getMasterResource(@PathVariable Long id){
                            return SuccessTip.create(masterResourceService.queryMasterModel(queryMasterResourceDao, id));
            }

@BusinessLog(name = "MasterResource", value = "update MasterResource")
@Permission(MasterResourcePermission.MASTERRESOURCE_EDIT)
@PutMapping("/{id}")
@ApiOperation(value = "修改 MasterResource",response = MasterResource.class)
public Tip updateMasterResource(@PathVariable Long id,@RequestBody MasterResource entity){
        entity.setId(id);
                return SuccessTip.create(masterResourceService.updateMaster(entity));
            }

@BusinessLog(name = "MasterResource", value = "delete MasterResource")
@Permission(MasterResourcePermission.MASTERRESOURCE_DELETE)
@DeleteMapping("/{id}")
@ApiOperation("删除 MasterResource")
public Tip deleteMasterResource(@PathVariable Long id){
                return SuccessTip.create(masterResourceService.deleteMaster(id));
            }

@Permission(MasterResourcePermission.MASTERRESOURCE_VIEW)
@ApiOperation(value = "MasterResource 列表信息",response = MasterResourceRecord.class)
@GetMapping
@ApiImplicitParams({
        @ApiImplicitParam(name= "pageNum", dataType = "Integer"),
        @ApiImplicitParam(name= "pageSize", dataType = "Integer"),
        @ApiImplicitParam(name= "search", dataType = "String"),
                                                                                        @ApiImplicitParam(name = "id", dataType = "Long"),
                                                                                                    @ApiImplicitParam(name = "orgId", dataType = "Long"),
                                                                                            @ApiImplicitParam(name = "orgTag", dataType = "String"),
                                                                                    @ApiImplicitParam(name = "name", dataType = "String"),
                                                                                    @ApiImplicitParam(name = "status", dataType = "String"),
                                                                                                    @ApiImplicitParam(name = "createTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "categoryId", dataType = "Long"),
                                                                                                    @ApiImplicitParam(name = "userId", dataType = "Long"),
                                                                                                    @ApiImplicitParam(name = "ownerId", dataType = "Long"),
                                                                                    @ApiImplicitParam(name = "code", dataType = "String"),
                                                                                    @ApiImplicitParam(name = "title", dataType = "String"),
                                                                                                    @ApiImplicitParam(name = "registeredTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "startTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "endTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "updateTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "closedTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "expiredTime", dataType = "Date"),
                                                                                                    @ApiImplicitParam(name = "appointedTime", dataType = "Date"),
                                                                                            @ApiImplicitParam(name = "invalid", dataType = "Integer"),
                                                                                    @ApiImplicitParam(name = "description", dataType = "String"),
                                                                                    @ApiImplicitParam(name = "note", dataType = "String"),
                                                                                                    @ApiImplicitParam(name = "sortNum", dataType = "Integer") ,
                @ApiImplicitParam(name = "orderBy", dataType = "String"),
                @ApiImplicitParam(name = "sort", dataType = "String")
            })
public Tip queryMasterResources(Page<MasterResourceRecord> page,
@RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
  @RequestParam(name = "search", required = false) String search,
                                                                                                                            @RequestParam(name = "id", required = false) Long id,
        
                                                                                                            @RequestParam(name = "orgId", required = false) Long orgId,
        
                                                                                                                        @RequestParam(name = "orgTag", required = false) String orgTag,
        
                                                                                                                @RequestParam(name = "name", required = false) String name,
        
                                                                                                                @RequestParam(name = "status", required = false) String status,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "createTime", required = false) Date createTime,
        
                                                                                                                                @RequestParam(name = "categoryId", required = false) Long categoryId,
        
                                                                                                                                @RequestParam(name = "userId", required = false) Long userId,
        
                                                                                                                                @RequestParam(name = "ownerId", required = false) Long ownerId,
        
                                                                                                                @RequestParam(name = "code", required = false) String code,
        
                                                                                                                @RequestParam(name = "title", required = false) String title,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "registeredTime", required = false) Date registeredTime,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "startTime", required = false) Date startTime,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "endTime", required = false) Date endTime,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "updateTime", required = false) Date updateTime,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "closedTime", required = false) Date closedTime,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "expiredTime", required = false) Date expiredTime,
        
                                                                                                                    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
                                    @RequestParam(name = "appointedTime", required = false) Date appointedTime,
        
                                                                                                                        @RequestParam(name = "invalid", required = false) Integer invalid,
        
                                                                                                                @RequestParam(name = "description", required = false) String description,
        
                                                                                                                @RequestParam(name = "note", required = false) String note,
        
                                                                                                                                @RequestParam(name = "sortNum", required = false) Integer sortNum,
        @RequestParam(name = "orderBy", required = false) String orderBy,
        @RequestParam(name = "sort", required = false)  String sort) {
        
            if(orderBy!=null&&orderBy.length()>0){
        if(sort!=null&&sort.length()>0){
        String pattern = "(ASC|DESC|asc|desc)";
        if(!sort.matches(pattern)){
        throw new BusinessException(BusinessCode.BadRequest.getCode(), "sort must be ASC or DESC");//此处异常类型根据实际情况而定
        }
        }else{
        sort = "ASC";
        }
        orderBy = "`"+orderBy+"`" +" "+sort;
        }
        page.setCurrent(pageNum);
        page.setSize(pageSize);

    MasterResourceRecord record = new MasterResourceRecord();
                                                                                    record.setId(id);
                                                                                                if (META.enabledSaaS()) {
                record.setOrgId(JWTKit.getOrgId());
            }
                                                                                                record.setOrgTag(orgTag);
                                                                                        record.setName(name);
                                                                                        record.setStatus(status);
                                                                                                record.setCreateTime(createTime);
                                                                                                record.setCategoryId(categoryId);
                                                                                                record.setUserId(userId);
                                                                                                record.setOwnerId(ownerId);
                                                                                        record.setCode(code);
                                                                                        record.setTitle(title);
                                                                                                record.setRegisteredTime(registeredTime);
                                                                                                record.setStartTime(startTime);
                                                                                                record.setEndTime(endTime);
                                                                                                record.setUpdateTime(updateTime);
                                                                                                record.setClosedTime(closedTime);
                                                                                                record.setExpiredTime(expiredTime);
                                                                                                record.setAppointedTime(appointedTime);
                                                                                        record.setInvalid(invalid);
                                                                                        record.setDescription(description);
                                                                                        record.setNote(note);
                                                                                                record.setSortNum(sortNum);
            
    
        List<MasterResourceRecord> masterResourcePage = queryMasterResourceDao.findMasterResourcePage(page, record, search, orderBy, null, null);

            page.setRecords(masterResourcePage);

        return SuccessTip.create(page);
        }
        }
