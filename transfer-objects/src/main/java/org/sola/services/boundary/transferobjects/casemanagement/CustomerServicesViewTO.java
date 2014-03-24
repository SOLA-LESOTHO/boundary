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
public class CustomerServicesViewTO extends AbstractBasicIdTO{
    
    private String application;
    
    private Integer lodged;
    
    private double queried;
    
    private Integer awaitingcollection;
    
    private Integer collected;

    public CustomerServicesViewTO() {
        super();        
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Integer getAwaitingcollection() {
        return awaitingcollection;
    }

    public void setAwaitingcollection(Integer awaitingcollection) {
        this.awaitingcollection = awaitingcollection;
    }

    public Integer getCollected() {
        return collected;
    }

    public void setCollected(Integer collected) {
        this.collected = collected;
    }

    public Integer getLodged() {
        return lodged;
    }

    public void setLodged(Integer lodged) {
        this.lodged = lodged;
    }

    public double getQueried() {
        return queried;
    }

    public void setQueried(double queried) {
        this.queried = queried;
    }
       
}
