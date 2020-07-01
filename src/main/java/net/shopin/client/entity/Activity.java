package net.shopin.client.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.shopin.history.annotation.History;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 券活动
 * </p>
 *
 * @author qiaomg
 * @since 2019-11-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("market_activity")
@History("market_activity_history")
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    /**
     * 活动名称(外显名)
     */
    private String nameOutSide;

    /**
     * 活动名称(外显名)
     */
    private String nameInSide;

    /**
     * 活动类型 activity_type
     */
    private Integer type;

    /**
     * 会员参与类型（多类型逗号分隔）
     * member_type
     */
    private String joinMemberType;

    /**
     * 会员展示类型（多类型逗号分隔）
     * member_type
     */
    private String showMemberType;

    /**
     * 参与渠道(多渠道逗号分隔)
     * dic_source
     */
    private String sourceJoin;

    /**
     * 展示渠道(多渠道逗号分隔)
     * dic_source
     */
    private String sourceShow;

    /**
     * 限制每人活动期间总领取次数。0代表无限制。规则：<=
     */
    private Integer couponCount;

    /**
     * 与此活动互斥的活动数量
     */
    private Integer excludeCount;

    /**
     * 每次获取的奖品数量
     */
    private Integer receiveCouponNumber;

    /**
     * 消耗积分。默认0
     */
    private Integer usePoints;

    /**
     * 限制每人活动期间总领取次数。0代表无限制。规则：<=
     */
    private Integer receiveCountAll;

    /**
     * 限制每人活动期间每天领取次数。0代表无限制。规则：<=
     */
    private Integer receiveCountDay;

    /**
     * 图片OSS相对地址，用英文分号;隔开。第一个为主图
     */
    private String imgUrl;

    /**
     * 外显描述
     */
    private String descOutSide;

    /**
     * 外显描述2(备注)
     */
    private String remarksOutSide;

    /**
     * 分享活动标题
     */
    private String shareTitle;

    /**
     * 分享活动描述
     */
    private String shareDesc;

    /**
     * 活动参与开始时间
     */
    private Date joinStartTime;

    /**
     * 活动参与结束时间
     */
    private Date joinEndTime;

    /**
     * 活动展示开始时间
     */
    private Date showStartTime;

    /**
     * 活动展示结束时间
     */
    private Date showEndTime;

    /**
     * 状态：0、待审核。1、待开始。2、进行中。 3、已结束。4、已过期。5、已作废
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updater;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getNameOutSide() {
        return nameOutSide;
    }

    public void setNameOutSide(String nameOutSide) {
        this.nameOutSide = nameOutSide;
    }

    public String getNameInSide() {
        return nameInSide;
    }

    public void setNameInSide(String nameInSide) {
        this.nameInSide = nameInSide;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getJoinMemberType() {
        return joinMemberType;
    }

    public void setJoinMemberType(String joinMemberType) {
        this.joinMemberType = joinMemberType;
    }

    public String getShowMemberType() {
        return showMemberType;
    }

    public void setShowMemberType(String showMemberType) {
        this.showMemberType = showMemberType;
    }

    public String getSourceJoin() {
        return sourceJoin;
    }

    public void setSourceJoin(String sourceJoin) {
        this.sourceJoin = sourceJoin;
    }

    public String getSourceShow() {
        return sourceShow;
    }

    public void setSourceShow(String sourceShow) {
        this.sourceShow = sourceShow;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getExcludeCount() {
        return excludeCount;
    }

    public void setExcludeCount(Integer excludeCount) {
        this.excludeCount = excludeCount;
    }

    public Integer getReceiveCouponNumber() {
        return receiveCouponNumber;
    }

    public void setReceiveCouponNumber(Integer receiveCouponNumber) {
        this.receiveCouponNumber = receiveCouponNumber;
    }

    public Integer getUsePoints() {
        return usePoints;
    }

    public void setUsePoints(Integer usePoints) {
        this.usePoints = usePoints;
    }

    public Integer getReceiveCountAll() {
        return receiveCountAll;
    }

    public void setReceiveCountAll(Integer receiveCountAll) {
        this.receiveCountAll = receiveCountAll;
    }

    public Integer getReceiveCountDay() {
        return receiveCountDay;
    }

    public void setReceiveCountDay(Integer receiveCountDay) {
        this.receiveCountDay = receiveCountDay;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescOutSide() {
        return descOutSide;
    }

    public void setDescOutSide(String descOutSide) {
        this.descOutSide = descOutSide;
    }

    public String getRemarksOutSide() {
        return remarksOutSide;
    }

    public void setRemarksOutSide(String remarksOutSide) {
        this.remarksOutSide = remarksOutSide;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public Date getJoinStartTime() {
        return joinStartTime;
    }

    public void setJoinStartTime(Date joinStartTime) {
        this.joinStartTime = joinStartTime;
    }

    public Date getJoinEndTime() {
        return joinEndTime;
    }

    public void setJoinEndTime(Date joinEndTime) {
        this.joinEndTime = joinEndTime;
    }

    public Date getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(Date showStartTime) {
        this.showStartTime = showStartTime;
    }

    public Date getShowEndTime() {
        return showEndTime;
    }

    public void setShowEndTime(Date showEndTime) {
        this.showEndTime = showEndTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
