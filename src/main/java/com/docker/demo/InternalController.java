package com.docker.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InternalController {

    @Value("${internal.service.message}")
    private String internalMessage;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @GetMapping("/info")
    public String info() {
        return String.format(
                "Message: %s | DB Username: %s | DB Password: %s",
                internalMessage,
                dbUsername,
                dbPassword
        );
    }
}
