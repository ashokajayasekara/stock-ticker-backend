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
@Table(name= "sources")
public class Source {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	private int sourceId;
	
	@Column(name="sourceName")
	private String name;
	
	@Column(name="sourceDesc")
	private String sourceDescription;
	
	@Column(name = "addedDate", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date addedDate;
	
	public Source() {
	}
	
	public Source(String name, String sourceDescription) {
		this.name = name;
		this.sourceDescription = sourceDescription;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourceDescription() {
		return sourceDescription;
	}

	public void setSourceDescription(String sourceDescription) {
		this.sourceDescription = sourceDescription;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Source [sourceId=" + sourceId + ", name=" + name + ", sourceDescription=" + sourceDescription
				+ ", addedDate=" + addedDate + "]";
	}

	

}
