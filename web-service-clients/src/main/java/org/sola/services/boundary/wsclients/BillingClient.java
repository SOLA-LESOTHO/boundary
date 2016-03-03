/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.wsclients;

import java.math.BigDecimal;
import java.util.List;
import org.sola.webservices.transferobjects.billing.CustomerBillTO;
import org.sola.webservices.transferobjects.billing.PayRateTO;
import org.sola.webservices.transferobjects.billing.RegisteredLeaseTO;

/**
 *
 * @author nmafereka
 */
public interface BillingClient extends AbstractWSClient {

    /**
     * External. - Service name prefix for the Billing Web Service
     */
    public static final String SERVICE_NAME = "Billing.";
    /**
     * CaseManagement.checkConnection - Identifier for the checkConnection
     * method
     */
    public static final String CHECK_CONNECTION = SERVICE_NAME + "checkConnection";

    /**
     * Billing.getLease - Identifier for the getLease method
     */
    public static final String GET_LEASE = SERVICE_NAME + "getLease";

    /**
     * Billing.calculateGroundRent - Identifier for the calculateGroundRent
     * method
     */
    public static final String CALCULATE_GROUND_RENT = SERVICE_NAME + "calculateGroundRent";

    /**
     * Billing.getPayRate - Identifier for the getPayRate method
     */
    public static final String GET_PAY_RATE = SERVICE_NAME + "getPayRate";

    /**
     * Billing.isPeriodBilliable - Identifier for the isPeriodBilliable method
     */
    public static final String IS_PERIOD_BILLABLE = SERVICE_NAME + "isPeriodBilliable";
    /**
     * Billing.saveCustomerBill - Identifier for the saveCustomerBill method
     */
    public static final String SAVE_CUSTOMER_BILL = SERVICE_NAME + "saveCustomerBill";

    /**
     * Dummy method to check the web service instance is working.
     */
    @Override
    public boolean checkConnection();

    RegisteredLeaseTO getLease(String leaseNumber);

    CustomerBillTO saveCustomerBill(CustomerBillTO customerBill);

    List<PayRateTO> getPayRate(int billingPeriod, int registrationYear,
            String landUseCode, String groundRentZone);

    BigDecimal calculateGroundRent(BigDecimal leasedArea, BigDecimal groundRentRate,
            String calculationMethod, int complianceCode);

    boolean isPeriodBilliable(int paymentPeriod, int lastPaymentYear);

}
