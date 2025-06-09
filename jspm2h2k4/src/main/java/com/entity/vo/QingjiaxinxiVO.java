package com.entity.vo;

import com.entity.QingjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 请假信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
public class QingjiaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 请假日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qingjiariqi;
		
	/**
	 * 请假天数
	 */
	
	private String qingjiatianshu;
		
	/**
	 * 结束日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
