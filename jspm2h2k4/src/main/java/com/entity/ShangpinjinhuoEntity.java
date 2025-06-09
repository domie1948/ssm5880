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
 * 商品进货
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
@TableName("shangpinjinhuo")
public class ShangpinjinhuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinjinhuoEntity() {
		
	}
	
	public ShangpinjinhuoEntity(T t) {
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
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品类型
	 */
					
	private String shangpinleixing;
	
	/**
	 * 进货价格
	 */
					
	private Integer jinhuojiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 总价格
	 */
					
	private Integer zongjiage;
	
	/**
	 * 进货日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jinhuoriqi;
	
	/**
	 * 进货公司
	 */
					
	private String jinhuogongsi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商品类型
	 */
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
	/**
	 * 设置：进货价格
	 */
	public void setJinhuojiage(Integer jinhuojiage) {
		this.jinhuojiage = jinhuojiage;
	}
	/**
	 * 获取：进货价格
	 */
	public Integer getJinhuojiage() {
		return jinhuojiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：总价格
	 */
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
	/**
	 * 设置：进货日期
	 */
	public void setJinhuoriqi(Date jinhuoriqi) {
		this.jinhuoriqi = jinhuoriqi;
	}
	/**
	 * 获取：进货日期
	 */
	public Date getJinhuoriqi() {
		return jinhuoriqi;
	}
	/**
	 * 设置：进货公司
	 */
	public void setJinhuogongsi(String jinhuogongsi) {
		this.jinhuogongsi = jinhuogongsi;
	}
	/**
	 * 获取：进货公司
	 */
	public String getJinhuogongsi() {
		return jinhuogongsi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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

}
