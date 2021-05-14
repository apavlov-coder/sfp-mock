package com.ekiauhce.sfpmock.client;

import com.ekiauhce.sfpmock.api.objects.Doc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Random;

@Service
public class SenderService {

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

    public void sendReport(Random random) {
        StringWriter writer = new StringWriter();
        try {
            Doc val = Doc.mock(random);
            mapper.writeValue(writer, val);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String requestJson = writer.toString();

        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        String answer = restTemplate.postForObject(receiverUrl, entity, String.class);
        System.out.println(answer);
    }
}
