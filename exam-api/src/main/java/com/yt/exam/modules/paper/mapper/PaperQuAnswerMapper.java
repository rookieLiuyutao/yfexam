package com.yt.exam.modules.paper.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yt.exam.modules.paper.dto.ext.PaperQuAnswerExtDTO;
import com.yt.exam.modules.paper.entity.PaperQuAnswer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* <p>
* 试卷考题备选答案Mapper
* </p>
*
* @author 刘宇韬
*   2020-05-25 16:33
*/
public interface PaperQuAnswerMapper extends BaseMapper<PaperQuAnswer> {

    /**
     * 查找试卷试题答案列表
     * @param paperId
     * @param quId
     * @return
     */
    List<PaperQuAnswerExtDTO> list(@Param("paperId") String paperId, @Param("quId") String quId);
}
