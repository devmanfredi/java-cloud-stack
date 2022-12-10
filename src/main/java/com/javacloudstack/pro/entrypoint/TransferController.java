package com.javacloudstack.pro.entrypoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("transfer/v1")
public class TransferController {

    @GetMapping
    public String hello() {
        return "Hello Word!!!!";
    }
}
