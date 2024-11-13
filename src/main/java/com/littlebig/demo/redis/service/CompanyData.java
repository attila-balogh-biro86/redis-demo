package com.littlebig.demo.redis.service;

import java.io.Serializable;
import java.util.Objects;
public class CompanyData implements Serializable {

  private final String companyId;
  private final String companyName;
  private final String companyAddress;
  private final String companyIdentifier;

  public CompanyData(String companyId, String companyName, String companyAddress, String companyIdentifier) {
    this.companyId = companyId;
    this.companyName = companyName;
    this.companyAddress = companyAddress;
    this.companyIdentifier = companyIdentifier;
  }

  public String getCompanyId() {
    return companyId;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getCompanyAddress() {
    return companyAddress;
  }

  public String getCompanyIdentifier() {
    return companyIdentifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyData that = (CompanyData) o;
    return Objects.equals(companyId, that.companyId) && Objects.equals(companyName, that.companyName) && Objects.equals(
        companyAddress, that.companyAddress) && Objects.equals(companyIdentifier, that.companyIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyName, companyAddress, companyIdentifier);
  }

  @Override
  public String toString() {
    return "CompanyData{" +
        "companyId=" + companyId +
        ", companyName='" + companyName + '\'' +
        ", companyAddress='" + companyAddress + '\'' +
        ", companyIdentifier='" + companyIdentifier + '\'' +
        '}';
  }
}
