package com.kafka.mqc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.mqc.domain.Note;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer 
{
	
	private static final String noteTopic = "${topic.name}";

    private final ObjectMapper objectMapper;
    
    private final ModelMapper modelMapper;
    
    private final NoteService noteservice;

    @Autowired
    public Consumer(ObjectMapper objectMapper, ModelMapper modelMapper, NoteService noteservice) {
        this.objectMapper = objectMapper;
        this.modelMapper = modelMapper;
        this.noteservice = noteservice;
    }

    @KafkaListener(topics = noteTopic)
    public void consumeMessage(String message) throws JsonProcessingException {
//        log.info("message consumed {}", message);
        
    	System.out.println("message consumed {}"+ message);

        Note noteDto = objectMapper.readValue(message, Note.class);
        Note noteObj = modelMapper.map(noteDto, Note.class);

        noteservice.persistNote(noteObj);
    }
}
