package com.lcqh.educenter.mapper;

import com.lcqh.educenter.entity.UcenterMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author lcqh
 * @since 2020-08-11
 */


public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    Integer ucenterMemberService(String day);
}
