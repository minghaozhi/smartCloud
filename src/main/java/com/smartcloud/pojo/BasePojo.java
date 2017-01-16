package com.smartcloud.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @description 基本类用户记录创建时间和修改时间
 * @author 董帮辉
 * @date 2016年3月24日
 * @version 1.0
 */
public abstract class BasePojo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date createTime;
	private Date updateTime;
	
	private Long createBy;
	private Long updateBy;

	//是否废弃
	private Integer isActivited;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public Integer getIsActivited() {
		return isActivited;
	}

	public void setIsActivited(Integer isActivited) {
		this.isActivited = isActivited;
	}
}
