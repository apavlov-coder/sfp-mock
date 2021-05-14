package com.ekiauhce.sfpmock.config;

import com.ekiauhce.sfpmock.client.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Random;

@Configuration
@EnableScheduling
public class ApplicationConfig {

    @Autowired
    private SenderService senderService;

    private Random random;

    @PostConstruct
    void init() {
        Date date = new Date();
        random = new Random(date.getTime());
    }

    @Scheduled(fixedDelay = 1000 * 60 * 20)
    public void sendReport() {
        senderService.sendReport(random);
    }

    @Scheduled(fixedDelay = 1000 * 60 * 20, initialDelay = 1000 * 60)
    public void sendDoc() {
        senderService.sendDoc();
    }
}
