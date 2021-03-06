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
package org.sola.services.boundary.wsclients;

import java.util.Date;
import java.util.List;
import org.sola.services.boundary.wsclients.exception.WebServiceClientException;
import org.sola.webservices.admin.BrTO;
import org.sola.webservices.admin.LanguageTO;
import org.sola.webservices.admin.SettingTO;
import org.sola.webservices.transferobjects.security.GroupSummaryTO;
import org.sola.webservices.transferobjects.security.GroupTO;
import org.sola.webservices.transferobjects.security.RoleTO;
import org.sola.webservices.transferobjects.security.UserTO;
import org.sola.webservices.transferobjects.security.DepartmentTO;
import org.sola.webservices.transferobjects.security.DepartmentSummaryTO;

/**
 * Interface for the Admin Service. Implemented by {@linkplain AdminClientImpl}.
 * To obtain a reference to the Admin Service, use
 * {@linkplain WSManager#getAdminService()}
 *
 * @see AdminClientImpl
 * @see WSManager#getAdminService()
 */
public interface AdminClient extends AbstractWSClient {

    /**
     * Admin. - Service name prefix for the Admin Web Service
     */
    public static final String SERVICE_NAME = "Admin.";
    /**
     * Admin.checkConnection - Identifier for the checkConnection method
     */
    public static final String CHECK_CONNECTION = SERVICE_NAME + "checkConnection";
    /**
     * Admin.getCurrentUser - Identifier for the getCurrentUser method
     */
    public static final String GET_CURRENT_USER = SERVICE_NAME + "getCurrentUser";
    /**
     * Admin.getCurrentUserRoles - Identifier for the getCurrentUserRoles method
     */
    public static final String GET_CURRENT_USER_ROLES = SERVICE_NAME + "getCurrentUserRoles";
    /**
     * Admin.getGroups - Identifier for the getGroups method
     */
    public static final String GET_GROUPS = SERVICE_NAME + "getGroups";
    /**
     * Admin.getDepartments - Identifier for the getDepartments method
     */
    public static final String GET_DEPARTMENTS = SERVICE_NAME + "getDepartments";
    /**
     * Admin.getGroupsSummary - Identifier for the getGroupsSummary method
     */
    public static final String GET_GROUPS_SUMMARY = SERVICE_NAME + "getGroupsSummary";
    /**
     * Admin.getDepartmentsSummary - Identifier for the getDepartmentsSummary
     * method
     */
    public static final String GET_DEPARTMENTS_SUMMARY = SERVICE_NAME + "getDepartmentsSummary";
    /**
     * Admin.getGroup - Identifier for the getGroup method
     */
    public static final String GET_GROUP = SERVICE_NAME + "getGroup";
    /**
     * Admin.getDepartment - Identifier for the getDepartment method
     */
    public static final String GET_DEPARTMENT = SERVICE_NAME + "getDepartment";
    /**
     * Admin.getUser - Identifier for the getUser method
     */
    public static final String GET_USER = SERVICE_NAME + "getUser";
    /**
     * Admin.saveUser - Identifier for the saveUser method
     */
    public static final String SAVE_USER = SERVICE_NAME + "saveUser";
    /**
     * Admin.saveGroup - Identifier for the saveDepartment method
     */
    public static final String SAVE_DEPARTMENT = SERVICE_NAME + "saveDepartment";
    /**
     * Admin.saveGroup - Identifier for the saveGroup method
     */
    public static final String SAVE_GROUP = SERVICE_NAME + "saveGroup";
    /**
     * Admin.saveRole - Identifier for the saveRole method
     */
    public static final String SAVE_ROLE = SERVICE_NAME + "saveRole";
    /**
     * Admin.getRoles - Identifier for the getRoles method
     */
    public static final String GET_ROLES = SERVICE_NAME + "getRoles";
    /**
     * Admin.changePassword - Identifier for the changePassword method
     */
    public static final String CHANGE_PASSWORD = SERVICE_NAME + "changePassword";
    /**
     * Admin.getBr - Identifier for the getBr method
     */
    public static final String GET_BR = SERVICE_NAME + "getBr";
    /**
     * Admin.getLanguages - Identifier for the getLanguages method
     */
    public static final String GET_LANGUAGES = SERVICE_NAME + "getLanguages";
    /**
     * Admin.isUserAdmin - Identifier for the isUserAdmin method
     */
    public static final String IS_USER_ADMIN = SERVICE_NAME + "isUserAdmin";
    /**
     * Admin.saveBr - Identifier for the saveBr method
     */
    public static final String SAVE_BR = SERVICE_NAME + "saveBr";
    /**
     * Admin.getAllSettings - Identifier for the getAllSettings method
     */
    public static final String GET_ALL_SETTINGS = SERVICE_NAME + "getAllSettings";
    /**
     * Admin.getSetting - Identifier for the getSetting method
     */
    public static final String GET_SETTING = SERVICE_NAME + "getSetting";
    /**
     * Admin.getSlrMigrationProgressMessage - Identifier for the
     * getSlrMigrationProgressMessage method
     */
    public static final String GET_SLR_MIGRATION_PROG_MSG = SERVICE_NAME + "getSlrMigrationProgressMessage";
    /**
     * Admin.transferSlrSource - Identifier for the transferSlrSource method
     */
    public static final String TRANSFER_SLR_SOURCE = SERVICE_NAME + "transferSlrSource";
    /**
     * Admin.transferSlrParcel - Identifier for the transferSlrParcel method
     */
    public static final String TRANSFER_SLR_PARCEL = SERVICE_NAME + "transferSlrParcel";
    /**
     * Admin.transferSlrParty - Identifier for the transferSlrParty method
     */
    public static final String TRANSFER_SLR_PARTY = SERVICE_NAME + "transferSlrParty";
    /**
     * Admin.transferSlrLease - Identifier for the transferSlrLease method
     */
    public static final String TRANSFER_SLR_LEASE = SERVICE_NAME + "transferSlrLease";
    /**
     * Admin.loadSource - Identifier for the loadSource method
     */
    public static final String LOAD_SOURCE = SERVICE_NAME + "loadSource";
    /**
     * Admin.loadParcel - Identifier for the loadParcel method
     */
    public static final String LOAD_PARCEL = SERVICE_NAME + "loadParcel";
    /**
     * Admin.loadLeaseAndParty - Identifier for the loadLeaseAndParty method
     */
    public static final String LOAD_LEASE_AND_PARTY = SERVICE_NAME + "loadLeaseAndParty";
    /**
     * Admin.loadRrrSourceLink - Identifier for the loadRrrSourceLink method
     */
    public static final String LOAD_RRR_SOURCE_LINK = SERVICE_NAME + "loadRrrSourceLink";

    /**
     * Returns the details for the currently authenticated user. <p>No role is
     * required to execute this method.</p>
     *
     * @throws WebServiceClientException
     */
    UserTO getCurrentUser() throws WebServiceClientException;

    /**
     * Returns the list of all user groups supported by SOLA. <p>Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @throws WebServiceClientException
     */
    List<GroupTO> getGroups() throws WebServiceClientException;

    /**
     * Returns the list of all user departments supported by SOLA. <p>Requires
     * the {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @throws WebServiceClientException
     */
    List<DepartmentTO> getDepartments() throws WebServiceClientException;

    /**
     * Returns a summary list of all user groups supported by SOLA. <p>Requires
     * the {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @throws WebServiceClientException
     */
    List<GroupSummaryTO> getGroupsSummary() throws WebServiceClientException;

    /**
     * Returns a summary list of all user departments supported by SOLA.
     * <p>Requires the {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY}
     * role.</p>
     *
     * @throws WebServiceClientException
     */
    List<DepartmentSummaryTO> getDepartmentsSummary() throws WebServiceClientException;

    /**
     * Returns the details for the specified group. <p>Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @param groupId The identifier of the group to retrieve from the SOLA
     * database
     * @throws WebServiceClientException
     */
    GroupTO getGroup(String groupId) throws WebServiceClientException;

    /**
     * Returns the details for the specified department. <p>Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @param departmentId The identifier of the group to retrieve from the SOLA
     * database
     * @throws WebServiceClientException
     */
    DepartmentTO getDepartment(String departmentId) throws WebServiceClientException;

    /**
     * Returns the details of the user with the specified user name. <p>Requires
     * the {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @param userName The user name of the user to search for.
     * @throws WebServiceClientException
     */
    UserTO getUser(String userName) throws WebServiceClientException;

    /**
     * Can be used to create a new user or save any updates to the details of an
     * existing user. Cannot be used to change the users password. This can only
     * be done using
     * {@linkplain #changePassword(java.lang.String, java.lang.String) changePassword}
     * method. <p>
     * Requires the {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role. </p>
     *
     * @param userTO The details of the user to save
     * @return The user details after the save is completed
     * @throws WebServiceClientException
     */
    UserTO saveUser(UserTO userTO) throws WebServiceClientException;

    /**
     * Can be used to create a new user group or save any updates to the details
     * of an existing user group. <p> Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role. </p>
     *
     * @param groupTO The details of the user group to save
     * @return The user group after the save is completed
     * @throws WebServiceClientException
     */
    GroupTO saveGroup(GroupTO groupTO) throws WebServiceClientException;

    /**
     * Can be used to create a new user department or save any updates to the
     * details of an existing user group. <p> Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role. </p>
     *
     * @param departmentTO The details of the user department to save
     * @return The user department after the save is completed
     * @throws WebServiceClientException
     */
    DepartmentTO saveDepartment(DepartmentTO departmentTO) throws WebServiceClientException;

    /**
     * Can be used to create a new security role or save any updates to the
     * details of an existing security role. <p> Note that security roles are
     * linked to the SOLA code base. Adding a new role also requires updating
     * code before SOLA will recognize the role</p> <p> Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role. </p>
     *
     * @param roleTO The details of the security role to save
     * @return The security role after the save is completed
     * @throws WebServiceClientException
     */
    RoleTO saveRole(RoleTO roleTO) throws WebServiceClientException;

    /**
     * Returns the list of all security roles in SOLA. <p>Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @throws WebServiceClientException
     */
    List<RoleTO> getRoles() throws WebServiceClientException;

    /**
     * Returns the list of all security roles assigned to the current user.
     * <p>No role is required to execute this method.</p>
     *
     * @throws WebServiceClientException
     */
    List<RoleTO> getCurrentUserRoles() throws WebServiceClientException;

    /**
     * Allows the users password to be changed. <p> Requires the
     * {@linkplain RolesConstants.ADMIN_CHANGE_PASSWORD} role. </p>
     *
     * @param userName The username to change the password for
     * @param password The users new password
     * @return true if the change is successful.
     * @throws WebServiceClientException
     */
    boolean changePassword(String userName, String password) throws WebServiceClientException;

    /**
     * Checks if the current user has been assigned one or more of the null null
     * null null null null null null     {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY},
     * {@linkplain RolesConstants.ADMIN_MANAGE_REFDATA} or
     * {@linkplain RolesConstants.ADMIN_MANAGE_SETTINGS} security roles. <p> No
     * role is required to execute this method.</p>
     *
     * @return true if the user is assigned one of the Admin security roles
     * @throws WebServiceClientException
     */
    boolean isUserAdmin() throws WebServiceClientException;

    /**
     * Returns the list of languages supported by SOLA for localization in
     * priority order. The display value for each language is based on the
     * default locale of the client application.
     * <p>No role is required to execute this method.</p>
     *
     * @return See description
     * @throws WebServiceClientException
     */
    List<LanguageTO> getLanguages() throws WebServiceClientException;

    /**
     * Returns the list of languages supported by SOLA for localization in
     * priority order. <p>No role is required to execute this method.</p>
     *
     * @param lang The language code to use to localize the display value for
     * each language.
     * @throws WebServiceClientException
     */
    List<LanguageTO> getLanguages(String lang) throws WebServiceClientException;

    /**
     * Returns the SOLA business rule matching the id. <p>Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role.</p>
     *
     * @param id Identifier for the business rule to return
     * @param lang The language code to use to localize the display value for
     * each Br.
     * @throws WebServiceClientException
     */
    BrTO getBr(String id, String lang) throws WebServiceClientException;

    /**
     * Returns the SOLA business rule matching the id. The display value for
     * each Br is based on the default locale for the client application.
     * <p>Requires the {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY}
     * role.</p>
     *
     * @param id Identifier for the business rule to return
     * @throws WebServiceClientException
     */
    BrTO getBr(String id) throws WebServiceClientException;

    /**
     * Can be used to create a new business rule or save any updates to the
     * details of an existing business role. <p> Requires the
     * {@linkplain RolesConstants.ADMIN_MANAGE_SECURITY} role. </p>
     *
     * @param brTO The business rule to save.
     * @return The updated/new business rule.
     * @throws WebServiceClientException
     */
    BrTO saveBr(BrTO brTO) throws WebServiceClientException;

    /**
     * Returns all configuration settings in the system.setting table.<p>No role
     * is required to execute this method.</p>
     *
     * @return The settings from the system.setting table
     * @throws WebServiceClientException
     */
    List<SettingTO> getAllSettings() throws WebServiceClientException;

    /**
     * Retrieves the value for the named setting. Constants for each setting are
     * available in {@linkplain  ConfigConstants}. If the setting does not exist,
     * the default value for the setting is returned. <p>No role is required to
     * execute this method.</p>
     *
     * @param name The name of the setting to retrieve
     * @param defaultValue The default value for the setting if it no override
     * value is recorded in the system.settings table.
     * @return The override value for the setting or the defaultValue.
     */
    String getSetting(String name, String defaultValue) throws WebServiceClientException;

    /**
     * Retrieves the message indicating the progress of the currently running
     * SLR Migration method
     *
     * @return
     * @throws WebServiceClientException
     */
    String getSlrMigrationProgressMessage() throws WebServiceClientException;

    /**
     * Transfers a summary of the documents in the Lesotho (SLR) database into
     * the SOLA SLR schema.
     *
     * @param adjudicationArea Used to limit the number of records returned
     * based on the adjudication area (e.g. 11-1, 30-1, etc)
     * @param registeredOnly If true, only documents associated with a
     * registered SAR1 from are retrieved. If false,all documents that are at
     * the stage of being submitted to LAA are retrieved.
     * @param fromDate Used with toDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table.
     * @param toDate Used with fromDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table.
     * @return Summary messages describing the progress of the transfer.
     */
    String transferSlrSource(String adjudicationArea, boolean registeredOnly,
            Date fromDate, Date toDate) throws WebServiceClientException;

    /**
     * Loads the slr_source records into the source.source table.
     *
     * @return Summary messages describing the progress of the load.
     */
    String loadSource() throws WebServiceClientException;

    /**
     * Transfers the published parcels from the Lesotho (SLR) database into the
     * SOLA SLR schema. Also checks the data to load into SOLA and marks which
     * data attributes will be updated if a matching record already exists in
     * SOLA. Modifying the flags in the slr.slr_parcel table will affect which
     * records are uploaded/modified.
     *
     * @param adjudicationArea Used to limit the number of records returned
     * based on the adjudication area (e.g. 11-1, 30-1, etc)
     * @param fromDate Used with toDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table. If null,
     * all parcels in the PublishedParcels table will be transferred.
     * @param toDate Used with fromDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table. If null,
     * all parcels in the PublishedParcels table will be transferred.
     * @return Summary messages describing the progress of the transfer.
     */
    String transferSlrParcel(String adjudicationArea, Date fromDate, Date toDate) throws WebServiceClientException;

    /**
     * Loads the slr_parcel records into the cadastre schema. The records and
     * data attributes to update/modify can be controlled by setting the update
     * flags on the slr_parcel table.
     *
     * @return Summary messages describing the progress of the load.
     */
    String loadParcel() throws WebServiceClientException;

    /**
     * Transfers lease details from the Lesotho (SLR) database into the SOLA SLR
     * schema.
     *
     * @param registrationDate The date to use as the registration date for the
     * leases If null, a default value of 15-Aug-2013 will be used.
     * @param adjudicationArea Used to limit the number of records returned
     * based on the adjudication area (e.g. 11-1, 30-1, etc)
     * @param registeredOnly If true, only leases associated with a registered
     * SAR1 from are retrieved. If false,all leases that are at the stage of
     * being submitted to LAA are retrieved.
     * @param fromDate Used with toDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table.
     * @param toDate Used with fromDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table.
     * @return Summary messages describing the progress of the transfer.
     */
    String transferSlrLease(Date registrationDate, String adjudicationArea, boolean registeredOnly, 
            Date fromDate, Date toDate) throws WebServiceClientException;

    /**
     * Transfers lease details from the Lesotho (SLR) database into the SOLA SLR
     * schema.
     *
     * @param adjudicationArea Used to limit the number of records returned
     * based on the adjudication area (e.g. 11-1, 30-1, etc)
     * @param registeredOnly If true, only leases associated with a registered
     * SAR1 from are retrieved. If false,all leases that are at the stage of
     * being submitted to LAA are retrieved.
     * @param fromDate Used with toDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table.
     * @param toDate Used with fromDate to limit the number of records returned
     * by checking the lastModified date of the dbo.mfDocuments table.
     * @return Summary messages describing the progress of the transfer.
     */
    String transferSlrParty(String adjudicationArea, boolean registeredOnly, 
            Date fromDate, Date toDate) throws WebServiceClientException;

    /**
     * Loads the slr_lease and slr_party records into the party and
     * administrative schemas. This method only inserts new records. If an
     * existing record is found, it is left unchanged.
     *
     * @param makeCurrent The transerSlrLease method can be used to transfer
     * leases that have been submitted to LAA, but not yet marked as registered
     * in the SLR database. By default these leases are transfered with a
     * 'pending' status into SOLA. To force these leases to have a 'current'
     * status in SOLA, set makeCurrent = true. When makeCurrent is false the
     * status of the lease is determined based on its status in the SLR
     * database.
     * @return Summary messages describing the progress of the load.
     */
    String loadLeaseAndParty(boolean makeCurrent) throws WebServiceClientException;

    /**
     * Loads records into the administrative.source_describes_rrr to link the
     * Rrr and Source records that have been migrated from the SLR database.
     *
     * @return Summary messages describing the progress of the load.
     */
    String loadRrrSourceLink() throws WebServiceClientException;
}
