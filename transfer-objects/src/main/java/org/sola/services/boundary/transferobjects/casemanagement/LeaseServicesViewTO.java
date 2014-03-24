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
public class LeaseServicesViewTO extends AbstractBasicIdTO{
    
    private String application;
   
    private Integer tobeprocessed;
    
    private Integer inprogress;
   
    private Integer queried;
   
    private Integer cancelled;
    
    private Integer processed;
   
    private Integer approved;
    
    private Integer overdue;

    public LeaseServicesViewTO() {
        
        super();
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }

    public Integer getInprogress() {
        return inprogress;
    }

    public void setInprogress(Integer in_progress) {
        this.inprogress = in_progress;
    }


    public Integer getOverdue() {
        return overdue;
    }

    public void setOverdue(Integer overdue) {
        this.overdue = overdue;
    }

    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
    }

    public Integer getQueried() {
        return queried;
    }

    public void setQueried(Integer queried) {
        this.queried = queried;
    }

    public Integer getTobeprocessed() {
        return tobeprocessed;
    }

    public void setTobeprocessed(Integer to_be_processed) {
        this.tobeprocessed = to_be_processed;
    }   
    
    
}
