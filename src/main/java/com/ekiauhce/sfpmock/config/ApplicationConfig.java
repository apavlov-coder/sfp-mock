package com.ekiauhce.sfpmock.config;

import com.ekiauhce.sfpmock.client.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ApplicationConfig {

    private final SenderService senderService;

    @Autowired
    public ApplicationConfig(SenderService senderService) {
        this.senderService = senderService;
    }

    @Scheduled(fixedDelay = 1000 * 60 * 20)
    public void sendReport() {
        senderService.sendReport();
    }

    @Scheduled(fixedDelay = 1000 * 60 * 20, initialDelay = 1000 * 60)
    public void sendDoc() {
        senderService.sendDoc();
    }
}
