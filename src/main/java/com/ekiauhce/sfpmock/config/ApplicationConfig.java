package com.ekiauhce.sfpmock.config;

import com.ekiauhce.sfpmock.api.objects.Id;
import com.ekiauhce.sfpmock.api.objects.Wagon;
import com.ekiauhce.sfpmock.client.SenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
@EnableScheduling
public class ApplicationConfig {
    private Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);

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
        Id docId = Id.mock(random);
        Id trainReportId = Id.mock(random);
        int trainNumber = 2000 + random.nextInt(4000 - 2000);
        List<Wagon> wagons = Stream
                .generate(Wagon::mock)
                .limit(57 + random.nextInt(40))
                .collect(Collectors.toList());

        senderService.sendDoc(random, docId, trainReportId, trainNumber, wagons);
        try {
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            logger.error(e.getLocalizedMessage());
        }
        senderService.sendReport(random, docId, trainReportId, trainNumber, wagons);
    }

//    @Scheduled(fixedDelay = 1000 * 60 * 20, initialDelay = 1000 * 60)
//    public void sendDoc() {
//        senderService.sendDoc();
//    }
}
