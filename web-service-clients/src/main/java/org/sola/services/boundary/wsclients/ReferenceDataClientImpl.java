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

import java.util.List;
import javax.xml.namespace.QName;
//import org.sola.services.boundary.transferobjects.referencedata.ApplicationStageTypeTO;
import org.sola.services.boundary.wsclients.exception.WebServiceClientException;
import org.sola.webservices.referencedata.ReferenceData;
import org.sola.webservices.referencedata.ReferencedataService;
import org.sola.webservices.transferobjects.AbstractCodeTO;
import org.sola.webservices.transferobjects.referencedata.*;

/**
 * Implementation class for the {@linkplain ReferenceDataClient} interface.
 */
public class ReferenceDataClientImpl extends AbstractWSClientImpl implements ReferenceDataClient {

    private static final String NAMESPACE_URI = "http://webservices.sola.org/referencedata";
    private static final String LOCAL_PART = "referencedata-service";

    /**
     * Creates a web service client class for the web service hosted at the
     * specified URL
     *
     * @param url The location of the service WSDL
     */
    public ReferenceDataClientImpl(String url) {
        super(url, new QName(NAMESPACE_URI, LOCAL_PART));
    }

    protected ReferenceData getPort() {
        return getPort(ReferenceData.class, ReferencedataService.class);
    }

    @Override
    public boolean checkConnection() throws WebServiceClientException {
        boolean result = false;
        final String methodName = ReferenceDataClient.CHECK_CONNECTION;
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
    public List<CommunicationTypeTO> getCommunicationTypes(String lang) throws WebServiceClientException {
        List<CommunicationTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_COMMUNICATION_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getCommunicationTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<CommunicationTypeTO> getCommunicationTypes() throws WebServiceClientException {
        return getCommunicationTypes(this.getLanguageCode());
    }

    @Override
    public List<GenderTypeTO> getGenderTypes() throws WebServiceClientException {
        return getGenderTypes(this.getLanguageCode());
    }

    @Override
    public List<GenderTypeTO> getGenderTypes(String lang) throws WebServiceClientException {
        List<GenderTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_GENDER_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getGenderTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<RequestTypeTO> getRequestTypes() throws WebServiceClientException {
        return getRequestTypes(this.getLanguageCode());
    }

    @Override
    public List<RequestTypeTO> getRequestTypes(String lang) throws WebServiceClientException {
        List<RequestTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_REQUEST_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getRequestTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<DisputeReportsTO> getDisputeReports() throws WebServiceClientException {
        return getDisputeReports(this.getLanguageCode());
    }

    @Override
    public List<DisputeReportsTO> getDisputeReports(String lang) throws WebServiceClientException {
        List<DisputeReportsTO> result = null;
        final String methodName = ReferenceDataClient.GET_DISPUTE_REPORTS;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getDisputeReports(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<SourceTypeTO> getSourceTypes() throws WebServiceClientException {
        return getSourceTypes(this.getLanguageCode());
    }

    @Override
    public List<SourceTypeTO> getSourceTypes(String lang) throws WebServiceClientException {
        List<SourceTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_SOURCE_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getSourceTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ApplicationStatusTypeTO> getApplicationStatusTypes() throws WebServiceClientException {
        return getApplicationStatusTypes(getLanguageCode());
    }

    @Override
    public List<ApplicationStatusTypeTO> getApplicationStatusTypes(String lang) throws WebServiceClientException {
        List<ApplicationStatusTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_APPLICATION_STATUS_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getApplicationStatusTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ApplicationStageTypeTO> getApplicationStageTypes() throws WebServiceClientException {
        return getApplicationStageTypes(getLanguageCode());
    }

    @Override
    public List<ApplicationStageTypeTO> getApplicationStageTypes(String lang) throws WebServiceClientException {
        List<ApplicationStageTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_APPLICATION_STAGE_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getApplicationStageTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ServiceStatusTypeTO> getServiceStatusTypes() throws WebServiceClientException {
        return getServiceStatusTypes(getLanguageCode());
    }

    @Override
    public List<ServiceStatusTypeTO> getServiceStatusTypes(String lang) throws WebServiceClientException {
        List<ServiceStatusTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_SERVICE_STATUS_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getServiceStatusTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ServiceActionTypeTO> getServiceActionTypes() throws WebServiceClientException {
        return getServiceActionTypes(getLanguageCode());
    }

    @Override
    public List<ServiceActionTypeTO> getServiceActionTypes(String lang) throws WebServiceClientException {
        List<ServiceActionTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_SERVICE_ACTION_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getServiceActionTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ApplicationActionTypeTO> getApplicationActionTypes() throws WebServiceClientException {
        return getApplicationActionTypes(getLanguageCode());
    }

    @Override
    public List<ApplicationActionTypeTO> getApplicationActionTypes(String lang) throws WebServiceClientException {
        List<ApplicationActionTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_APPLICATION_ACTION_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getApplicationActionTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<PartyTypeTO> getPartyTypes() throws WebServiceClientException {
        return getPartyTypes(getLanguageCode());
    }

    @Override
    public List<PartyTypeTO> getPartyTypes(String lang) throws WebServiceClientException {
        List<PartyTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_PARTY_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getPartyTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<PartyRoleTypeTO> getPartyRoles() throws WebServiceClientException {
        return getPartyRoles(getLanguageCode());
    }

    @Override
    public List<PartyRoleTypeTO> getPartyRoles(String lang) throws WebServiceClientException {
        List<PartyRoleTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_PARTY_ROLES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getPartyRoles(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<IdTypeTO> getIdTypes() throws WebServiceClientException {
        return getIdTypes(getLanguageCode());
    }

    @Override
    public List<IdTypeTO> getIdTypes(String lang) throws WebServiceClientException {
        List<IdTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_ID_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getIdTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ChangeStatusTypeTO> getChangeStatusTypes() throws WebServiceClientException {
        return getChangeStatusTypes(getLanguageCode());
    }

    @Override
    public List<ChangeStatusTypeTO> getChangeStatusTypes(String lang) throws WebServiceClientException {
        List<ChangeStatusTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_CHANGE_STATUS_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getChangeStatuTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<BaUnitTypeTO> getBaUnitTypes() throws WebServiceClientException {
        return getBaUnitTypes(this.getLanguageCode());
    }

    @Override
    public List<BaUnitTypeTO> getBaUnitTypes(String lang) throws WebServiceClientException {
        List<BaUnitTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_BA_UNIT_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getBaUnitTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<MortgageTypeTO> getMortgageTypes() throws WebServiceClientException {
        return getMortgageTypes(getLanguageCode());
    }

    @Override
    public List<MortgageTypeTO> getMortgageTypes(String lang) throws WebServiceClientException {
        List<MortgageTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_MORTGAGE_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getMortgageTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<RrrGroupTypeTO> getRrrGroupTypes() throws WebServiceClientException {
        return getRrrGroupTypes(getLanguageCode());
    }

    @Override
    public List<RrrGroupTypeTO> getRrrGroupTypes(String lang) throws WebServiceClientException {
        List<RrrGroupTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_RRR_GROUP_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getRRRGroupTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<RrrTypeTO> getRrrTypes() throws WebServiceClientException {
        return getRrrTypes(getLanguageCode());
    }

    @Override
    public List<RrrTypeTO> getRrrTypes(String lang) throws WebServiceClientException {
        List<RrrTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_RRR_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getRRRTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<SourceBaUnitRelationTypeTO> getSourceBaUnitRelationTypes()
            throws WebServiceClientException {
        return getSourceBaUnitRelationTypes(getLanguageCode());
    }

    @Override
    public List<SourceBaUnitRelationTypeTO> getSourceBaUnitRelationTypes(String lang)
            throws WebServiceClientException {
        List<SourceBaUnitRelationTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_SOURCE_BA_UNIT_RELATION_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getSourceBaUnitRelationTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<RegistrationStatusTypeTO> getRegistrationStatusTypes()
            throws WebServiceClientException {
        return getRegistrationStatusTypes(getLanguageCode());
    }

    @Override
    public List<RegistrationStatusTypeTO> getRegistrationStatusTypes(String lang)
            throws WebServiceClientException {
        List<RegistrationStatusTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_REGISTRATION_STATUS_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getRegistrationStatusTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<LandGradeTypeTO> getLandGradeTypes()
            throws WebServiceClientException {
        return getLandGradeTypes(getLanguageCode());
    }

    @Override
    public List<LandGradeTypeTO> getLandGradeTypes(String lang)
            throws WebServiceClientException {
        List<LandGradeTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_LAND_GRADE_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getLandGradeTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<CadastreObjectTypeTO> getCadastreObjectTypes()
            throws WebServiceClientException {
        return getCadastreObjectTypes(getLanguageCode());
    }

    @Override
    public List<CadastreObjectTypeTO> getCadastreObjectTypes(String lang)
            throws WebServiceClientException {
        List<CadastreObjectTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_CADASTRE_OBJECT_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getCadastreObjectTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<TypeActionTO> getTypeActions() throws WebServiceClientException {
        return getTypeActions(getLanguageCode());
    }

    @Override
    public List<TypeActionTO> getTypeActions(String lang) throws WebServiceClientException {
        List<TypeActionTO> result = null;
        final String methodName = ReferenceDataClient.GET_TYPE_ACTIONS;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getTypeActions(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public AbstractCodeTO saveReferenceData(AbstractCodeTO refDataTO) {
        AbstractCodeTO result = null;
        final String methodName = ReferenceDataClient.SAVE_REFERENCE_DATA;
        try {
            beforeWebMethod(methodName, refDataTO);
            result = getPort().saveReferenceData(refDataTO);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, refDataTO);
        }
        return result;
    }

    @Override
    public List<RequestCategoryTypeTO> getRequestCategoryTypes() throws WebServiceClientException {
        return getRequestCategoryTypes(getLanguageCode());
    }

    @Override
    public List<RequestCategoryTypeTO> getRequestCategoryTypes(String lang) throws WebServiceClientException {
        List<RequestCategoryTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_REQUEST_CATEGORY_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getRequestCategoryTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<BrTechnicalTypeTO> getBrTechnicalTypes() throws WebServiceClientException {
        return getBrTechnicalTypes(getLanguageCode());
    }

    @Override
    public List<BrTechnicalTypeTO> getBrTechnicalTypes(String lang) throws WebServiceClientException {
        List<BrTechnicalTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_BR_TECHNICAL_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getBrTechnicalTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<BrValidationTargetTypeTO> getBrValidationTargetTypes() throws WebServiceClientException {
        return getBrValidationTargetTypes(getLanguageCode());
    }

    @Override
    public List<BrValidationTargetTypeTO> getBrValidationTargetTypes(String lang) throws WebServiceClientException {
        List<BrValidationTargetTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_BR_VALIDATION_TARGET_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getBrValidationTargetTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<BrSeverityTypeTO> getBrSeverityTypes() throws WebServiceClientException {
        return getBrSeverityTypes(getLanguageCode());
    }

    @Override
    public List<BrSeverityTypeTO> getBrSeverityTypes(String lang) throws WebServiceClientException {
        List<BrSeverityTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_BR_SEVERITY_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getBrSeverityTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<BaUnitRelTypeTO> getBaUnitRelTypes(String lang) throws WebServiceClientException {
        List<BaUnitRelTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_BA_UNIT_REL_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getBaUnitRelTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<BaUnitRelTypeTO> getBaUnitRelTypes() throws WebServiceClientException {
        return getBaUnitRelTypes(getLanguageCode());
    }

    /*
     * LAA Addition thoriso
     */
    @Override
    public List<DisputeActionTO> getDisputeAction() throws WebServiceClientException {
        return getDisputeAction(getLanguageCode());
    }

    @Override
    public List<DisputeActionTO> getDisputeAction(String lang) throws WebServiceClientException {
        List<DisputeActionTO> result = null;
        final String methodName = ReferenceDataClient.GET_DISPUTE_ACTION;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getDisputeAction(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<DisputeCategoryTO> getDisputeCategory() throws WebServiceClientException {
        return getDisputeCategory(getLanguageCode());
    }

    @Override
    public List<DisputeCategoryTO> getDisputeCategory(String lang) throws WebServiceClientException {
        List<DisputeCategoryTO> result = null;
        final String methodName = ReferenceDataClient.GET_DISPUTE_CATEGORY;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getDisputeCategory(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<DisputeStatusTO> getDisputeStatus() throws WebServiceClientException {
        return getDisputeStatus(getLanguageCode());
    }

    @Override
    public List<DisputeStatusTO> getDisputeStatus(String lang) throws WebServiceClientException {
        List<DisputeStatusTO> result = null;
        final String methodName = ReferenceDataClient.GET_DISPUTE_STATUS;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getDisputeStatus(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<DisputeTypeTO> getDisputeType() throws WebServiceClientException {
        return getDisputeType(getLanguageCode());
    }

    @Override
    public List<DisputeTypeTO> getDisputeType(String lang) throws WebServiceClientException {
        List<DisputeTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_DISPUTE_TYPE;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getDisputeType(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<RoadClassTypeTO> getRoadClassType() throws WebServiceClientException {
        return getRoadClassType(getLanguageCode());
    }

    @Override
    public List<RoadClassTypeTO> getRoadClassType(String lang) throws WebServiceClientException {
        List<RoadClassTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_ROAD_CLASS_TYPE;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getRoadClassType(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<OtherAuthoritiesTO> getOtherAuthorities() throws WebServiceClientException {
        return getOtherAuthorities(getLanguageCode());
    }

    @Override
    public List<OtherAuthoritiesTO> getOtherAuthorities(String lang) throws WebServiceClientException {
        List<OtherAuthoritiesTO> result = null;
        final String methodName = ReferenceDataClient.GET_OTHER_AUTHORITIES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getOtherAuthorities(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<ApplicationFormTO> getApplicationForms() throws WebServiceClientException {
        return getApplicationForms(getLanguageCode());
    }

    @Override
    public List<ApplicationFormTO> getApplicationForms(String lang) throws WebServiceClientException {
        List<ApplicationFormTO> result = null;
        final String methodName = ReferenceDataClient.GET_APPLICATION_FORMS;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getApplicationForms(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public ApplicationFormWithBinaryTO getApplicationForm(String code, String lang) throws WebServiceClientException {
        ApplicationFormWithBinaryTO result = null;
        final String methodName = ReferenceDataClient.GET_APPLICATION_FORM;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getApplicationForm(code, lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public ApplicationFormWithBinaryTO getApplicationForm(String code) throws WebServiceClientException {
        return getApplicationForm(code, getLanguageCode());
    }

    @Override
    public List<LandUseTypeTO> getLandUseTypes()
            throws WebServiceClientException {
        return getLandUseTypes(getLanguageCode());
    }

    @Override
    public List<LandUseTypeTO> getLandUseTypes(String lang)
            throws WebServiceClientException {
        List<LandUseTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_LAND_USE_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getLandUseTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);
        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;
    }

    @Override
    public List<LegalTypeTO> getLegalTypes() throws WebServiceClientException {
        return getLegalTypes(getLanguageCode());
    }

    @Override
    public List<LegalTypeTO> getLegalTypes(String lang) throws WebServiceClientException {

        List<LegalTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_LEGAL_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getLegalTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);

        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;

    }

    //reference data implementation
    @Override
    public List<ParcelJurisdictionTypeTO> getParcelJurisdictionTypes() throws WebServiceClientException {
        return getParcelJurisdictionTypes(getLanguageCode());
    }

    @Override
    public List<ParcelJurisdictionTypeTO> getParcelJurisdictionTypes(String lang) throws WebServiceClientException {

        List<ParcelJurisdictionTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_PARCEL_JURISDICTION_TYPES;
        try {
            beforeWebMethod(methodName, lang);
            result = getPort().getParcelJurisdictionTypes(lang);
        } catch (Exception e) {
            processException(methodName, e);

        } finally {
            afterWebMethod(methodName, result, lang);
        }
        return result;

    }

    @Override
    public List<TransactionTypeTO> getTransactionTypes() throws WebServiceClientException {
        return getTransactionTypes(getLanguageCode());
    }

    @Override
    public List<TransactionTypeTO> getTransactionTypes(String languageCode) throws WebServiceClientException {
        List<TransactionTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_TRANSACTION_TYPES;
        try {
            beforeWebMethod(methodName, languageCode);
            result = getPort().getTransactionTypes(languageCode);
        } catch (Exception e) {
            processException(methodName, e);

        } finally {
            afterWebMethod(methodName, result, languageCode);
        }
        return result;
    }

    /**
     * Retrieves all administrative.lease_type code values.
     *
     * @param languageCode The language code to use for localization of display
     * values.
     * @return 
     * @throws WebServiceClientException
     */
    @Override
    public List<LeaseTypeTO> getLeaseTypes(String languageCode) throws WebServiceClientException {
        
        List<LeaseTypeTO> result = null;
        final String methodName = ReferenceDataClient.GET_LEASE_TYPES;
        try {
            beforeWebMethod(methodName, languageCode);
            result = getPort().getLeaseTypes(languageCode);
        } catch (Exception e) {
            processException(methodName, e);

        } finally {
            afterWebMethod(methodName, result, languageCode);
        }
        return result;
    }
}
