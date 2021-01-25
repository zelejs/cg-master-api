package com.jfeat.am.module.cg.services.gen.persistence.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Code generator
 * @since 2021-01-25
 */
@TableName("cg_master_resource")
public class MasterResource extends Model<MasterResource> {

    private static final long serialVersionUID=1L;

      /**
     * 主键id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 数据隔离组织id
     */
      private Long orgId;

      /**
     * 组织标识
     */
      private String orgTag;

      /**
     * 资源名字
     */
      private String name;

      /**
     * 状态[OPEN,SUBMITTED,APPROVED,REJECTED,CLOSED]
     */
      private String status;

      /**
     * 创建时间
     */
      private Date createTime;

      /**
     * 资源分类关联ID
     */
      private Long categoryId;

      /**
     * 资源归属用户
     */
      private Long userId;

      /**
     * 资源归属用户或用[owner_id]
     */
      private Long ownerId;

      /**
     * 资源唯一编号
     */
      private String code;

      /**
     * 资源标题
     */
      private String title;

      /**
     * 注册时间
     */
      private Date registeredTime;

      /**
     * 开始时间
     */
      private Date startTime;

      /**
     * 结束时间
     */
      private Date endTime;

      /**
     * 更新时间
     */
      private Date updateTime;

      /**
     * 关闭时间
     */
      private Date closedTime;

      /**
     * 过期时间
     */
      private Date expiredTime;

      /**
     * 预约时间
     */
      private Date appointedTime;

      /**
     * 是否无效
     */
      private Integer invalid;

      /**
     * 说明
     */
      private String description;

      /**
     * 备注
     */
      private String note;

    private Integer sortNum;

    
    public Long getId() {
        return id;
    }

      public MasterResource setId(Long id) {
          this.id = id;
          return this;
      }
    
    public Long getOrgId() {
        return orgId;
    }

      public MasterResource setOrgId(Long orgId) {
          this.orgId = orgId;
          return this;
      }
    
    public String getOrgTag() {
        return orgTag;
    }

      public MasterResource setOrgTag(String orgTag) {
          this.orgTag = orgTag;
          return this;
      }
    
    public String getName() {
        return name;
    }

      public MasterResource setName(String name) {
          this.name = name;
          return this;
      }
    
    public String getStatus() {
        return status;
    }

      public MasterResource setStatus(String status) {
          this.status = status;
          return this;
      }
    
    public Date getCreateTime() {
        return createTime;
    }

      public MasterResource setCreateTime(Date createTime) {
          this.createTime = createTime;
          return this;
      }
    
    public Long getCategoryId() {
        return categoryId;
    }

      public MasterResource setCategoryId(Long categoryId) {
          this.categoryId = categoryId;
          return this;
      }
    
    public Long getUserId() {
        return userId;
    }

      public MasterResource setUserId(Long userId) {
          this.userId = userId;
          return this;
      }
    
    public Long getOwnerId() {
        return ownerId;
    }

      public MasterResource setOwnerId(Long ownerId) {
          this.ownerId = ownerId;
          return this;
      }
    
    public String getCode() {
        return code;
    }

      public MasterResource setCode(String code) {
          this.code = code;
          return this;
      }
    
    public String getTitle() {
        return title;
    }

      public MasterResource setTitle(String title) {
          this.title = title;
          return this;
      }
    
    public Date getRegisteredTime() {
        return registeredTime;
    }

      public MasterResource setRegisteredTime(Date registeredTime) {
          this.registeredTime = registeredTime;
          return this;
      }
    
    public Date getStartTime() {
        return startTime;
    }

      public MasterResource setStartTime(Date startTime) {
          this.startTime = startTime;
          return this;
      }
    
    public Date getEndTime() {
        return endTime;
    }

      public MasterResource setEndTime(Date endTime) {
          this.endTime = endTime;
          return this;
      }
    
    public Date getUpdateTime() {
        return updateTime;
    }

      public MasterResource setUpdateTime(Date updateTime) {
          this.updateTime = updateTime;
          return this;
      }
    
    public Date getClosedTime() {
        return closedTime;
    }

      public MasterResource setClosedTime(Date closedTime) {
          this.closedTime = closedTime;
          return this;
      }
    
    public Date getExpiredTime() {
        return expiredTime;
    }

      public MasterResource setExpiredTime(Date expiredTime) {
          this.expiredTime = expiredTime;
          return this;
      }
    
    public Date getAppointedTime() {
        return appointedTime;
    }

      public MasterResource setAppointedTime(Date appointedTime) {
          this.appointedTime = appointedTime;
          return this;
      }
    
    public Integer getInvalid() {
        return invalid;
    }

      public MasterResource setInvalid(Integer invalid) {
          this.invalid = invalid;
          return this;
      }
    
    public String getDescription() {
        return description;
    }

      public MasterResource setDescription(String description) {
          this.description = description;
          return this;
      }
    
    public String getNote() {
        return note;
    }

      public MasterResource setNote(String note) {
          this.note = note;
          return this;
      }
    
    public Integer getSortNum() {
        return sortNum;
    }

      public MasterResource setSortNum(Integer sortNum) {
          this.sortNum = sortNum;
          return this;
      }

      public static final String ID = "id";

      public static final String ORG_ID = "org_id";

      public static final String ORG_TAG = "org_tag";

      public static final String NAME = "name";

      public static final String STATUS = "status";

      public static final String CREATE_TIME = "create_time";

      public static final String CATEGORY_ID = "category_id";

      public static final String USER_ID = "user_id";

      public static final String OWNER_ID = "owner_id";

      public static final String CODE = "code";

      public static final String TITLE = "title";

      public static final String REGISTERED_TIME = "registered_time";

      public static final String START_TIME = "start_time";

      public static final String END_TIME = "end_time";

      public static final String UPDATE_TIME = "update_time";

      public static final String CLOSED_TIME = "closed_time";

      public static final String EXPIRED_TIME = "expired_time";

      public static final String APPOINTED_TIME = "appointed_time";

      public static final String INVALID = "invalid";

      public static final String DESCRIPTION = "description";

      public static final String NOTE = "note";

      public static final String SORT_NUM = "sort_num";

      @Override
    protected Serializable pkVal() {
          return this.id;
      }

    @Override
    public String toString() {
        return "MasterResource{" +
              "id=" + id +
                  ", orgId=" + orgId +
                  ", orgTag=" + orgTag +
                  ", name=" + name +
                  ", status=" + status +
                  ", createTime=" + createTime +
                  ", categoryId=" + categoryId +
                  ", userId=" + userId +
                  ", ownerId=" + ownerId +
                  ", code=" + code +
                  ", title=" + title +
                  ", registeredTime=" + registeredTime +
                  ", startTime=" + startTime +
                  ", endTime=" + endTime +
                  ", updateTime=" + updateTime +
                  ", closedTime=" + closedTime +
                  ", expiredTime=" + expiredTime +
                  ", appointedTime=" + appointedTime +
                  ", invalid=" + invalid +
                  ", description=" + description +
                  ", note=" + note +
                  ", sortNum=" + sortNum +
              "}";
    }
}
