package com.javacloudstack;

import com.javacloudstack.pro.entrypoint.rest.AccountClientData;
import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        value = "account client",
        url = "https://639a344116b0fdad7757205c.mockapi.io/api/v1"
)
public interface AccountClient {

    @PostMapping(value = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
    AccountClientData searchInfoAccount(@RequestBody TransferRequest transferRequest);
}
