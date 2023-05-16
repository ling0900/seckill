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
package io.lh.seckill.application.service.impl;

import io.lh.seckill.application.service.SeckillUserService;
import io.lh.seckill.domain.model.SeckillUser;
import io.lh.seckill.domain.repository.SeckillUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 
 * @version 1.0.0
 * @description 用户Service
 * @github 
 * @copyright 
 */
@Service
public class SeckillUserServiceImpl implements SeckillUserService {
    @Autowired
    private SeckillUserRepository seckillUserRepository;


    @Override
    public SeckillUser getSeckillUserByUserName(String userName) {
        return seckillUserRepository.getSeckillUserByUserName(userName);
    }
}
