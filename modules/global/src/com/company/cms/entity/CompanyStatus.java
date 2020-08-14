package com.company.cms.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CompanyStatus implements EnumClass<String> {

    NEW("NEW"),
    PENDING_APPROVAL("PENDING_APPROVAL"),
    ACTIVE("ACTIVE"),
    REJECTED("REJECTED"),
    SUSPENDED("SUSPENDED"),
    DELETED("DELETED");

    private String id;

    CompanyStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static CompanyStatus fromId(String id) {
        for (CompanyStatus at : CompanyStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}