package com.wang.accountService;

import com.wang.pojo.AccountRequest;
import com.wang.pojo.AccountResponse;

/**
 * 模拟记账服务类
 */

public interface ISimulatorService {

    public AccountResponse account(AccountRequest request);
}
