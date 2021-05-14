package com.ekiauhce.sfpmock.client;

import com.ekiauhce.sfpmock.api.objects.Doc;
import com.ekiauhce.sfpmock.api.objects.Id;
import com.ekiauhce.sfpmock.api.objects.Report;
import com.ekiauhce.sfpmock.api.objects.Wagon;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Random;

@Service
public class SenderService {
    private Logger logger = LoggerFactory.getLogger(SenderService.class);

    @Value("${receiver.url}")
    private String receiverUrl;

    private HttpHeaders headers;

    private ObjectMapper mapper = new ObjectMapper();

    private RestTemplate restTemplate;

    public SenderService() {
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        restTemplate = new RestTemplate();
    }

    public void sendDoc(Random random, Id docId, Id trainReportId, int trainNumber, List<Wagon> wagons) {
        StringWriter writer = new StringWriter();
        try {
            Doc doc = Doc.mock(random, docId, trainReportId, trainNumber, wagons);
            mapper.writeValue(writer, doc);
            writer.flush();
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
        }
        String requestJson = writer.toString();

        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        String answer = restTemplate.postForObject(receiverUrl, entity, String.class);
        System.out.println(answer);
    }

    public void sendReport(Random random, Id docId, Id trainReportId, int trainNumber, List<Wagon> wagons) {
        StringWriter writer = new StringWriter();
        try {
            Report report = Report.mock(random, docId, trainReportId, trainNumber, wagons);
            mapper.writeValue(writer, report);
            writer.flush();
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
        }
        String requestJson = writer.toString();

        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        String answer = restTemplate.postForObject(receiverUrl, entity, String.class);
        System.out.println(answer);
    }
}
