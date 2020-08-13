package com.company.cms.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CMS_EXT_COMPANY")
@Entity(name = "cms_ExtCompany")
@NamePattern("%s|name")
public class ExtCompany extends StandardEntity {
    private static final long serialVersionUID = -602884000799892741L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "STATUS")
    private String status;

    public StatusType getStatus() {
        return status == null ? null : StatusType.fromId(status);
    }

    public void setStatus(StatusType status) {
        this.status = status == null ? null : status.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}