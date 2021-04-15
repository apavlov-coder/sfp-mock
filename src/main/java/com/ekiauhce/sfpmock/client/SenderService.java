package com.ekiauhce.sfpmock.client;

import com.ekiauhce.sfpmock.api.objects.Doc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SenderService {

    @Value("${receiver.url}")
    private String receiverUrl;

    public void sendReport() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(receiverUrl, Doc.mock(), Doc.class);
    }
}
