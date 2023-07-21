package com.kafka.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafka.mq.model.Note;
import com.kafka.mq.service.NoteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/notekafka")
public class NotePController {

	private final NoteService noteservice;

    @Autowired
    public NotePController(NoteService noteservice) {
        this.noteservice = noteservice;
    }

    @PostMapping("/add")
    public String createNoteHandler(@RequestBody Note noteObj) throws JsonProcessingException {
        
    	System.out.println("create note request received");

//    	log.info("create note request received");
        
    	return noteservice.createNote(noteObj);
    }
}
