package com.ekiauhce.sfpmock.config;

import com.ekiauhce.sfpmock.client.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ApplicationConfig {
    @Autowired
    SenderService senderService;

    @Scheduled(fixedDelay = 1000 * 10)
    public void sendReport() {
        senderService.sendReport();
    }
}
