package com.yt.exam.modules.paper.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yt.exam.core.api.dto.PagingReqDTO;
import com.yt.exam.modules.paper.dto.PaperQuAnswerDTO;
import com.yt.exam.modules.paper.dto.ext.PaperQuAnswerExtDTO;
import com.yt.exam.modules.paper.entity.PaperQuAnswer;

import java.util.List;

/**
* <p>
* 试卷考题备选答案业务类
* </p>
*
* @author 刘宇韬
*   2020-05-25 16:33
*/
public interface PaperQuAnswerService extends IService<PaperQuAnswer> {

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<PaperQuAnswerDTO> paging(PagingReqDTO<PaperQuAnswerDTO> reqDTO);

    /**
     * 查找试卷试题答案列表
     * @param paperId
     * @param quId
     * @return
     */
    List<PaperQuAnswerExtDTO> listForExam(String paperId, String quId);

    /**
     * 查找答案列表，用来填充
     * @param paperId
     * @param quId
     * @return
     */
    List<PaperQuAnswer> listForFill(String paperId, String quId);
}
