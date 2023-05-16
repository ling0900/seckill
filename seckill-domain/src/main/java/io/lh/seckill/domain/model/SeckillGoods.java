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
 * @description 秒杀商品
 */
@Data
public class SeckillGoods implements Serializable {
    private static final long serialVersionUID = -8447592991812016065L;
    //数据id
    private Long id;
    //商品名称
    private String goodsName;
    //秒杀活动id
    private Long activityId;
    //活动开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    //活动结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    //商品原价
    private BigDecimal originalPrice;
    //秒杀活动价格
    private BigDecimal activityPrice;
    //初始库存
    private Integer initialStock;
    //限购个数
    private Integer limitNum;
    //当前可用库存
    private Integer availableStock;
    //描述
    private String description;
    //图片
    private String imgUrl;
    //秒杀状态 0：已发布； 1：上线； 2：下线
    private Integer status;
}
