package com.lcqh.serviceedu.service;

import com.lcqh.serviceedu.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author lcqh
 * @since 2020-08-06
 */
public interface EduVideoService extends IService<EduVideo> {

    void removeByCourseId(String courseId);

}
