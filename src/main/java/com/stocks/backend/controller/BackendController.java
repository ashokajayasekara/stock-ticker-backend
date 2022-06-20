package com.stocks.backend.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.backend.model.Price;
import com.stocks.backend.model.Source;
import com.stocks.backend.model.Ticker;
import com.stocks.backend.repository.PriceRepository;
import com.stocks.backend.repository.SourcesRepository;
import com.stocks.backend.repository.TickerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BackendController {
	@Autowired
	SourcesRepository sourceRepository;

	@Autowired
	TickerRepository tickerRepository;

	@Autowired
	PriceRepository priceRepository;

	@GetMapping("/source/getAll")
	public ResponseEntity<List<Source>> getAllSources() {
		try {
			List<Source> sourceList = new ArrayList<Source>();
			sourceRepository.findAll().forEach(sourceList::add);

			if (sourceList.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(sourceList, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/ticker/getAll")
	public ResponseEntity<List<Ticker>> getAllTickers() {
		try {
			List<Ticker> tickerList = new ArrayList<Ticker>();
			
			tickerRepository.findAll().forEach(tickerList::add);
			
			if (tickerList.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(tickerList, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/prices/{sourceId}/{tickerId}")
	public ResponseEntity<Collection<Price>> getPrices(@PathVariable("sourceId") Integer sourceId, @PathVariable("tickerId") Integer tickerId) {
		try {
			Collection<Price> priceList = priceRepository.findFirst5BySourceIdAndTickerIdOrderByAddedDateDesc(sourceId, tickerId);
			if (priceList.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(priceList, HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/source/add")
	public ResponseEntity<Source> addSource(@RequestBody Source source) {
		Source _source = sourceRepository.save(new Source(source.getName(), source.getSourceDescription()));
		return new ResponseEntity<>(_source, HttpStatus.CREATED);
	}

	@PostMapping("/ticker/add")
	public ResponseEntity<Ticker> addSource(@RequestBody Ticker ticker) {
		Ticker _ticker = tickerRepository.save(new Ticker(ticker.getName(), ticker.getTickerDescription()));
		return new ResponseEntity<>(_ticker, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public String hello() {
		return "<h1>Stock App is running</h1>";
	}

	/**
	@PostMapping("/prices/add")
	public ResponseEntity<Price> addSource(@RequestBody Price price) {
		Price _price = priceRepository.save(price);
		return new ResponseEntity<>(_price, HttpStatus.CREATED);
	} */


}
