/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * @author ntsane
 */
public class StatisticsSummaryTO extends AbstractTO {
    
    public StatisticsSummaryTO(){
        super();
    }
    
    private String requestType;
    private String requestCategory;
    private int groupIndex;
    private int lodgedApplications;
    private int cancelledApplications;
    private int completedApplications;
    
    
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestCategory() {
        return requestCategory;
    }

    public void setRequestCategory(String requestCategory) {
        this.requestCategory = requestCategory;
    }

    public int getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(int groupIndex) {
        this.groupIndex = groupIndex;
    }

    public int getLodgedApplications() {
        return lodgedApplications;
    }

    public void setLodgedApplications(int lodgedApplications) {
        this.lodgedApplications = lodgedApplications;
    }

    public int getCancelledApplications() {
        return cancelledApplications;
    }

    public void setCancelledApplications(int cancelledApplications) {
        this.cancelledApplications = cancelledApplications;
    }

    public int getCompletedApplications() {
        return completedApplications;
    }

    public void setCompletedApplications(int completedApplications) {
        this.completedApplications = completedApplications;
    }

}
