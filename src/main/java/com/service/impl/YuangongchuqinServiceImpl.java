package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.YuangongchuqinDao;
import com.entity.YuangongchuqinEntity;
import com.service.YuangongchuqinService;
import com.entity.view.YuangongchuqinView;

/**
 * 员工出勤表 服务实现类
 * @author 
 * @since 2021-02-24
 */
@Service("yuangongchuqinService")
@Transactional
public class YuangongchuqinServiceImpl extends ServiceImpl<YuangongchuqinDao, YuangongchuqinEntity> implements YuangongchuqinService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YuangongchuqinView> page =new Query<YuangongchuqinView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
