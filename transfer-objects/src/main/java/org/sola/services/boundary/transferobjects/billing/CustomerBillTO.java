/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sola.services.boundary.transferobjects.billing;

import java.util.Date;
import java.util.List;
import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * @author nmafereka
 */
public class CustomerBillTO extends AbstractTO{
    
    private String billNumber;
    
    private String billStatus;
    
    private Date billDate;
    
    private String billPeriod;
    
    private String leaseNumber;
    
    private List<PaymentScheduleTO> billItemList;

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public List<PaymentScheduleTO> getBillItemList() {
        return billItemList;
    }

    public void setBillItemList(List<PaymentScheduleTO> billItemList) {
        this.billItemList = billItemList;
    }
    
    
    
}
