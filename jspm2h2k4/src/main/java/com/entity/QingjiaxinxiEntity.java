package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 请假信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
@TableName("qingjiaxinxi")
public class QingjiaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QingjiaxinxiEntity() {
		
	}
	
	public QingjiaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 请假日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qingjiariqi;
	
	/**
	 * 请假天数
	 */
					
	private String qingjiatianshu;
	
	/**
	 * 结束日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jieshuriqi;
	
	/**
	 * 请假内容
	 */
					
	private String qingjianeirong;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：请假日期
	 */
	public void setQingjiariqi(Date qingjiariqi) {
		this.qingjiariqi = qingjiariqi;
	}
	/**
	 * 获取：请假日期
	 */
	public Date getQingjiariqi() {
		return qingjiariqi;
	}
	/**
	 * 设置：请假天数
	 */
	public void setQingjiatianshu(String qingjiatianshu) {
		this.qingjiatianshu = qingjiatianshu;
	}
	/**
	 * 获取：请假天数
	 */
	public String getQingjiatianshu() {
		return qingjiatianshu;
	}
	/**
	 * 设置：结束日期
	 */
	public void setJieshuriqi(Date jieshuriqi) {
		this.jieshuriqi = jieshuriqi;
	}
	/**
	 * 获取：结束日期
	 */
	public Date getJieshuriqi() {
		return jieshuriqi;
	}
	/**
	 * 设置：请假内容
	 */
	public void setQingjianeirong(String qingjianeirong) {
		this.qingjianeirong = qingjianeirong;
	}
	/**
	 * 获取：请假内容
	 */
	public String getQingjianeirong() {
		return qingjianeirong;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
