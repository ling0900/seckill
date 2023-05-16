/**
 * Copyright 2022-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.lh.seckill.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lh
 * @version 1.0.0
 * @description 订单
 */
@Data
public class SeckillOrder implements Serializable {
    private static final long serialVersionUID = -2900817329676795585L;
    //订单id
    private Long id;
    //用户id
    private Long userId;
    //商品id
    private Long goodsId;
    //商品名称
    private String goodsName;
    //秒杀活动价格
    private BigDecimal activityPrice;
    //购买数量
    private Integer quantity;
    //订单总金额
    private BigDecimal orderPrice;
    //活动id
    private Long activityId;
    //订单状态 1：已创建 2：已支付 0：已取消； -1：已删除
    private Integer status;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
