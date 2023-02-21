package saudrav.springframework.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="propertytaxpyt")
public class PropertyTaxPyt {

	@Id
	@Column(name="propertyid")
	String propertyId;
	@Column(name="ownersname")
	String ownersName;
	@Column(name="areainsqft")
	double areaInSqFt;
	@Column(name="propertytype")
	String propertyType;
	@Column(name="taxamount")
	double taxAmount;
	@Column(name="dateofpyt")
	Date dateOfPyt;
	@Column(name="duedate")
	Date dueDate;
	@Column(name="revisedtaxamtin_rs")
	double revisedTaxAmt;

	public PropertyTaxPyt() {
		super();
	}

	public PropertyTaxPyt(String propertyId, String ownersName, double areaInSqFt, String propertyType,
			double taxAmount, Date dateOfPyt, Date dueDate, double revisedTaxAmt) {
		super();
		this.propertyId = propertyId;
		this.ownersName = ownersName;
		this.areaInSqFt = areaInSqFt;
		this.propertyType = propertyType;
		this.taxAmount = taxAmount;
		this.dateOfPyt = dateOfPyt;
		this.dueDate = dueDate;
		this.revisedTaxAmt = revisedTaxAmt;
	}

	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public double getAreaInSqFt() {
		return areaInSqFt;
	}

	public void setAreaInSqFt(double areaInSqFt) {
		this.areaInSqFt = areaInSqFt;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Date getDateOfPyt() {
		return dateOfPyt;
	}

	public void setDateOfPyt(Date dateOfPyt) {
		this.dateOfPyt = dateOfPyt;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getRevisedTaxAmt() {
		return revisedTaxAmt;
	}

	public void setRevisedTaxAmt(double revisedTaxAmt) {
		this.revisedTaxAmt = revisedTaxAmt;
	}

	@Override
	public String toString() {
		return "PropertyTaxPyt [propertyId=" + propertyId + ", ownersName=" + ownersName + ", areaInSqFt=" + areaInSqFt
				+ ", propertyType=" + propertyType + ", taxAmount=" + taxAmount + ", dateOfPyt=" + dateOfPyt
				+ ", dueDate=" + dueDate + ", revisedTaxAmt=" + revisedTaxAmt + "]";
	}

}
