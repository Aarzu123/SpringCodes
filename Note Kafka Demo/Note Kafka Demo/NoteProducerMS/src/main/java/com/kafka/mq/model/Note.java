package com.kafka.mq.model;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class Note 
{
	String noteTitle;
	String noteText;
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteText() {
		return noteText;
	}
	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}
	@Override
	public String toString() {
		return "Note [noteTitle=" + noteTitle + ", noteText=" + noteText + "]";
	}
	
	
}