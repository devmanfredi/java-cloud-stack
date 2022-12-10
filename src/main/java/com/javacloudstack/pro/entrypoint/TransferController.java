package com.javacloudstack.pro.entrypoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
