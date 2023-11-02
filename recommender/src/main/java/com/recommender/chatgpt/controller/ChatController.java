package com.recommender.chatgpt.controller;

import com.recommender.chatgpt.dto.ChatRequest;
import com.recommender.chatgpt.dto.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
public class ChatController {
    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        // Creacion de la peticion
        ChatRequest request = new ChatRequest(model, prompt);
        // Llamar API de openAI u otro microservicio
        // Primer parametro: Es la URL del servicio u otro microservicio
        // Segundo parametro: Son los datos que necesita la peticion
        // Tercer parametro: El nombre de la clase a la cual se va a mapear el resultado de
        // la lllamada.
        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);
        if (Objects.isNull(response)
                || Objects.isNull(response.getChoices())
                || response.getChoices().isEmpty()) {
            return "No hay ninguna respuesta";
        }
        return response.getChoices().get(0).getMessage().getContent();
    }


}








