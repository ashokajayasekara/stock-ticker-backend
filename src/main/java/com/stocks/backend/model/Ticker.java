package com.stocks.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tickers")
public class Ticker {
	@Id
	@Column(name="tickerId",updatable=false,nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tickerId;
	
	@Column(name ="tickerName")
	private String name;
	
	@Column(name="tickerDesc")
	private String tickerDescription;
	
	@Column(name = "addedDate", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date addedDate;
	
	public Ticker() {
	}

	public Ticker(String name, String tickerDescription) {
		super();
		this.name = name;
		this.tickerDescription = tickerDescription;
	}

	public int getTickerId() {
		return tickerId;
	}

	public void setTickerId(int tickerId) {
		this.tickerId = tickerId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTickerDescription() {
		return tickerDescription;
	}

	public void setTickerDescription(String tickerDescription) {
		this.tickerDescription = tickerDescription;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	

}
