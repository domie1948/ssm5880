package com.dao;

import com.entity.ShangpinxiaoshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinxiaoshouVO;
import com.entity.view.ShangpinxiaoshouView;


/**
 * 商品销售
 * 
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
public interface ShangpinxiaoshouDao extends BaseMapper<ShangpinxiaoshouEntity> {
	
	List<ShangpinxiaoshouVO> selectListVO(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
	ShangpinxiaoshouVO selectVO(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
	List<ShangpinxiaoshouView> selectListView(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);

	List<ShangpinxiaoshouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
	ShangpinxiaoshouView selectView(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
}
