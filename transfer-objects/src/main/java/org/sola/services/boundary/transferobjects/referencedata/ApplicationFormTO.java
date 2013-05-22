/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.referencedata;

import org.sola.services.common.contracts.AbstractCodeTO;

/**
 * Transfer object representing structure of ApplicationForm entity.
 */
public class ApplicationFormTO extends AbstractCodeTO {
    
    private byte[] content;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public ApplicationFormTO() {
        super();
    }
}
