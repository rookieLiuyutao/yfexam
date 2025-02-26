package com.yt.exam.modules.sys.config.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yt.exam.core.utils.BeanMapper;
import com.yt.exam.modules.sys.config.dto.SysConfigDTO;
import com.yt.exam.modules.sys.config.entity.SysConfig;
import com.yt.exam.modules.sys.config.mapper.SysConfigMapper;
import com.yt.exam.modules.sys.config.service.SysConfigService;
import org.springframework.stereotype.Service;

/**
* <p>
* 语言设置 服务实现类
* </p>
*
* @author 刘宇韬
*   2020-04-17 09:12
*/
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

    @Override
    public SysConfigDTO find() {

        QueryWrapper<SysConfig> wrapper = new QueryWrapper<>();
        wrapper.last(" LIMIT 1");

        SysConfig entity = this.getOne(wrapper, false);
        SysConfigDTO dto = new SysConfigDTO();
        BeanMapper.copy(entity, dto);
        return dto;
    }
}
