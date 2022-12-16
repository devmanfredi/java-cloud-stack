package com.javacloudstack.pro.core.usecase;

import com.javacloudstack.pro.TransferDomainPort;
import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@RequiredArgsConstructor
public class TransferUseCase {

    private final TransferDomainPort transferDomainPort;

    public String execute(TransferRequest transferRequest) {
        Assert.notNull(transferRequest, "Não pode ser nulo!");

        var accountData = transferDomainPort.searchInfoAccount(transferRequest);
        return "";
    }
}
