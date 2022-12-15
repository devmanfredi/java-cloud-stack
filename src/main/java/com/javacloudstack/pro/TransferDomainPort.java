package com.javacloudstack.pro;

import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;

public interface TransferDomainPort {
    public String searchInfoAccount(TransferRequest transferRequest);
}
