package com.stocks.backend.repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.stocks.backend.model.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM prices p WHERE p.source_id = ?1 and p.ticker_id = ?2  ORDER BY p.added_date DESC LIMIT 5")
	Collection<Price> findFirst5BySourceIdAndTickerIdOrderByAddedDateDesc(Integer sourceId, Integer tickerId);
}
