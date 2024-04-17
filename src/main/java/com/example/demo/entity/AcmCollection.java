package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ACM_COLLECTION")
public class AcmCollection implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1633108725945267561L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ACM_COLLECTION", unique = true, nullable = false)
	private Long id;

	/** The type customer. */
	@Column(name = "CUSTOMER_TYPE", nullable = false)
	private String typeCustomer;

	/** The cutomer id extern. */
	@Column(name = "CUSTOMER_ID_EXTERN", nullable = false)
	private Long customerIdExtern;

	/** The account number. */
	@Column(name = "ACCOUNT_NUMBER", nullable = false, length = 256)
	private String accountNumber;

	/** The product description. */
	@Column(name = "PRODUCT_DESCRIPTION", nullable = false, length = 512)
	private String productDescription;

	/** The customer name. */
	@Column(name = "CUSTOMER_NAME", nullable = false, length = 512)
	private String customerName;

	/** The branch description. */
	@Column(name = "BRANCH_DESCRIPTION", nullable = false, length = 256)
	private String branchDescription;

	/** The amount. */
	@Column(name = "AMOUNT", nullable = false)
	private BigDecimal amount;

	/** The loan officer. */
	@Column(name = "LOAN_OFFICER", length = 50)
	private String loanOfficer;

	/** The first unpaid installment. */
	@Column(name = "FIRST_UNPAID_INSTALLMENT", nullable = false)
	private Date firstUnpaidInstallment;

	/** The unpaid amount. */
	@Column(name = "UNPAID_AMOUNT", nullable = false)
	private BigDecimal unpaidAmount;

	/** The late days. */
	@Column(name = "LATE_DAYS", nullable = false)
	private Integer lateDays;

	/** The number of unpaid installment. */
	@Column(name = "NUMBER_OF_UNPAID_INSTALLMENT", nullable = false)
	private Integer numberOfUnpaidInstallment;

	/** The status. */
	@Column(name = "STATUS")
	private Integer status;

	/** The id acm collection step. */
	@Column(name = "ID_ACM_COLLECTION_STEP", nullable = false)
	private Long idAcmCollectionStep;

	/** The product id. */
	@Column(name = "PRODUCT_ID", nullable = false)
	private Long productId;

	/** The branch id. */
	@Column(name = "BRANCH_ID", nullable = false)
	private Long branchId;

	/** The currency symbol. */
	@Column(name = "CURRENCY_SYMBOL")
	private String currencySymbol;

	/** The currency decimal places. */
	@Column(name = "CURRENCY_DECIMALPLACES")
	private Integer currencyDecimalPlaces;

	/** The id loan extern. */
	@Column(name = "ID_LOAN_EXTERN")
	private Integer idLoanExtern;

	/** The available date. */
	@Column(name = "AVAILABLE_DATE")
	private Date availableDate;

	/** The owner. */
	@Column(name = "COLLECTION_OWNER")
	private String owner;

	/** The owner name. */
	@Column(name = "COLLECTION_OWNER_NAME")
	private String ownerName;

	/** The group owner. */
	@Column(name = "GROUP_OWNER")
	private String groupOwner;

	/** The group owner name. */
	@Column(name = "GROUP_OWNER_NAME")
	private String groupOwnerName;

	/** The collection type. */
	@Column(name = "COLLECTION_TYPE")
	private String collectionType;

	/** The collection type. */
	@Column(name = "ID_PARENT_COLLECTION")
	private Long idParentCollection;

	/** The Current status Label. */
	@Column(name = "STATUT_LIBELLE")
	private String statutLibelle;

	/** The Done status Label. */
	@Column(name = "STATUT_LIBELLE_DONE")
	private String statutLibelleDone;
	
	/** The statut workflow. */
	@Column(name = "STATUT_WORKFLOW")
	private String statutWorkflow;

	/**
	 * Gets the statut workflow.
	 *
	 * @return the statut workflow
	 */
	public String getStatutWorkflow() {
		return statutWorkflow;
	}

	/**
	 * Sets the statut workflow.
	 *
	 * @param statutWorkflow the new statut workflow
	 */
	public void setStatutWorkflow(String statutWorkflow) {
		this.statutWorkflow = statutWorkflow;
	}

	/**
	 * Instantiates a new acm collection.
	 */
	public AcmCollection() {

	}

	/**
	 * Instantiates a new acm collection.
	 *
	 * @param id the id
	 */
	public AcmCollection(Long id) {

		this.id = id;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {

		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {

		this.id = id;
	}

	/**
	 * Gets the type customer.
	 *
	 * @return the type customer
	 */
	public String getTypeCustomer() {

		return typeCustomer;
	}

	/**
	 * Sets the type customer.
	 *
	 * @param typeCustomer the new type customer
	 */
	public void setTypeCustomer(String typeCustomer) {

		this.typeCustomer = typeCustomer;
	}

	/**
	 * Gets the account number.
	 *
	 * @return the account number
	 */
	public String getAccountNumber() {

		return accountNumber;
	}

	/**
	 * Sets the account number.
	 *
	 * @param accountNumber the new account number
	 */
	public void setAccountNumber(String accountNumber) {

		this.accountNumber = accountNumber;
	}

	/**
	 * Gets the product description.
	 *
	 * @return the product description
	 */
	public String getProductDescription() {

		return productDescription;
	}

	
	public void setProductDescription(String productDescription) {

		this.productDescription = productDescription;
	}

	public String getCustomerName() {

		return customerName;
	}

	public void setCustomerName(String customerName) {

		this.customerName = customerName;
	}

	public String getBranchDescription() {

		return branchDescription;
	}

	
	public void setBranchDescription(String branchDescription) {

		this.branchDescription = branchDescription;
	}

	
	public BigDecimal getAmount() {

		return amount;
	}


	public void setAmount(BigDecimal amount) {

		this.amount = amount;
	}

	public String getLoanOfficer() {

		return loanOfficer;
	}


	public void setLoanOfficer(String loanOfficer) {

		this.loanOfficer = loanOfficer;
	}

	/**
	 * Gets the first unpaid installment.
	 *
	 * @return the first unpaid installment
	 */
	public Date getFirstUnpaidInstallment() {

		return firstUnpaidInstallment;
	}

	/**
	 * Sets the first unpaid installment.
	 *
	 * @param firstUnpaidInstallment the new first unpaid installment
	 */
	public void setFirstUnpaidInstallment(Date firstUnpaidInstallment) {

		this.firstUnpaidInstallment = firstUnpaidInstallment;
	}

	/**
	 * Gets the unpaid amount.
	 *
	 * @return the unpaid amount
	 */
	public BigDecimal getUnpaidAmount() {

		return unpaidAmount;
	}

	/**
	 * Sets the unpaid amount.
	 *
	 * @param unpaidAmount the new unpaid amount
	 */
	public void setUnpaidAmount(BigDecimal unpaidAmount) {

		this.unpaidAmount = unpaidAmount;
	}

	/**
	 * Gets the late days.
	 *
	 * @return the late days
	 */
	public Integer getLateDays() {

		return lateDays;
	}

	/**
	 * Sets the late days.
	 *
	 * @param lateDays the new late days
	 */
	public void setLateDays(Integer lateDays) {

		this.lateDays = lateDays;
	}

	public Integer getNumberOfUnpaidInstallment() {

		return numberOfUnpaidInstallment;
	}


	public void setNumberOfUnpaidInstallment(Integer numberOfUnpaidInstallment) {

		this.numberOfUnpaidInstallment = numberOfUnpaidInstallment;
	}

	public Integer getStatus() {

		return status;
	}

	public void setStatus(Integer status) {

		this.status = status;
	}


	public Long getIdAcmCollectionStep() {

		return idAcmCollectionStep;
	}

	public void setIdAcmCollectionStep(Long idAcmCollectionStep) {

		this.idAcmCollectionStep = idAcmCollectionStep;
	}


	public Long getProductId() {

		return productId;
	}

	public void setProductId(Long productId) {

		this.productId = productId;
	}

	public Long getBranchId() {

		return branchId;
	}


	public void setBranchId(Long branchId) {

		this.branchId = branchId;
	}

	public String getCurrencySymbol() {

		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {

		this.currencySymbol = currencySymbol;
	}

	public Integer getCurrencyDecimalPlaces() {

		return currencyDecimalPlaces;
	}


	public void setCurrencyDecimalPlaces(Integer currencyDecimalPlaces) {

		this.currencyDecimalPlaces = currencyDecimalPlaces;
	}


	public Long getCustomerIdExtern() {

		return customerIdExtern;
	}


	public void setCustomerIdExtern(Long cutomerIdExtern) {

		this.customerIdExtern = cutomerIdExtern;
	}

	public Integer getIdLoanExtern() {

		return idLoanExtern;
	}

	public void setIdLoanExtern(Integer idLoanExtern) {

		this.idLoanExtern = idLoanExtern;
	}

	/**
	 * Gets the available date.
	 *
	 * @return the available date
	 */
	public Date getAvailableDate() {

		return availableDate;
	}

	/**
	 * Sets the available date.
	 *
	 * @param availableDate the new available date
	 */
	public void setAvailableDate(Date availableDate) {

		this.availableDate = availableDate;
	}

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public String getOwner() {

		return owner;
	}

	/**
	 * Sets the owner.
	 *
	 * @param owner the new owner
	 */
	public void setOwner(String owner) {

		this.owner = owner;
	}

	/**
	 * Gets the owner name.
	 *
	 * @return the owner name
	 */
	public String getOwnerName() {

		return ownerName;
	}

	/**
	 * Sets the owner name.
	 *
	 * @param ownerName the new owner name
	 */
	public void setOwnerName(String ownerName) {

		this.ownerName = ownerName;
	}

	/**
	 * Gets the group owner.
	 *
	 * @return the group owner
	 */
	public String getGroupOwner() {

		return groupOwner;
	}

	/**
	 * Sets the group owner.
	 *
	 * @param groupOwner the new group owner
	 */
	public void setGroupOwner(String groupOwner) {

		this.groupOwner = groupOwner;
	}

	/**
	 * Gets the group owner name.
	 *
	 * @return the group owner name
	 */
	public String getGroupOwnerName() {

		return groupOwnerName;
	}

	/**
	 * Sets the group owner name.
	 *
	 * @param groupOwnerName the new group owner name
	 */
	public void setGroupOwnerName(String groupOwnerName) {

		this.groupOwnerName = groupOwnerName;
	}

	/**
	 * Gets the collection type.
	 *
	 * @return the collection type
	 */
	public String getCollectionType() {

		return collectionType;
	}

	/**
	 * Sets the collection type.
	 *
	 * @param collectionType the new collection type
	 */
	public void setCollectionType(String collectionType) {

		this.collectionType = collectionType;
	}

	/**
	 * Gets the id parent collection.
	 *
	 * @return the idParentCollection
	 */
	public Long getIdParentCollection() {

		return idParentCollection;
	}

	/**
	 * Sets the id parent collection.
	 *
	 * @param idParentCollection the idParentCollection to set
	 */
	public void setIdParentCollection(Long idParentCollection) {

		this.idParentCollection = idParentCollection;
	}

	/**
	 * Gets the statut libelle.
	 *
	 * @return the statut libelle
	 */
	public String getStatutLibelle() {

		return statutLibelle;
	}

	/**
	 * Sets the statut libelle.
	 *
	 * @param statutLibelle the new statut libelle
	 */
	public void setStatutLibelle(String statutLibelle) {

		this.statutLibelle = statutLibelle;
	}

	/**
	 * Gets the statut libelle done.
	 *
	 * @return the statut libelle done
	 */
	public String getStatutLibelleDone() {

		return statutLibelleDone;
	}

	/**
	 * Sets the statut libelle done.
	 *
	 * @param statutLibelleDone the new statut libelle done
	 */
	public void setStatutLibelleDone(String statutLibelleDone) {

		this.statutLibelleDone = statutLibelleDone;
	}

}
