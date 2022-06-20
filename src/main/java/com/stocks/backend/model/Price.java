package com.stocks.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "prices")
public class Price {
	@Id
	@Column(name="priceId",updatable=false,nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int priceId;

//	@ManyToOne
//	@JoinColumn(name = "ticker_id", referencedColumnName = "tickerId")
//	private Ticker tickerId;
//
//	@ManyToOne
//	@JoinColumn(name = "source_id", referencedColumnName = "sourceId" )
//	private Source sourceId;
	
	@Column(name="sourceId")
	private Integer sourceId;
	
	@Column(name="tickerId")
	private Integer tickerId;

	@Column(name = "price")
	private Double price;
	

	@Column(name = "addedDate", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date addedDate;


	public int getPriceId() {
		return priceId;
	}
	
	public Double getPrice() {
		return price;
	}


	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getTickerId() {
		return tickerId;
	}

	public void setTickerId(Integer tickerId) {
		this.tickerId = tickerId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", tickerId=" + tickerId + ", sourceId=" + sourceId + ", price=" + price
				+ ", addedDate=" + addedDate + "]";
	}

	
	

	

}
