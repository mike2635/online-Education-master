package com.lcqh.serviceedu.service;

import com.lcqh.serviceedu.entity.EduCourse;
import com.lcqh.serviceedu.entity.frontVo.CourseQueryVo;
import com.lcqh.serviceedu.entity.frontVo.CourseWebVo;
import com.lcqh.serviceedu.entity.vo.CourseInfoVo;
import com.lcqh.serviceedu.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author lcqh
 * @since 2020-08-06
 */
public interface EduCourseService extends IService<EduCourse> {

    String saveCourseInfo(CourseInfoVo courseInfoVo);

    CourseInfoVo getCourseInfo(String courseId);

    void updateCourseInfo(CourseInfoVo courseInfoVo);

    CoursePublishVo getPublishCourseInfo(String id);

    void removeCourse(String courseId);


    Map<String, Object> getTeacherInfo(Page<EduCourse> queryVoPage, CourseQueryVo courseQueryVo);

    CourseWebVo getBaseCourseInfo(String courseId);
}
