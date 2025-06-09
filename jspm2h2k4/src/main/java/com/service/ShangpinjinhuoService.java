package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinjinhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinjinhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinjinhuoView;


/**
 * 商品进货
 *
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
public interface ShangpinjinhuoService extends IService<ShangpinjinhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinjinhuoVO> selectListVO(Wrapper<ShangpinjinhuoEntity> wrapper);
   	
   	ShangpinjinhuoVO selectVO(@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);
   	
   	List<ShangpinjinhuoView> selectListView(Wrapper<ShangpinjinhuoEntity> wrapper);
   	
   	ShangpinjinhuoView selectView(@Param("ew") Wrapper<ShangpinjinhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinjinhuoEntity> wrapper);
   	
}

