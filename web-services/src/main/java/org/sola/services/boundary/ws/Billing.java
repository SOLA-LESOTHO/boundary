/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.ws;

import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceContext;
import org.sola.services.boundary.transferobjects.billing.CustomerBillTO;
import org.sola.services.boundary.transferobjects.billing.PayRateTO;
import org.sola.services.boundary.transferobjects.billing.RegisteredLeaseTO;
import org.sola.services.common.ServiceConstants;
import org.sola.services.common.contracts.GenericTranslator;
import org.sola.services.common.faults.SOLAAccessFault;
import org.sola.services.common.faults.SOLAFault;
import org.sola.services.common.faults.UnhandledFault;
import org.sola.services.ejbs.billing.businesslogic.BillingEJBLocal;
import org.sola.services.common.webservices.AbstractWebService;
import org.sola.services.ejbs.billing.repository.entities.CustomerBill;

/**
 *
 * @author nmafereka
 */
/**
 * Web service, exposing BillingEJB methods
 */
@WebService(serviceName = "billing-service", targetNamespace = ServiceConstants.BILLING_WS_NAMESPACE)
public class Billing extends AbstractWebService {

    @Resource
    private WebServiceContext wsContext;
    @EJB
    BillingEJBLocal billingEJB;

    /**
     * Dummy method to check the web service instance is working
     *
     * @return boolean
     */
    @WebMethod(operationName = "checkConnection")
    public boolean checkConnection() {
        return true;
    }

    /**
     * Returns Lease object by Id.
     *
     * @param leaseNumber
     * @return
     * @throws org.sola.services.common.faults.SOLAAccessFault
     * @throws org.sola.services.common.faults.SOLAFault
     * @throws org.sola.services.common.faults.UnhandledFault
     */
    @WebMethod(operationName = "getLease")
    public RegisteredLeaseTO getLease(@WebParam(name = "leaseNumber") final String leaseNumber)
            throws SOLAAccessFault, SOLAFault, UnhandledFault {
        final Object[] result = {null};

        runOpenQuery(wsContext, new Runnable() {

            @Override
            public void run() {

                result[0] = GenericTranslator.toTO(
                        billingEJB.getLeaseById(leaseNumber), RegisteredLeaseTO.class);

            }
        });

        return (RegisteredLeaseTO) result[0];
    }

    @WebMethod(operationName = "saveCustomerBill")
    public CustomerBillTO saveCustomerBill(@WebParam(name = "customerBill") final CustomerBillTO customerBill)
            throws SOLAFault, UnhandledFault {

        final Object[] result = {null};

        runOpenQuery(wsContext, new Runnable() {

            @Override
            public void run() {
                CustomerBill bill = GenericTranslator.fromTO(customerBill, CustomerBill.class, null);
                result[0] = GenericTranslator.toTO(billingEJB.saveCustomerBill(bill), CustomerBillTO.class);
            }

        });

        return (CustomerBillTO) result[0];

    }

    @WebMethod(operationName = "getPayRate")
    public List<PayRateTO> getPayRate(@WebParam(name = "billingPeriod") final int billingPeriod,
            @WebParam(name = "registrationYear") final int registrationYear,
            @WebParam(name = "landUseCode") final String landUseCode,
            @WebParam(name = "groundRentZone") final String groundRentZone)
            throws SOLAFault, UnhandledFault {
        final Object[] result = {null};
        runOpenQuery(wsContext, new Runnable() {

            @Override
            public void run() {
                result[0] = GenericTranslator.toTOList(
                        billingEJB.getPayRate(billingPeriod, registrationYear,
                                landUseCode, groundRentZone), PayRateTO.class);
            }

        });
        return (List<PayRateTO>) result[0];

    }

    /**
     * Web service operation
     *
     * @param paymentPeriod
     * @param lastPaymentYear
     * @return
     * @throws org.sola.services.common.faults.SOLAFault
     * @throws org.sola.services.common.faults.UnhandledFault
     */
    @WebMethod(operationName = "isPeriodBilliable")
    public boolean isPeriodBilliable(@WebParam(name = "paymentPeriod") final int paymentPeriod, @WebParam(name = "lastPaymentYear") final int lastPaymentYear) throws SOLAFault, UnhandledFault {
        final boolean[] result = {false};

        runOpenQuery(wsContext, new Runnable() {

            @Override
            public void run() {
                result[0] = billingEJB.isPeriodBilliable(paymentPeriod, lastPaymentYear);
            }

        });

        return result[0];

    }

    /**
     * Web service operation
     *
     * @param leasedArea
     * @param groundRentRate
     * @param calculationMethod
     * @param complianceCode
     * @return
     * @throws org.sola.services.common.faults.SOLAFault
     * @throws org.sola.services.common.faults.UnhandledFault
     */
    @WebMethod(operationName = "calculateGroundRent")
    public BigDecimal calculateGroundRent(@WebParam(name = "leasedArea") final BigDecimal leasedArea, @WebParam(name = "groundRentRate") final BigDecimal groundRentRate, @WebParam(name = "calculationMethod") final String calculationMethod, @WebParam(name = "complianceCode") final int complianceCode) throws SOLAFault, UnhandledFault {
        final BigDecimal[] result = {null};

        runOpenQuery(wsContext, new Runnable() {
            @Override
            public void run() {
                result[0]
                        = billingEJB.calculateGroundRent(leasedArea, groundRentRate,
                                calculationMethod, complianceCode);
            }
        });

        return result[0];

    }

}
