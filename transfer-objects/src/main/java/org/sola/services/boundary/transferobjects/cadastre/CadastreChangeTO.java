/**
 * ******************************************************************************************
 * Copyright (c) 2013 Food and Agriculture Organization of the United Nations (FAO)
 * and the Lesotho Land Administration Authority (LAA). All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the names of FAO, the LAA nor the names of its contributors may be used to
 *       endorse or promote products derived from this software without specific prior
 * 	  written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.transferobjects.cadastre;

import java.util.ArrayList;
import java.util.List;
import org.sola.services.common.contracts.AbstractTO;

/**
 * Custom TO for CadastreChange
 * @author manoku
 */
public class CadastreChangeTO extends AbstractTO{
    String fromServiceId;
    List<CadastreObjectTO> cadastreObjectList = new ArrayList<CadastreObjectTO>();
    List<SurveyPointTO> surveyPointList = new ArrayList<SurveyPointTO>();
    List<String> targetCadastreObjectIdList = new ArrayList<String>();
    List<String> sourceIdList = new ArrayList<String>();

    public List<CadastreObjectTO> getCadastreObjectList() {
        return cadastreObjectList;
    }

    public void setCadastreObjectList(List<CadastreObjectTO> CadastreObjectList) {
        this.cadastreObjectList = CadastreObjectList;
    }

    public String getFromServiceId() {
        return fromServiceId;
    }

    public void setFromServiceId(String fromServiceId) {
        this.fromServiceId = fromServiceId;
    }

    public List<String> getSourceIdList() {
        return sourceIdList;
    }

    public void setSourceIdList(List<String> sourceIdList) {
        this.sourceIdList = sourceIdList;
    }

    public List<SurveyPointTO> getSurveyPointList() {
        return surveyPointList;
    }

    public void setSurveyPointList(List<SurveyPointTO> surveyPointList) {
        this.surveyPointList = surveyPointList;
    }

    public List<String> getTargetCadastreObjectIdList() {
        return targetCadastreObjectIdList;
    }

    public void setTargetCadastreObjectIdList(List<String> targetCadastreObjectIdList) {
        this.targetCadastreObjectIdList = targetCadastreObjectIdList;
    }
    
}
