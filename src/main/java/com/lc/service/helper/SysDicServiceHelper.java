package com.lc.service.helper;

import com.lc.common.BusinessException;
import com.lc.dao.SysDicMapper;
import com.lc.model.entity.SysDic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName SysDicServiceHelper
 * @Description 字典相关校验类
 * @Author licai
 * @Date 2020-09-08 10:04
 * @Version 1.0
 */
@Component
public class SysDicServiceHelper {
    @Resource
    private SysDicMapper sysDicMapper;
    
    
    
    public void checkInput(SysDic sysDic) {
        List list = sysDicMapper.selectList(sysDic);
        
        if(!CollectionUtils.isEmpty(list)){
            throw new BusinessException("字典编号不能相同");
        }
    }
}
