package com.example.Campaign.management.Controller;

import com.example.Campaign.management.Model.Campaigns;
import com.example.Campaign.management.Model.DTO.CompaignsDTO;
import com.example.Campaign.management.service.CampaignsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("CreateCampaign")
public class campaigncontroller {
    @Autowired
    CampaignsService campaignsService;

    @PostMapping("/campaign")
    public Campaigns campaigns(@RequestBody CompaignsDTO campaigns) throws ParseException {
        return campaignsService.createCampaigns(campaigns);
    }
}
