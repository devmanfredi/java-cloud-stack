package com.javacloudstack;

import com.javacloudstack.pro.TransferDomainPort;
import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferAdapter implements TransferDomainPort {

    private final AccountClient accountClient;

    @Override
    public String searchInfoAccount(TransferRequest transferRequest) {
        var accountClientData = this.accountClient.searchInfoAccount(transferRequest);
        return null;
    }
}
