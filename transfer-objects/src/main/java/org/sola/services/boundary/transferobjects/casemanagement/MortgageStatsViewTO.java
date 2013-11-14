/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

import org.sola.services.common.contracts.AbstractBasicIdTO;

/**
 *
 * @author Charlizza
 */
public class MortgageStatsViewTO extends AbstractBasicIdTO{
    
    private Integer mortgages;
    private Integer amount;
    private double averageAmount;

    public MortgageStatsViewTO() {
        super();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getAverageAmount() {
        return averageAmount;
    }

    public void setAverageAmount(double averageAmount) {
        this.averageAmount = averageAmount;
    }

    public Integer getMortgages() {
        return mortgages;
    }

    public void setMortgages(Integer mortgages) {
        this.mortgages = mortgages;
    }
    
    
}
