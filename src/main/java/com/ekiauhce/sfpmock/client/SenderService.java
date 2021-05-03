package com.ekiauhce.sfpmock.client;

import com.ekiauhce.sfpmock.api.objects.Doc;
import com.ekiauhce.sfpmock.api.objects.Report;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class SenderService {

    @Value("${receiver.url}")
    private String receiverUrl;

    private final Random docRandom = new Random(19);
    private final Random reportRandom = new Random(19);

    public void sendDoc() {
        RestTemplate restTemplate = new RestTemplate();

        Doc doc = Doc.mock(
                docRandom.nextLong(),
                2000 + docRandom.nextInt(4000 - 2000)
        );

        restTemplate.postForObject(receiverUrl, doc, Doc.class);
    }

    public void sendReport() {
        RestTemplate restTemplate = new RestTemplate();

        Report report = Report.mock(
                reportRandom.nextLong(),
                2000 + reportRandom.nextInt(4000 - 2000)
        );

        restTemplate.postForObject(receiverUrl, report, Report.class);
    }
}
