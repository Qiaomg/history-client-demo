package net.shopin.client.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @title: BatchOperateActivityDto
 * @description: 批量操作活动数据
 * @author: qmg
 * @date: 2019/11/15 15:33
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BatchOperateActivityDto {

    private Integer[] activityId=null;

    private Integer state=null;

}
