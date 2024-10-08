package com.dao;

import com.entity.GuanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanliyuanView;

/**
 * 管理员表 Dao 接口
 *
 * @author 
 * @since 2021-02-24
 */
public interface GuanliyuanDao extends BaseMapper<GuanliyuanEntity> {

   List<GuanliyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
