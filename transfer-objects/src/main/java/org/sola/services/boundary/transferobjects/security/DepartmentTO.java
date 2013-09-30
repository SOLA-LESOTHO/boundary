/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.security;

import java.util.List;

/**
 *
 * @author Charlizza
 */
public class DepartmentTO extends DepartmentSummaryTO {
    private List<UserTO> departmentUsers;
    
    public DepartmentTO(){
        super();
    }

    public List<UserTO> getDepartmentUsers() {
        return departmentUsers;
    }

    public void setDepartmentUsers(List<UserTO> departmentUsers) {
        this.departmentUsers = departmentUsers;
    }
}
