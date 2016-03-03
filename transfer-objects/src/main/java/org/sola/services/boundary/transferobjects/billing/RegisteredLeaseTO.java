/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sola.services.boundary.transferobjects.billing;

import java.math.BigDecimal;
import java.util.Date;
import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * @author nmafereka
 */
public class RegisteredLeaseTO extends AbstractTO{
    
    private String leaseNumber;
    
    private String landUseCode;
    
    private String groundRentZone;
    
    private BigDecimal leasedArea;
    
    private Date registrationDate;
    
    private Date lastPaymentDate;
   
    private int complianceCode;

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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public int getComplianceCode() {
        return complianceCode;
    }

    public void setComplianceCode(int complianceCode) {
        this.complianceCode = complianceCode;
    }
    
    
}
