package com.entity.view;

import com.entity.LingjainshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 零件设备表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-24
 */
@TableName("lingjainshebei")
public class LingjainshebeiView extends LingjainshebeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public LingjainshebeiView() {

	}

	public LingjainshebeiView(LingjainshebeiEntity lingjainshebeiEntity) {
		try {
			BeanUtils.copyProperties(this, lingjainshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
