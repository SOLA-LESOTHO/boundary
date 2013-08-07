package org.sola.services.boundary.transferobjects.search;

import java.math.BigDecimal;
import java.util.Date;
import org.sola.services.common.contracts.AbstractTO;

public class RightsExportResultTO extends AbstractTO {
    private String baUnitId;
    private String rightStatus;
    private Date rightStatusDate;
    private BigDecimal parcelArea;
    private String rightId;
    private String rightType;
    private Date rightRegistrationDate;
    private Date startDate;
    private Date executionDate;
    private String rightRegistrationNumber;
    private Date rightExpirationDate;
    private BigDecimal groundRent;
    private BigDecimal serviceFee;
    private BigDecimal stampDuty;
    private BigDecimal transferDuty;
    private BigDecimal registrationFee;
    private BigDecimal personalLevy;
    private BigDecimal landUsable;
    private String landUseCode;
    private String leaseNumber;
    private String rightTrackingNumber;
    private String rightHolders;
    private String payeeId;
    private String payeeName;
    private String payeeLastName;
    private String payeeGender;
    private String payeeAddress;
    private String payeePhone;
    private String payeeMobile;
    private String payeeEmail;
    private String payeeIdNumber;
    private String payeeIdTypeCode;
    private Date payeeBirthDate;
    private String parcelNumber;
    
    public RightsExportResultTO(){
        super();
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public BigDecimal getGroundRent() {
        return groundRent;
    }

    public void setGroundRent(BigDecimal groundRent) {
        this.groundRent = groundRent;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getLandUsable() {
        return landUsable;
    }

    public void setLandUsable(BigDecimal landUsable) {
        this.landUsable = landUsable;
    }

    public String getLandUseCode() {
        return landUseCode;
    }

    public void setLandUseCode(String landUseCode) {
        this.landUseCode = landUseCode;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public BigDecimal getPersonalLevy() {
        return personalLevy;
    }

    public void setPersonalLevy(BigDecimal personalLevy) {
        this.personalLevy = personalLevy;
    }

    public BigDecimal getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(BigDecimal registrationFee) {
        this.registrationFee = registrationFee;
    }

    public BigDecimal getStampDuty() {
        return stampDuty;
    }

    public void setStampDuty(BigDecimal stampDuty) {
        this.stampDuty = stampDuty;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getTransferDuty() {
        return transferDuty;
    }

    public void setTransferDuty(BigDecimal transferDuty) {
        this.transferDuty = transferDuty;
    }

    public String getBaUnitId() {
        return baUnitId;
    }

    public void setBaUnitId(String baUnitId) {
        this.baUnitId = baUnitId;
    }

    public BigDecimal getParcelArea() {
        return parcelArea;
    }

    public void setParcelArea(BigDecimal parcelArea) {
        this.parcelArea = parcelArea;
    }

    public String getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelNumber(String parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public String getPayeeAddress() {
        return payeeAddress;
    }

    public void setPayeeAddress(String payeeAddress) {
        this.payeeAddress = payeeAddress;
    }

    public Date getPayeeBirthDate() {
        return payeeBirthDate;
    }

    public void setPayeeBirthDate(Date payeeBirthDate) {
        this.payeeBirthDate = payeeBirthDate;
    }

    public String getPayeeEmail() {
        return payeeEmail;
    }

    public void setPayeeEmail(String payeeEmail) {
        this.payeeEmail = payeeEmail;
    }

    public String getPayeeGender() {
        return payeeGender;
    }

    public void setPayeeGender(String payeeGender) {
        this.payeeGender = payeeGender;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeIdNumber() {
        return payeeIdNumber;
    }

    public void setPayeeIdNumber(String payeeIdNumber) {
        this.payeeIdNumber = payeeIdNumber;
    }

    public String getPayeeIdTypeCode() {
        return payeeIdTypeCode;
    }

    public void setPayeeIdTypeCode(String payeeIdTypeCode) {
        this.payeeIdTypeCode = payeeIdTypeCode;
    }

    public String getPayeeLastName() {
        return payeeLastName;
    }

    public void setPayeeLastName(String payeeLastName) {
        this.payeeLastName = payeeLastName;
    }

    public String getPayeeMobile() {
        return payeeMobile;
    }

    public void setPayeeMobile(String payeeMobile) {
        this.payeeMobile = payeeMobile;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeePhone() {
        return payeePhone;
    }

    public void setPayeePhone(String payeePhone) {
        this.payeePhone = payeePhone;
    }

    public Date getRightExpirationDate() {
        return rightExpirationDate;
    }

    public void setRightExpirationDate(Date rightExpirationDate) {
        this.rightExpirationDate = rightExpirationDate;
    }

    public String getRightHolders() {
        return rightHolders;
    }

    public void setRightHolders(String rightHolders) {
        this.rightHolders = rightHolders;
    }

    public String getRightId() {
        return rightId;
    }

    public void setRightId(String rightId) {
        this.rightId = rightId;
    }

    public Date getRightRegistrationDate() {
        return rightRegistrationDate;
    }

    public void setRightRegistrationDate(Date rightRegistrationDate) {
        this.rightRegistrationDate = rightRegistrationDate;
    }

    public String getRightRegistrationNumber() {
        return rightRegistrationNumber;
    }

    public void setRightRegistrationNumber(String rightRegistrationNumber) {
        this.rightRegistrationNumber = rightRegistrationNumber;
    }

    public String getRightStatus() {
        return rightStatus;
    }

    public void setRightStatus(String rightStatus) {
        this.rightStatus = rightStatus;
    }

    public Date getRightStatusDate() {
        return rightStatusDate;
    }

    public void setRightStatusDate(Date rightStatusDate) {
        this.rightStatusDate = rightStatusDate;
    }

    public String getRightTrackingNumber() {
        return rightTrackingNumber;
    }

    public void setRightTrackingNumber(String rightTrackingNumber) {
        this.rightTrackingNumber = rightTrackingNumber;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }
}
