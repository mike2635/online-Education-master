package com.lcqh.serviceedu.mapper;

import com.lcqh.serviceedu.entity.EduCourse;
import com.lcqh.serviceedu.entity.frontVo.CourseWebVo;
import com.lcqh.serviceedu.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author lcqh
 * @since 2020-08-06
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {
    CoursePublishVo getPublishCourseInfo(String id);

    CourseWebVo getBaseCourseInfo(String courseId);
}
