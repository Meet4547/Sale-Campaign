package com.example.Campaign.management.repository;

import com.example.Campaign.management.Model.Campaigns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CampaignsRepo extends JpaRepository<Campaigns,Long> {

    @Query(value = "select * from campaigns where end_date<=:currentDate ",nativeQuery = true)
    List<Campaigns> findActiveCampaigns(String currentDate);
}
