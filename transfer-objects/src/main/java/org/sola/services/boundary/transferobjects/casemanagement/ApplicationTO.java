/**
 * ******************************************************************************************
 * Copyright (c) 2013 Food and Agriculture Organization of the United Nations
 * (FAO) and the Lesotho Land Administration Authority (LAA). All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,this
 * list of conditions and the following disclaimer. 2. Redistributions in binary
 * form must reproduce the above copyright notice,this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. 3. Neither the names of FAO, the LAA nor the names of
 * its contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT,STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.sola.services.boundary.transferobjects.cadastre.CadastreObjectSummaryTO;
import org.sola.services.boundary.transferobjects.cadastre.CadastreObjectTO;
import org.sola.services.boundary.transferobjects.search.BaUnitSearchResultTO;

public class ApplicationTO extends ApplicationSummaryTO {

    private String assigneeId;
    private byte[] location;
    private String statusCode;
    private BigDecimal servicesFee;
    private BigDecimal tax;
    private BigDecimal totalFee;
    private BigDecimal totalAmountPaid;
    private String receiptRef;
    private Date receiptDate;
    private Date collectionDate;
    private String actionCode;
    private String actionNotes;
    private String stageCode;
    private PartyTO contactPerson;
    private PartyTO agent;
    private List<ServiceTO> serviceList;
    private List<BaUnitSearchResultTO> propertyList;
    private List<SourceTO> sourceList;
    private List<CadastreObjectSummaryTO> cadastreObjectList;

    public ApplicationTO() {
        super();
    }

    public PartyTO getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(PartyTO contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeLoginName) {
        this.assigneeId = assigneeLoginName;
    }

    public String getReceiptRef() {
        return receiptRef;
    }

    public void setReceiptRef(String receiptRef) {
        this.receiptRef = receiptRef;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) { //NOSONAR
        this.location = location; //NOSONAR
    }

    public BigDecimal getServicesFee() {
        return servicesFee;
    }

    public void setServicesFee(BigDecimal servicesFee) {
        this.servicesFee = servicesFee;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(BigDecimal totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public List<ServiceTO> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServiceTO> serviceList) {
        this.serviceList = serviceList;
    }

    public void addService(ServiceTO service) {
        if (serviceList == null) {
            serviceList = new ArrayList<ServiceTO>();
        }
        serviceList.add(service);
    }

    public void addApplicationProperty(BaUnitSearchResultTO appProperty) {
        if (propertyList == null) {
            propertyList = new ArrayList<BaUnitSearchResultTO>();
        }
        propertyList.add(appProperty);
    }

    public void addSource(SourceTO source) {
        if (sourceList == null) {
            sourceList = new ArrayList<SourceTO>();
        }
        sourceList.add(source);
    }

    public PartyTO getAgent() {
        return agent;
    }

    public void setAgent(PartyTO agent) {
        this.agent = agent;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    public String getActionNotes() {
        return actionNotes;
    }

    public void setActionNotes(String actionNotes) {
        this.actionNotes = actionNotes;
    }

    public String getStageCode() {
        return stageCode;
    }

    public void setStageCode(String stageCode) {
        this.stageCode = stageCode;
    }

    public List<BaUnitSearchResultTO> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<BaUnitSearchResultTO> propertyList) {
        this.propertyList = propertyList;
    }

    public List<SourceTO> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<SourceTO> sourceList) {
        this.sourceList = sourceList;
    }

    public List<CadastreObjectSummaryTO> getCadastreObjectList() {
        return cadastreObjectList;
    }

    public void setCadastreObjectList(List<CadastreObjectSummaryTO> cadastreObjectList) {
        this.cadastreObjectList = cadastreObjectList;
    }
}
