package com.lcqh.educms.controller;


import com.lcqh.commonutils.R;
import com.lcqh.educms.entity.CrmBanner;
import com.lcqh.educms.service.CrmBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 首页banner表 前端控制器
 * </p>
 *
 * @author lcqh
 * @since 2020-08-10
 */
@RestController
@RequestMapping("/educms/bannerfront")
@CrossOrigin
public class BannerFrontController {
    @Autowired
    private CrmBannerService crmBannerService;

    //查询所有banner
    @GetMapping("getAllBanner")
    public R getAllBanner(){
        List<CrmBanner> List =crmBannerService.selectAllBanner();
        return R.ok().data("list",List);
    }
}

