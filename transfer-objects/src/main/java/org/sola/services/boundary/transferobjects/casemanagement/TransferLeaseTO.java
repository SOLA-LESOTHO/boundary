/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

/**
 *
 * @author Charlizza
 */

import org.sola.services.common.contracts.AbstractBasicIdTO;

public class TransferLeaseTO extends AbstractBasicIdTO{
    
    private String serviceName;
    
    private Integer serviceCount;
    
    private Integer maleCount;
    
    private Integer femaleCount;
    
    private Integer entityCount;
    
    private double totalAmount;
    
    private double stampDuty;
    
    private double transferDuty;
    
    private double registrationFee;

    public TransferLeaseTO() {
        
        super();
    }

    public Integer getEntityCount() {
        return entityCount;
    }

    public void setEntityCount(Integer entityCount) {
        this.entityCount = entityCount;
    }

    public Integer getFemaleCount() {
        return femaleCount;
    }

    public void setFemaleCount(Integer femaleCount) {
        this.femaleCount = femaleCount;
    }

    public Integer getMaleCount() {
        return maleCount;
    }

    public void setMaleCount(Integer maleCount) {
        this.maleCount = maleCount;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public Integer getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getStampDuty() {
        return stampDuty;
    }

    public void setStampDuty(double stampDuty) {
        this.stampDuty = stampDuty;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTransferDuty() {
        return transferDuty;
    }

    public void setTransferDuty(double transferDuty) {
        this.transferDuty = transferDuty;
    }
    
}
