package com.javacloudstack;

import com.javacloudstack.pro.TransferDomainPort;
import com.javacloudstack.pro.entrypoint.rest.AccountClientData;
import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferAdapter implements TransferDomainPort {

    private final AccountClient accountClient;

    @Override
    public AccountClientData searchInfoAccount(TransferRequest transferRequest) {
        var accountClientData = this.accountClient.searchInfoAccount(transferRequest);
        //to verify if client has balance to send other account
        //call infos about other client
        //set value of transfer request to target client
        //update first's client balance
        return null;
    }
}
