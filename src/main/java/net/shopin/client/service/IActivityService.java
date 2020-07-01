package net.shopin.client.service;

import com.baomidou.mybatisplus.extension.service.IService;
import net.shopin.client.entity.Activity;

/**
 * <p>
 * 券活动 服务类
 * </p>
 *
 * @author qiaomg
 * @since 2019-11-14
 */
public interface IActivityService extends IService<Activity> {

    /**
     * 批量修改活动状态
     * @param activityIds
     * @param state
     * @throws Exception
     */
    void batchOperateActivity(Integer[] activityIds, Integer state)throws Exception;


}
