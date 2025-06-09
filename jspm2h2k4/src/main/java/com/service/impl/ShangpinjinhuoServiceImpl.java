package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangpinjinhuoDao;
import com.entity.ShangpinjinhuoEntity;
import com.service.ShangpinjinhuoService;
import com.entity.vo.ShangpinjinhuoVO;
import com.entity.view.ShangpinjinhuoView;

@Service("shangpinjinhuoService")
public class ShangpinjinhuoServiceImpl extends ServiceImpl<ShangpinjinhuoDao, ShangpinjinhuoEntity> implements ShangpinjinhuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinjinhuoEntity> page = this.selectPage(
                new Query<ShangpinjinhuoEntity>(params).getPage(),
                new EntityWrapper<ShangpinjinhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinjinhuoEntity> wrapper) {
		  Page<ShangpinjinhuoView> page =new Query<ShangpinjinhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinjinhuoVO> selectListVO(Wrapper<ShangpinjinhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinjinhuoVO selectVO(Wrapper<ShangpinjinhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinjinhuoView> selectListView(Wrapper<ShangpinjinhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinjinhuoView selectView(Wrapper<ShangpinjinhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
