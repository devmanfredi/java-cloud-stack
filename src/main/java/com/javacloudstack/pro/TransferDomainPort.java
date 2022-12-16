package com.javacloudstack.pro;

import com.javacloudstack.pro.entrypoint.rest.AccountClientData;
import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;

public interface TransferDomainPort {
    AccountClientData searchInfoAccount(TransferRequest transferRequest);
}
