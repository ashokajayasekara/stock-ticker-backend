package com.stocks.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.backend.model.Ticker;

public interface TickerRepository extends JpaRepository<Ticker, Integer> {
	
}
