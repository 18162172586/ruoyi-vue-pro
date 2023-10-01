package cn.iocoder.yudao.module.promotion.service.combination;

import cn.iocoder.yudao.module.promotion.api.combination.dto.CombinationRecordCreateReqDTO;
import cn.iocoder.yudao.module.promotion.dal.dataobject.combination.CombinationRecordDO;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 拼团记录 Service 接口
 *
 * @author HUIHUI
 */
public interface CombinationRecordService {

    /**
     * 更新拼团状态
     *
     * @param status 状态
     * @param userId 用户编号
     * @param orderId 订单编号
     */
    void updateCombinationRecordStatusByUserIdAndOrderId(Integer status, Long userId, Long orderId);

    /**
     * 校验是否满足拼团条件
     * 如果不满足，会抛出异常
     *
     * @param activityId 活动编号
     * @param userId     用户编号
     * @param skuId      sku 编号
     * @param count      数量
     */
    void validateCombinationRecord(Long activityId, Long userId, Long skuId, Integer count);

    /**
     * 创建拼团记录
     *
     * @param reqDTO 创建信息
     */
    void createCombinationRecord(CombinationRecordCreateReqDTO reqDTO);

    /**
     * 更新拼团状态和开始时间
     *
     * @param status 状态
     * @param userId 用户编号
     * @param orderId 订单编号
     * @param startTime 开始时间
     */
    void updateRecordStatusAndStartTimeByUserIdAndOrderId(Integer status, Long userId, Long orderId, LocalDateTime startTime);

    /**
     * 获得拼团状态
     *
     * @param userId  用户编号
     * @param orderId 订单编号
     * @return 拼团状态
     */
    CombinationRecordDO getCombinationRecord(Long userId, Long orderId);

    /**
     * 获取拼团记录
     *
     * @param userId     用户 id
     * @param activityId 活动 id
     * @return 拼团记录列表
     */
    List<CombinationRecordDO> getRecordListByUserIdAndActivityId(Long userId, Long activityId);

}
