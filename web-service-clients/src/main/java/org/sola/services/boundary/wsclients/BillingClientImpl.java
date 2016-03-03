/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.wsclients;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.namespace.QName;
import org.sola.services.boundary.wsclients.exception.WebServiceClientException;
import org.sola.webservices.billing.Billing;
import org.sola.webservices.billing.BillingService;
import org.sola.webservices.transferobjects.billing.CustomerBillTO;
import org.sola.webservices.transferobjects.billing.PayRateTO;
import org.sola.webservices.transferobjects.billing.RegisteredLeaseTO;

/**
 *
 * @author nmafereka
 */
public class BillingClientImpl extends AbstractWSClientImpl implements BillingClient {

    private static final String NAMESPACE_URI = "http://webservices.sola.org/billing";
    private static final String LOCAL_PART = "billing-service";

    public BillingClientImpl(String url) {
        super(url, new QName(NAMESPACE_URI, LOCAL_PART));
    }

    protected Billing getPort() {
        return getPort(Billing.class, BillingService.class);
    }

    @Override
    public boolean checkConnection() {
        final String methodName = BillingClient.CHECK_CONNECTION;
        boolean result = false;

        try {
            beforeWebMethod(methodName);
            result = getPort().checkConnection();
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result);
        }
        return result;
    }

    @Override
    public RegisteredLeaseTO getLease(String leaseNumber) throws WebServiceClientException {
        RegisteredLeaseTO result = null;
        final String methodName = BillingClient.GET_LEASE;
        try {
            beforeWebMethod(methodName);
            result = getPort().getLease(leaseNumber);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result);
        }
        return result;

    }

    @Override
    public CustomerBillTO saveCustomerBill(CustomerBillTO customerBill)
            throws WebServiceClientException {
        CustomerBillTO result = null;
        final String methodName = BillingClient.SAVE_CUSTOMER_BILL;
        try {
            beforeWebMethod(methodName, customerBill);
            result = getPort().saveCustomerBill(customerBill);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, customerBill);
        }
        return result;

    }

    @Override
    public List<PayRateTO> getPayRate(int billingPeriod, int registrationYear,
            String landUseCode, String groundRentZone)
            throws WebServiceClientException {
        List< PayRateTO> result = null;
        final String methodName = BillingClient.GET_PAY_RATE;
        try {
            beforeWebMethod(methodName);
            result = getPort().getPayRate(billingPeriod, registrationYear,
                    landUseCode, groundRentZone);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result);
        }
        return result;

    }

    @Override
    public BigDecimal calculateGroundRent(BigDecimal leasedArea,
            BigDecimal groundRentRate,
            String calculationMethod,
            int complianceCode) throws WebServiceClientException{
        final String methodName = BillingClient.CALCULATE_GROUND_RENT;
        BigDecimal result = null;
        try {
            beforeWebMethod(methodName);
            result = getPort().calculateGroundRent(leasedArea, groundRentRate, calculationMethod, complianceCode);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result);
        }
        return result;
    }

    @Override
    public boolean isPeriodBilliable(int paymentPeriod, int lastPaymentYear) {
         final String methodName = BillingClient.IS_PERIOD_BILLABLE;
        boolean result = false;
        try {
            beforeWebMethod(methodName);
           result = getPort().isPeriodBilliable(paymentPeriod, lastPaymentYear);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result);
        }
        return result;
    }

}
