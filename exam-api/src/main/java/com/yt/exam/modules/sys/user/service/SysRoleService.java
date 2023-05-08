package com.yt.exam.modules.sys.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yt.exam.modules.sys.user.dto.SysRoleDTO;
import com.yt.exam.modules.sys.user.entity.SysRole;
import com.yt.exam.core.api.dto.PagingReqDTO;

/**
* <p>
* 角色业务类
* </p>
*
* @author 刘宇韬
*   2020-04-13 16:57
*/
public interface SysRoleService extends IService<SysRole> {

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<SysRoleDTO> paging(PagingReqDTO<SysRoleDTO> reqDTO);
}
