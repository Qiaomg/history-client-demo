package net.shopin.client.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import net.shopin.client.entity.Activity;
import net.shopin.client.mapper.ActivityMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 * 券活动 服务实现类
 * </p>
 *
 * @author qiaomg
 * @since 2019-11-14
 */
@Slf4j
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements net.shopin.client.service.IActivityService {
    @Resource
    private ActivityMapper activityMapper;

    @Override
    public void batchOperateActivity(Integer[] activityIds, Integer state) throws Exception {
        Activity activity = new Activity();
        activity.setState(state);
        for (int i = 0; i < activityIds.length; i++) {
            activity.setSid(activityIds[i]);
            activity.setUpdateTime(new Date());
            activity.setUpdater("Test Client");
            activityMapper.updateById(activity);
        }
    }




}
