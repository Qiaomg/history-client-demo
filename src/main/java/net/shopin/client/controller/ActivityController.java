package net.shopin.client.controller;

import lombok.extern.slf4j.Slf4j;
import net.shopin.client.entity.BatchOperateActivityDto;
import net.shopin.client.service.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 券活动 前端控制器
 * </p>
 *
 * @author qiaomg
 * @since 2019-11-13
 */
@Slf4j
@CrossOrigin
@RestController
public class ActivityController {

    @Autowired
    private IActivityService activityService;

    private Integer[] activityId = new Integer[]{1};

    @GetMapping("/update")
    public Object batchOperate() throws Exception {
        activityService.batchOperateActivity(new Integer[]{288},1);
        return "client result";
    }


}
