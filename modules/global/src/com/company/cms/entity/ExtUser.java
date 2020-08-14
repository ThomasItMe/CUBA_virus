package com.company.cms.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Extends(User.class)
@Entity(name = "cms_ExtUser")
public class ExtUser extends User {
    private static final long serialVersionUID = 4799773102684451948L;

    @Column(name = "PHONE", nullable = false, length = 32)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXTCOMPANY_ID")
    private ExtCompany company;

    public ExtCompany getExtcompany() {
        return company;
    }

    public void setExtcompany(ExtCompany company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}