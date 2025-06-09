package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangpinxiaoshouEntity;
import com.entity.view.ShangpinxiaoshouView;

import com.service.ShangpinxiaoshouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 商品销售
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
@RestController
@RequestMapping("/shangpinxiaoshou")
public class ShangpinxiaoshouController {
    @Autowired
    private ShangpinxiaoshouService shangpinxiaoshouService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpinxiaoshouEntity shangpinxiaoshou, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			shangpinxiaoshou.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShangpinxiaoshouEntity> ew = new EntityWrapper<ShangpinxiaoshouEntity>();
    	PageUtils page = shangpinxiaoshouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinxiaoshou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpinxiaoshouEntity shangpinxiaoshou, HttpServletRequest request){
        EntityWrapper<ShangpinxiaoshouEntity> ew = new EntityWrapper<ShangpinxiaoshouEntity>();
    	PageUtils page = shangpinxiaoshouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinxiaoshou), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpinxiaoshouEntity shangpinxiaoshou){
       	EntityWrapper<ShangpinxiaoshouEntity> ew = new EntityWrapper<ShangpinxiaoshouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinxiaoshou, "shangpinxiaoshou")); 
        return R.ok().put("data", shangpinxiaoshouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpinxiaoshouEntity shangpinxiaoshou){
        EntityWrapper< ShangpinxiaoshouEntity> ew = new EntityWrapper< ShangpinxiaoshouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinxiaoshou, "shangpinxiaoshou")); 
		ShangpinxiaoshouView shangpinxiaoshouView =  shangpinxiaoshouService.selectView(ew);
		return R.ok("查询商品销售成功").put("data", shangpinxiaoshouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpinxiaoshouEntity shangpinxiaoshou = shangpinxiaoshouService.selectById(id);
        return R.ok().put("data", shangpinxiaoshou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpinxiaoshouEntity shangpinxiaoshou = shangpinxiaoshouService.selectById(id);
        return R.ok().put("data", shangpinxiaoshou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinxiaoshouEntity shangpinxiaoshou, HttpServletRequest request){
    	shangpinxiaoshou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinxiaoshou);

        shangpinxiaoshouService.insert(shangpinxiaoshou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpinxiaoshouEntity shangpinxiaoshou, HttpServletRequest request){
    	shangpinxiaoshou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinxiaoshou);

        shangpinxiaoshouService.insert(shangpinxiaoshou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpinxiaoshouEntity shangpinxiaoshou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinxiaoshou);
        shangpinxiaoshouService.updateById(shangpinxiaoshou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinxiaoshouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShangpinxiaoshouEntity> wrapper = new EntityWrapper<ShangpinxiaoshouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shangpinxiaoshouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
