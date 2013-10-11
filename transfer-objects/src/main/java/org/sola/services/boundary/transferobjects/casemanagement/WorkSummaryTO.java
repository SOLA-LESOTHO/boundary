package org.sola.services.boundary.transferobjects.casemanagement;

import org.sola.services.common.contracts.AbstractTO;

/**
 * TO for the WorkSummary entity.
 */
public class WorkSummaryTO extends AbstractTO {

    private String serviceType;
    private String serviceCategory;
    private int inProgressFrom;
    private int onRequisitionFrom;
    private int lodged;
    private int requisitioned;
    private int registered;
    private int cancelled;
    private int withdrawn;
    private int inProgressTo;
    private int onRequisitionTo;
    private int overdue;
    private String overdueApplications;
    private String onRequisitionApplications;

    public WorkSummaryTO() {
        super();
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }

    public int getLodged() {
        return lodged;
    }

    public void setLodged(int lodged) {
        this.lodged = lodged;
    }

    public int getOverdue() {
        return overdue;
    }

    public void setOverdue(int overdue) {
        this.overdue = overdue;
    }

    public String getOverdueApplications() {
        return overdueApplications;
    }

    public void setOverdueApplications(String overdueApplications) {
        this.overdueApplications = overdueApplications;
    }

    public int getRegistered() {
        return registered;
    }

    public void setRegistered(int registered) {
        this.registered = registered;
    }

    public int getRequisitioned() {
        return requisitioned;
    }

    public void setRequisitioned(int requisitioned) {
        this.requisitioned = requisitioned;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(int withdrawn) {
        this.withdrawn = withdrawn;
    }

    public String getOnRequisitionApplications() {
        return onRequisitionApplications;
    }

    public void setOnRequisitionApplications(String onRequisitionApplications) {
        this.onRequisitionApplications = onRequisitionApplications;
    }

    public int getInProgressFrom() {
        return inProgressFrom;
    }

    public void setInProgressFrom(int inProgressFrom) {
        this.inProgressFrom = inProgressFrom;
    }

    public int getInProgressTo() {
        return inProgressTo;
    }

    public void setInProgressTo(int inProgressTo) {
        this.inProgressTo = inProgressTo;
    }

    public int getOnRequisitionFrom() {
        return onRequisitionFrom;
    }

    public void setOnRequisitionFrom(int onRequisitionFrom) {
        this.onRequisitionFrom = onRequisitionFrom;
    }

    public int getOnRequisitionTo() {
        return onRequisitionTo;
    }

    public void setOnRequisitionTo(int onRequisitionTo) {
        this.onRequisitionTo = onRequisitionTo;
    }
}
