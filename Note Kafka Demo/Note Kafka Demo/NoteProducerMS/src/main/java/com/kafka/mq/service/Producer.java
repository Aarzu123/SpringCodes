package com.kafka.mq.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.mq.model.Note;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Producer 
{
	
	@Value("${topic.name}")
    private String noteTopic;

    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public String sendMessage(Note noteObj) throws JsonProcessingException {
        String noteAsMessage = objectMapper.writeValueAsString(noteObj);
        kafkaTemplate.send(noteTopic, noteAsMessage);

        System.out.println("Note produced {}"+noteAsMessage);
        
//        log.info("food order produced {}", noteAsMessage);

        return "message sent";
    }
}
