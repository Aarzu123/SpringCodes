package com.kafka.mqc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafka.mqc.domain.Note;

@Repository
public interface INoteRepository  extends JpaRepository<Note, Long> 
{
	
}