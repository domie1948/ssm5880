package com.dao;

import com.entity.ShangpinjinhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinjinhuoVO;
import com.entity.view.ShangpinjinhuoView;


/**
 * 商品进货
 * 
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
public interface ShangpinjinhuoDao extends BaseMapper<ShangpinjinhuoEntity> {
	
	List<ShangpinjinhuoVO> selectListVO(@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);
	
	ShangpinjinhuoVO selectVO(@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);
	
	List<ShangpinjinhuoView> selectListView(@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);

	List<ShangpinjinhuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);
	
	ShangpinjinhuoView selectView(@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);
	
}
