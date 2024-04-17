package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ACM_PRODUCT")
// @EntityListeners(AuditTrailListener.class)
public class Product implements Serializable {

	private static final long serialVersionUID = -7203814268449840070L;

	@Id
	@Column(name = "ID_ACM_PRODUCT", nullable = false)
	private Long id;

	@Column(name = "CODE", nullable = false)
	private String code;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@Column(name = "PRODUCT_ID_ABACUS")
	private Long productIdAbacus;

	@Column(name = "PRODUCT_TYPE_ID_ABACUS")
	private Long productTypeAbacus;

	@Column(name = "CREATION_DATE_ABACUS")
	private Date creationDateAbacus;

	@Column(name = "EDIT_DATE_ABACUS")
	private Date editDateAbacus;

	@Column(name = "INDIV")
	private Boolean productIndiv;

	@Column(name = "GRP")
	private Boolean productGrp;

	@Column(name = "ORG")
	private Boolean productOrg;

	@Column(name = "RATE_START_DATE")
	private Date rateStartDate;

	@Column(name = "RATE_END_DATE")
	private Date rateEndDate;

	@Column(name = "RATE")
	private BigDecimal rate;

	@Column(name = "MAXIMUM_BALANCE")
	private BigDecimal maximumBalance;

	@Column(name = "MINIMUM_TERM")
	private Integer minimumTerm;

	@Column(name = "MAXIMUM_TERM")
	private Integer maximumTerm;

	@Column(name = "ISSUE_FEE_PERCENTAGE_1")
	private BigDecimal issueFeePercentage1;

	@Column(name = "ISSUE_FEE_PERCENTAGE_2")
	private BigDecimal issueFeePercentage2;

	@Column(name = "ISSUE_FEE_PERCENTAGE_3")
	private BigDecimal issueFeePercentage3;

	@Column(name = "ISSUE_FEE_PERCENTAGE_4")
	private BigDecimal issueFeePercentage4;

	@Column(name = "USE_SCHEDULE_INTEREST")
	private Boolean useScheduleInterest;

	@Column(name = "CAPITALISE_INTEREST_WHEN_REFINANCING")
	private Boolean capitaliseInterestWhenRefinancing;

	@Column(name = "DECIMAL_PLACES")
	private Integer decimal;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "ABOUT_PRODUCT", length = 5000)
	private String aboutProduct;

	@Column(name = "MAXIMUM_AGE")
	private Integer maximumAge;

	@Column(name = "MINIMUM_AGE")
	private Integer minimumAge;

	@Column(name = "MAX_ACCOUNTS")
	private Integer maxAccounts;

	@Column(name = "MAXIMUM_DEFERRED_PERIOD")
	private Integer maximumDeferredPeriod;

	@Column(name = "MINIMUM_DEFERRED_PERIOD")
	private Integer minimumDeferredPeriod;

	@Column(name = "CU_INSURANCE_ID")
	private Integer cuInsuranceID;

	@Column(name = "ISSUE_FEE_VAT_1")
	private BigDecimal issueFeeVAT1;

	@Column(name = "ISSUE_FEE_VAT_2")
	private BigDecimal issueFeeVAT2;

	@Column(name = "INSURANCE_VAT")
	private BigDecimal insuranceVat;

	@Column(name = "ROUND_TYPE")
	private String roundType;

	@Column(name = "ISSUEFEEAMOUNT1")
	private BigDecimal issueFeeAmount1;

	@Column(name = "ISSUEFEEAMOUNT2")
	private BigDecimal issueFeeAmount2;

	@Column(name = "FLAT_INTEREST_RATE")
	private BigDecimal flatInterestRate;

	@Column(name = "RENEWAL_LOAN_PERCENTAGE")
	private BigDecimal renewalPercentage;

	@Transient
	private String token;

	@Column(name = "ISCORE_NUM_DAYS_EXPIRY_CHECK")
	private Integer maxNumDaysExpiry;

	@Column(name = "ISCORE_MAX_SCORE")
	private Integer maxScore;

	@Column(name = "ISCORE_MAX_ACTIVE_LOANS")
	private Integer maxActiveLoans;

	@Column(name = "ISCORE_MAX_NUM_DAYS_DUE")
	private Integer maxNumDaysDue;

	@Column(name = "AML_CHECK_POURCENTAGE")
	private BigDecimal amlCheckPourcentage;

	@Column(name = "ISCORE_MIN_ACTIVE_LOANS")
	private Integer minActiveLoans;

	@Column(name = "ISCORE_MIN_NUM_DAYS_DUE")
	private Integer minNumDaysDue;

	@Column(name = "ISCORE_MIN_SCORE")
	private Integer minScore;

	@Column(name = "TOPUP")
	private Boolean topup;

	@Column(name = "REFINANCE")
	private Boolean refinance;

	@Column(name = "IS_FREQUENCY")
	private Boolean isFrequency;

	@Column(name = "SUPPLIER")
	private Boolean supplier;

	@Column(name = "IS_FREQUENCY_WITH_DEFERRED_PEDIODE")
	private Boolean isFrequencyWithDeferredPeriode;

	@Column(name = "DISBURSE")
	private Boolean disburse;

	public Product() {

	}

	public Product(Long id) {

		this.id = id;
	}

	public Product(String code) {

		this.code = code;
	}

	public Product(Long id, String code, String description, Long productIdAbacus,
			Long productTypeAbacus, Date creationDateAbacus, Date editDateAbacus) {

		this.id = id;
		this.code = code;
		this.description = description;
		this.productIdAbacus = productIdAbacus;
		this.productTypeAbacus = productTypeAbacus;
		this.creationDateAbacus = creationDateAbacus;
		this.editDateAbacus = editDateAbacus;
	}

	public Product(String code, String description, Long productIdAbacus, Long productTypeAbacus,
			Date creationDateAbacus, Date editDateAbacus) {

		this.code = code;
		this.description = description;
		this.productIdAbacus = productIdAbacus;
		this.productTypeAbacus = productTypeAbacus;
		this.creationDateAbacus = creationDateAbacus;
		this.editDateAbacus = editDateAbacus;
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getCode() {

		return code;
	}

	public void setCode(String code) {

		this.code = code;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public Long getProductIdAbacus() {

		return productIdAbacus;
	}

	public void setProductIdAbacus(Long productIdAbacus) {

		this.productIdAbacus = productIdAbacus;
	}

	public Long getProductTypeAbacus() {

		return productTypeAbacus;
	}

	public void setProductTypeAbacus(Long productTypeAbacus) {

		this.productTypeAbacus = productTypeAbacus;
	}

	public Date getCreationDateAbacus() {

		return creationDateAbacus;
	}

	public void setCreationDateAbacus(Date creationDateAbacus) {

		this.creationDateAbacus = creationDateAbacus;
	}

	public Date getEditDateAbacus() {

		return editDateAbacus;
	}

	public void setEditDateAbacus(Date editDateAbacus) {

		this.editDateAbacus = editDateAbacus;
	}

	public String getToken() {

		return token;
	}

	public void setToken(String token) {

		this.token = token;
	}

	public Boolean getProductIndiv() {

		return productIndiv;
	}

	public void setProductIndiv(Boolean productIndiv) {

		this.productIndiv = productIndiv;
	}

	public Boolean getProductGrp() {

		return productGrp;
	}

	public void setProductGrp(Boolean productGrp) {

		this.productGrp = productGrp;
	}

	public Boolean getProductOrg() {

		return productOrg;
	}

	public void setProductOrg(Boolean productOrg) {

		this.productOrg = productOrg;
	}

	public Date getRateStartDate() {

		return rateStartDate;
	}

	public void setRateStartDate(Date rateStartDate) {

		this.rateStartDate = rateStartDate;
	}

	public Date getRateEndDate() {

		return rateEndDate;
	}

	public void setRateEndDate(Date rateEndDate) {

		this.rateEndDate = rateEndDate;
	}

	public BigDecimal getRate() {

		return rate;
	}

	public void setRate(BigDecimal rate) {

		this.rate = rate;
	}

	public BigDecimal getMaximumBalance() {

		return maximumBalance;
	}

	public void setMaximumBalance(BigDecimal maximumBalance) {

		this.maximumBalance = maximumBalance;
	}

	public Integer getMinimumTerm() {

		return minimumTerm;
	}

	public void setMinimumTerm(Integer minimumTerm) {

		this.minimumTerm = minimumTerm;
	}

	public Integer getMaximumTerm() {

		return maximumTerm;
	}

	public void setMaximumTerm(Integer maximumTerm) {

		this.maximumTerm = maximumTerm;
	}

	public BigDecimal getIssueFeePercentage1() {

		return issueFeePercentage1;
	}

	public void setIssueFeePercentage1(BigDecimal issueFeePercentage1) {

		this.issueFeePercentage1 = issueFeePercentage1;
	}

	public BigDecimal getIssueFeePercentage2() {

		return issueFeePercentage2;
	}

	public void setIssueFeePercentage2(BigDecimal issueFeePercentage2) {

		this.issueFeePercentage2 = issueFeePercentage2;
	}

	public BigDecimal getIssueFeePercentage3() {

		return issueFeePercentage3;
	}

	public void setIssueFeePercentage3(BigDecimal issueFeePercentage3) {

		this.issueFeePercentage3 = issueFeePercentage3;
	}

	public BigDecimal getIssueFeePercentage4() {

		return issueFeePercentage4;
	}

	public void setIssueFeePercentage4(BigDecimal issueFeePercentage4) {

		this.issueFeePercentage4 = issueFeePercentage4;
	}

	public Boolean getUseScheduleInterest() {

		return useScheduleInterest;
	}

	public void setUseScheduleInterest(Boolean useScheduleInterest) {

		this.useScheduleInterest = useScheduleInterest;
	}

	public Boolean getCapitaliseInterestWhenRefinancing() {

		return capitaliseInterestWhenRefinancing;
	}

	public void setCapitaliseInterestWhenRefinancing(Boolean capitaliseInterestWhenRefinancing) {

		this.capitaliseInterestWhenRefinancing = capitaliseInterestWhenRefinancing;
	}

	public Integer getDecimal() {

		return decimal;
	}

	public void setDecimal(Integer decimal) {

		this.decimal = decimal;
	}

	public String getCurrency() {

		return currency;
	}

	public void setCurrency(String currency) {

		this.currency = currency;
	}

	public String getAboutProduct() {

		return aboutProduct;
	}

	public void setAboutProduct(String aboutProduct) {

		this.aboutProduct = aboutProduct;
	}

	public Integer getMaximumAge() {

		return maximumAge;
	}

	public void setMaximumAge(Integer maximumAge) {

		this.maximumAge = maximumAge;
	}

	public Integer getMinimumAge() {

		return minimumAge;
	}

	void setMinimumAge(Integer minimumAge) {

		this.minimumAge = minimumAge;
	}

	public Integer getMaxAccounts() {

		return maxAccounts;
	}

	public void setMaxAccounts(Integer maxAccounts) {

		this.maxAccounts = maxAccounts;
	}

	public Integer getMaximumDeferredPeriod() {

		return maximumDeferredPeriod;
	}

	public void setMaximumDeferredPeriod(Integer maximumDeferredPeriod) {

		this.maximumDeferredPeriod = maximumDeferredPeriod;
	}

	public Integer getMinimumDeferredPeriod() {

		return minimumDeferredPeriod;
	}

	public void setMinimumDeferredPeriod(Integer minimumDeferredPeriod) {

		this.minimumDeferredPeriod = minimumDeferredPeriod;
	}

	public Integer getCuInsuranceID() {

		return cuInsuranceID;
	}

	public void setCuInsuranceID(Integer cuInsuranceID) {

		this.cuInsuranceID = cuInsuranceID;
	}

	public BigDecimal getIssueFeeVAT1() {

		return issueFeeVAT1;
	}

	public void setIssueFeeVAT1(BigDecimal issueFeeVAT1) {

		this.issueFeeVAT1 = issueFeeVAT1;
	}

	public BigDecimal getIssueFeeVAT2() {

		return issueFeeVAT2;
	}

	public void setIssueFeeVAT2(BigDecimal issueFeeVAT2) {

		this.issueFeeVAT2 = issueFeeVAT2;
	}

	public BigDecimal getInsuranceVat() {

		return insuranceVat;
	}

	public void setInsuranceVat(BigDecimal insuranceVat) {

		this.insuranceVat = insuranceVat;
	}

	public String getRoundType() {

		return roundType;
	}

	public void setRoundType(String roundType) {

		this.roundType = roundType;
	}

	public BigDecimal getIssueFeeAmount1() {

		return issueFeeAmount1;
	}

	public void setIssueFeeAmount1(BigDecimal issueFeeAmount1) {

		this.issueFeeAmount1 = issueFeeAmount1;
	}

	public BigDecimal getIssueFeeAmount2() {

		return issueFeeAmount2;
	}

	public void setIssueFeeAmount2(BigDecimal issueFeeAmount2) {

		this.issueFeeAmount2 = issueFeeAmount2;
	}

	public BigDecimal getFlatInterestRate() {

		return flatInterestRate;
	}

	public void setFlatInterestRate(BigDecimal flatInterestRate) {

		this.flatInterestRate = flatInterestRate;
	}

	public BigDecimal getRenewalPercentage() {

		return renewalPercentage;
	}

	public void setRenewalPercentage(BigDecimal renewalPercentage) {

		this.renewalPercentage = renewalPercentage;
	}

	@Override
	public String toString() {

		return "Product [id=" + id + ", code=" + code + ", description=" + description
				+ ", productIdAbacus=" + productIdAbacus + ", productTypeAbacus="
				+ productTypeAbacus + ", creationDateAbacus=" + creationDateAbacus
				+ ", editDateAbacus=" + editDateAbacus + ", productIndiv=" + productIndiv
				+ ", productGrp=" + productGrp + ", productOrg=" + productOrg + ", rateStartDate="
				+ rateStartDate + ", rateEndDate=" + rateEndDate + ", rate=" + rate
				+ ", maximumBalance=" + maximumBalance + ", minimumTerm=" + minimumTerm
				+ ", maximumTerm=" + maximumTerm + ", issueFeePercentage1=" + issueFeePercentage1
				+ ", issueFeePercentage2=" + issueFeePercentage2 + ", issueFeePercentage3="
				+ issueFeePercentage3 + ", issueFeePercentage4=" + issueFeePercentage4
				+ ", useScheduleInterest=" + useScheduleInterest
				+ ", capitaliseInterestWhenRefinancing=" + capitaliseInterestWhenRefinancing
				+ ", decimal=" + decimal + ", currency=" + currency + ", token=" + token + "]";
	}

	public Integer getMaxNumDaysExpiry() {

		return maxNumDaysExpiry;
	}

	public void setMaxNumDaysExpiry(Integer maxNumDaysExpiry) {

		this.maxNumDaysExpiry = maxNumDaysExpiry;
	}

	public Integer getMaxScore() {

		return maxScore;
	}

	public void setMaxScore(Integer maxScore) {

		this.maxScore = maxScore;
	}

	public Integer getMaxActiveLoans() {

		return maxActiveLoans;
	}

	public void setMaxActiveLoans(Integer maxActiveLoans) {

		this.maxActiveLoans = maxActiveLoans;
	}

	public Integer getMaxNumDaysDue() {

		return maxNumDaysDue;
	}

	public void setMaxNumDaysDue(Integer maxNumDaysDue) {

		this.maxNumDaysDue = maxNumDaysDue;
	}

	public BigDecimal getAmlCheckPourcentage() {

		return amlCheckPourcentage;
	}

	public void setAmlCheckPourcentage(BigDecimal amlCheckPourcentage) {

		this.amlCheckPourcentage = amlCheckPourcentage;
	}

	public Integer getMinActiveLoans() {

		return minActiveLoans;
	}

	public void setMinActiveLoans(Integer minActiveLoans) {

		this.minActiveLoans = minActiveLoans;
	}

	public Integer getMinNumDaysDue() {

		return minNumDaysDue;
	}

	public void setMinNumDaysDue(Integer minNumDaysDue) {

		this.minNumDaysDue = minNumDaysDue;
	}

	public Integer getMinScore() {

		return minScore;
	}

	public void setMinScore(Integer minScore) {

		this.minScore = minScore;
	}

	public Boolean getTopup() {

		return topup;
	}

	public void setTopup(Boolean topup) {

		this.topup = topup;
	}

	public Boolean getRefinance() {

		return refinance;
	}

	public void setRefinance(Boolean refinance) {

		this.refinance = refinance;
	}

	public Boolean getSupplier() {

		return supplier;
	}

	public void setSupplier(Boolean supplier) {

		this.supplier = supplier;
	}

	public Boolean getIsFrequency() {

		return isFrequency;
	}

	public void setIsFrequency(Boolean isFrequency) {

		this.isFrequency = isFrequency;
	}

	public Boolean getIsFrequencyWithDeferredPeriode() {

		return isFrequencyWithDeferredPeriode;
	}

	public void setIsFrequencyWithDeferredPeriode(Boolean isFrequencyWithDeferredPeriode) {

		this.isFrequencyWithDeferredPeriode = isFrequencyWithDeferredPeriode;
	}

	public Boolean getDisburse() {

		return disburse;
	}

	public void setDisburse(Boolean disburse) {

		this.disburse = disburse;
	}

}
