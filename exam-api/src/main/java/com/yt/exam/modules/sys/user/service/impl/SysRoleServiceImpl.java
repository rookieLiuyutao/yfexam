package com.yt.exam.modules.sys.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yt.exam.modules.sys.user.dto.SysRoleDTO;
import com.yt.exam.modules.sys.user.entity.SysRole;
import com.yt.exam.modules.sys.user.mapper.SysRoleMapper;
import com.yt.exam.modules.sys.user.service.SysRoleService;
import com.yt.exam.core.api.dto.PagingReqDTO;
import org.springframework.stereotype.Service;

/**
* <p>
* 语言设置 服务实现类
* </p>
*
* @author 刘宇韬
*   2020-04-13 16:57
*/
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public IPage<SysRoleDTO> paging(PagingReqDTO<SysRoleDTO> reqDTO) {

        //创建分页对象
        IPage<SysRole> query = new Page<>(reqDTO.getCurrent(), reqDTO.getSize());

        //查询条件
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();

        //获得数据
        IPage<SysRole> page = this.page(query, wrapper);
        //转换结果
        IPage<SysRoleDTO> pageData = JSON.parseObject(JSON.toJSONString(page), new TypeReference<Page<SysRoleDTO>>(){});
        return pageData;
     }
}
