package com.kafka.mqc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Note {

	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    	    
	    private String noteTitle;
	    private String noteText;
		public Note() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Note(Long id, String noteTitle, String noteText) {
			super();
			this.id = id;
			this.noteTitle = noteTitle;
			this.noteText = noteText;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
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
			return "Note [id=" + id + ", noteTitle=" + noteTitle + ", noteText=" + noteText + "]";
		} 
}
