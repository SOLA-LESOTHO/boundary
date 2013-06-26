package org.sola.services.boundary.transferobjects.administrative;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.sola.services.boundary.transferobjects.cadastre.CadastreObjectTO;
import org.sola.services.boundary.transferobjects.casemanagement.PartySummaryTO;
import org.sola.services.common.contracts.AbstractVersionedTO;

public class LeaseTO extends AbstractVersionedTO {
    
    private String id;
    private String leaseNumber;
    private String maritalStatus;
    private String lesseeAddress;
    private CadastreObjectTO cadastreObject;
    private String cadastreObjectId;
    private BigDecimal groundRent;
    private Date startDate;
    private Date expirationDate;
    private List<PartySummaryTO> lessees;
    private List<LeaseSpecialConditionTO> leaseSpecialConditionList;
    private Date executionDate;
    private BigDecimal stampDuty;
    private String statusCode;
    
    public LeaseTO(){
        super();
    }

    public CadastreObjectTO getCadastreObject() {
        return cadastreObject;
    }

    public void setCadastreObject(CadastreObjectTO cadastreObject) {
        this.cadastreObject = cadastreObject;
    }

    public String getCadastreObjectId() {
        return cadastreObjectId;
    }

    public void setCadastreObjectId(String cadastreObjectId) {
        this.cadastreObjectId = cadastreObjectId;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getGroundRent() {
        return groundRent;
    }

    public void setGroundRent(BigDecimal groundRent) {
        this.groundRent = groundRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public List<LeaseSpecialConditionTO> getLeaseSpecialConditionList() {
        return leaseSpecialConditionList;
    }

    public void setLeaseSpecialConditionList(List<LeaseSpecialConditionTO> leaseSpecialConditionList) {
        this.leaseSpecialConditionList = leaseSpecialConditionList;
    }
    public String getLesseeAddress() {
        return lesseeAddress;
    }

    public void setLesseeAddress(String lesseeAddress) {
        this.lesseeAddress = lesseeAddress;
    }

    public List<PartySummaryTO> getLessees() {
        return lessees;
    }

    public void setLessees(List<PartySummaryTO> lessees) {
        this.lessees = lessees;
    }


    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
