package com.yt.exam.modules.exam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yt.exam.modules.exam.dto.ext.ExamRepoExtDTO;
import com.yt.exam.modules.exam.entity.ExamRepo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* <p>
* 考试题库Mapper
* </p>
*
* @author 刘宇韬
*   2020-09-05 11:14
*/
public interface ExamRepoMapper extends BaseMapper<ExamRepo> {

    /**
     * 查找考试题库列表
     * @param examId
     * @return
     */
    List<ExamRepoExtDTO> listByExam(@Param("examId") String examId);
}
