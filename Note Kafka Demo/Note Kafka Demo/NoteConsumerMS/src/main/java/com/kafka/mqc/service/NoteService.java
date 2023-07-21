package com.kafka.mqc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafka.mqc.domain.Note;
import com.kafka.mqc.repository.INoteRepository;

@Service
public class NoteService 
{
	
	private final INoteRepository noterepository;

    @Autowired
    public NoteService(INoteRepository noterepository) {
        this.noterepository = noterepository;
    }

    public void persistNote(Note noteObj) {
        Note persistedNote = noterepository.save(noteObj);
        
        System.out.println("Note Data persisted {}"+ persistedNote);
        
//        log.info("Note Data persisted {}", persistedNote);
    }
}
