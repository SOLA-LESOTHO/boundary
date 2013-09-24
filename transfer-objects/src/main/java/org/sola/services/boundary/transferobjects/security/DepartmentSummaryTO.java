/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.security;

import org.sola.services.common.contracts.AbstractIdTO;

/**
 *
 * @author Charlizza
 */
public class DepartmentSummaryTO extends AbstractIdTO {

    private String name;
    private String description;

    public DepartmentSummaryTO() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
