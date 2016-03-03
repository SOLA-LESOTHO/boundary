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
public class PayRateTO extends AbstractTO{

    private String landUseCode;

    private String landGradeCode;

    private int payPeriodCode;

    private BigDecimal rateAmount;

    private String calculationTypeCode;

    public String getLandUseCode() {
        return landUseCode;
    }

    public void setLandUseCode(String landUseCode) {
        this.landUseCode = landUseCode;
    }

    public String getLandGradeCode() {
        return landGradeCode;
    }

    public void setLandGradeCode(String landGradeCode) {
        this.landGradeCode = landGradeCode;
    }

    public int getPayPeriodCode() {
        return payPeriodCode;
    }

    public void setPayPeriodCode(int payPeriodCode) {
        this.payPeriodCode = payPeriodCode;
    }

    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    public void setRateAmount(BigDecimal rateAmount) {
        this.rateAmount = rateAmount;
    }

    public String getCalculationTypeCode() {
        return calculationTypeCode;
    }

    public void setCalculationTypeCode(String calculationTypeCode) {
        this.calculationTypeCode = calculationTypeCode;
    }
    
    

}
