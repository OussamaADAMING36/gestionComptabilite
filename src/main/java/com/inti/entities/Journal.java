package com.inti.entities;

import java.util.Date;

public class Journal {
	private Long idJournal;
	private Date date;
	
	public Journal() {
	}

	public Journal(Date date) {
		this.date = date;
	}

	public Long getIdJournal() {
		return idJournal;
	}

	public void setIdJournal(Long idJournal) {
		this.idJournal = idJournal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Journal [idJournal=" + idJournal + ", date=" + date + "]";
	} 
	
	
}
