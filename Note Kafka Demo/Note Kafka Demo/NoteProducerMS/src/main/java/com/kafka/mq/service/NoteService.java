package com.kafka.mq.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafka.mq.model.Note;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class NoteService 
{
	
	private final Producer producer;

    @Autowired
    public NoteService(Producer producer) {
        this.producer = producer;
    }

    public String createNote(Note noteObj) throws JsonProcessingException {
        return producer.sendMessage(noteObj);
    }
}
