package com.stocks.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.backend.model.Source;

public interface SourcesRepository extends JpaRepository<Source,Integer> {
}
