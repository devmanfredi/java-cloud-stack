package com.javacloudstack.pro.entrypoint.rest.controller;

import com.javacloudstack.pro.core.usecase.TransferUseCase;
import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("transfer/v1")
@RequiredArgsConstructor
public class TransferController {

    private final TransferUseCase transferUseCase;

    @GetMapping("/")
    public String healthCheck() {
        return "HEALTH CHECK OK!";
    }

    @GetMapping("/version")
    public String version() {
        return "The actual version is 1.0.0";
    }

    public ResponseEntity.BodyBuilder transfer(
            @RequestBody TransferRequest transferRequest
    ) {
        var operationId = UUID.randomUUID().toString();
        var res = transferUseCase.execute(transferRequest);
        return ResponseEntity.status(200);
    }
}
