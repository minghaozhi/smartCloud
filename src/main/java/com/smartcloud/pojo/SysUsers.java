package com.smartcloud.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author join
 *
 */
@Table(name="sys_users")
public class SysUsers extends BasePojo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//主键自动生成策略
	private Long id;
	
	// 用户名
	private String name;
	
	//登录名
	private String loginName;

	// 密码
	private String password;
	
	//组织机构id
	private Long orgId;
	
	//组织结构名称
	private String orgName;
	
	//邮箱
	private String email;
	
	//最后登录日期
	private Date lastLoginDate;
	
	//最后登录ip
	private String lastLoginIp;
	
	//登录次数
	private Long loginCount;
	
	//排列顺序
	private Long priority;

	//QQ
	private String qq;
	
	//手机号
	private String phone;
	

	
	//用户头像
	private String userImg;
	
	//电话
	private String telphone;
	
	//性别
	private String gender;
	
	//生日
	private Date birthday;
	
	//描述
	private String description;
	
	//个性签名
	private String userSignature;

	//微信open id
	private String wechatOpenid;

	//有效性：0：有效，1：无效
	private Integer valid;

	//允许多机同时在线:0:允许，1：不允许
	private Integer simultaneousOnline;

	@Transient
	private Integer type;

	@Transient
	private List<Long>  orgIds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Long getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Long loginCount) {
		this.loginCount = loginCount;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserSignature() {
		return userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getWechatOpenid() {
		return wechatOpenid;
	}

	public void setWechatOpenid(String wechatOpenid) {
		this.wechatOpenid = wechatOpenid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<Long> getOrgIds() {
		return orgIds;
	}

	public void setOrgIds(List<Long> orgIds) {
		this.orgIds = orgIds;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Integer getSimultaneousOnline() {
		return simultaneousOnline;
	}

	public void setSimultaneousOnline(Integer simultaneousOnline) {
		this.simultaneousOnline = simultaneousOnline;
	}
}
