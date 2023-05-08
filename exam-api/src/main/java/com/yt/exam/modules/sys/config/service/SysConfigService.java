package com.yt.exam.modules.sys.config.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yt.exam.modules.sys.config.dto.SysConfigDTO;
import com.yt.exam.modules.sys.config.entity.SysConfig;

/**
* <p>
* 通用配置业务类
* </p>
*
* @author 刘宇韬
*   2020-04-17 09:12
*/
public interface SysConfigService extends IService<SysConfig> {

    /**
     * 查找配置信息
     * @return
     */
    SysConfigDTO find();
}
