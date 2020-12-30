package com.wang.accountService.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wang.accountService.ISimulatorService;
import com.wang.pojo.AccountRequest;
import com.wang.pojo.AccountResponse;
import org.springframework.stereotype.Component;

@Service
@Component
public class SimulatorServiceImpl implements ISimulatorService {

    @Override
    public AccountResponse account(AccountRequest request) {
        return new AccountResponse();
    }
}
