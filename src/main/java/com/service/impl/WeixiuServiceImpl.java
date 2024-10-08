package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.WeixiuDao;
import com.entity.WeixiuEntity;
import com.service.WeixiuService;
import com.entity.view.WeixiuView;

/**
 * 维修信息表 服务实现类
 * @author 
 * @since 2021-02-24
 */
@Service("weixiuService")
@Transactional
public class WeixiuServiceImpl extends ServiceImpl<WeixiuDao, WeixiuEntity> implements WeixiuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<WeixiuView> page =new Query<WeixiuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
