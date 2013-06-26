package org.sola.services.boundary.transferobjects.administrative;

import org.sola.services.common.contracts.AbstractIdTO;

public class LeaseSpecialConditionTO extends AbstractIdTO {
    private String leaseId;
    private String conditionText;
    
    public LeaseSpecialConditionTO(){
        super();
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    public String getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }
}
