package com.littlebig.demo.redis.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class InMemoryCompanyDataService implements CompanyDataService {


  private final Map<String, CompanyData> companyDataMap = new ConcurrentHashMap<>();

  @PostConstruct
  public void init(){
    CompanyData companyData = new CompanyData("LBC-2024", "LittleBig", "Barcelona","LBC");
    CompanyData companyData2 = new CompanyData("AMS-2024", "Amaris", "Valencia","AMS");
    companyDataMap.put(companyData.getCompanyId(), companyData);
    companyDataMap.put(companyData2.getCompanyId(), companyData);
  }

  @Cacheable(value = "companyCache", key = "#companyId")
  @Override
  public CompanyData getCompanyData(String companyId) throws Exception {
    Thread.sleep(5000);
    return companyDataMap.get(companyId);
  }
}
