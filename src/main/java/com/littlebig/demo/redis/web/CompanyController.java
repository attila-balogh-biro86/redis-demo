package com.littlebig.demo.redis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.littlebig.demo.redis.service.CompanyData;
import com.littlebig.demo.redis.service.CompanyDataService;

@RestController
public class CompanyController {

  private final CompanyDataService companyDataService;

  @Autowired
  public CompanyController(CompanyDataService companyDataService) {
    this.companyDataService = companyDataService;
  }

  @GetMapping(path = "/company/{id}")
  public CompanyData getCompanyData(@PathVariable("id") String id) throws Exception {
    return companyDataService.getCompanyData(id);
  }
}
