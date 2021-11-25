package com.lcqh.serviceedu.service;

import com.lcqh.serviceedu.entity.EduChapter;
import com.lcqh.serviceedu.entity.chapter.ChapterVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author lcqh
 * @since 2020-08-06
 */
public interface EduChapterService extends IService<EduChapter> {

    List<ChapterVo> getChapterVoByCourseId(String courseId);

    boolean deleteChapterById(String chapterId);

    void removeChapterByCourseId(String courseId);

}
