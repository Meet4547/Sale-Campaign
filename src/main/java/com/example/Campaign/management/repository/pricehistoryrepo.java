package com.example.Campaign.management.repository;

import com.example.Campaign.management.Model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pricehistoryrepo extends JpaRepository<PriceHistory,Long> {
}
