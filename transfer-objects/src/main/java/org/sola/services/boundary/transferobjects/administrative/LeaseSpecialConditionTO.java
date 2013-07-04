package org.sola.services.boundary.transferobjects.administrative;

import org.sola.services.common.contracts.AbstractIdTO;

public class LeaseSpecialConditionTO extends AbstractIdTO {
    private String rrrId;
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

    public String getRrrId() {
        return rrrId;
    }

    public void setRrrId(String rrrId) {
        this.rrrId = rrrId;
    }
}
