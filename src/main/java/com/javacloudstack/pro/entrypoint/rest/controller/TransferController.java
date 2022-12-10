package com.javacloudstack.pro.entrypoint.rest.controller;

import com.javacloudstack.pro.entrypoint.rest.dtos.TransferRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("transfer/v1")
public class TransferController {

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
        return ResponseEntity.status(200);
    }
}
