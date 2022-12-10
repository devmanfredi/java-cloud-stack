package com.javacloudstack.pro.entrypoint.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TransferControllerTest {

    @Autowired
    TransferController transferController;

    @Test
    void health() {
        assertEquals("HEALTH CHECK OK!", transferController.healthCheck());
    }

    @Test
    void version() {
        assertEquals("The actual version is 1.0.0", transferController.version());
    }
}
