package org.sola.services.boundary.transferobjects.administrative;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.sola.services.boundary.transferobjects.casemanagement.PartyTO;
import org.sola.services.common.contracts.AbstractIdTO;

public class ConsentTO extends AbstractIdTO {
    private Date registrationDate;
    private String transactionId;
    private Date expirationDate;
    private BigDecimal amount;
    private String transactionTypeCode;
    private String specialConditions;
    private List<PartyTO> transfereeList;
    
    public ConsentTO(){
        super();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSpecialConditions() {
        return specialConditions;
    }

    public void setSpecialConditions(String specialConditions) {
        this.specialConditions = specialConditions;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public List<PartyTO> getTransfereeList() {
        return transfereeList;
    }

    public void setTransfereeList(List<PartyTO> transfereeList) {
        this.transfereeList = transfereeList;
    }
}
