package com.yt.exam.modules.exam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yt.exam.modules.exam.dto.ExamDTO;
import com.yt.exam.modules.exam.dto.response.ExamReviewRespDTO;
import com.yt.exam.modules.exam.dto.response.ExamOnlineRespDTO;
import com.yt.exam.modules.exam.entity.Exam;
import org.apache.ibatis.annotations.Param;

/**
* <p>
* 考试Mapper
* </p>
*
* @author 刘宇韬
*   2020-07-25 16:18
*/
public interface ExamMapper extends BaseMapper<Exam> {

    /**
     * 查找分页内容
     * @param page
     * @param query
     * @return
     */
    IPage<ExamDTO> paging(Page page, @Param("query") ExamDTO query);

    /**
     * 查找分页内容
     * @param page
     * @param query
     * @return
     */
    IPage<ExamReviewRespDTO> reviewPaging(Page page, @Param("query") ExamDTO query);

    /**
     * 在线考试分页响应类-考生视角
     * @param page
     * @param query
     * @return
     */
    IPage<ExamOnlineRespDTO> online(Page page, @Param("query") ExamDTO query);
}
