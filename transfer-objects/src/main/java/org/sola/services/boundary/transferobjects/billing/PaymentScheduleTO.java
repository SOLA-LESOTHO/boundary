/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.billing;

import java.math.BigDecimal;
import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * @author nmafereka
 */
public class PaymentScheduleTO extends AbstractTO{

    private String billingPeriod;

    private String billNumber;

    private String leaseNumber;

    private String landUseCode;

    private String groundRentZone;

    private BigDecimal leasedArea;

    private String payPeriodCode;

    private String calculationMethod;

    private int imposePenalty;

    private int complianceCode;

    private String statusCode;

    public String getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public String getLandUseCode() {
        return landUseCode;
    }

    public void setLandUseCode(String landUseCode) {
        this.landUseCode = landUseCode;
    }

    public String getGroundRentZone() {
        return groundRentZone;
    }

    public void setGroundRentZone(String groundRentZone) {
        this.groundRentZone = groundRentZone;
    }

    public BigDecimal getLeasedArea() {
        return leasedArea;
    }

    public void setLeasedArea(BigDecimal leasedArea) {
        this.leasedArea = leasedArea;
    }

    public String getPayPeriodCode() {
        return payPeriodCode;
    }

    public void setPayPeriodCode(String payPeriodCode) {
        this.payPeriodCode = payPeriodCode;
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public int getImposePenalty() {
        return imposePenalty;
    }

    public void setImposePenalty(int imposePenalty) {
        this.imposePenalty = imposePenalty;
    }

    public int getComplianceCode() {
        return complianceCode;
    }

    public void setComplianceCode(int complianceCode) {
        this.complianceCode = complianceCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    

}
