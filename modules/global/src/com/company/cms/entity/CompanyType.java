package com.company.cms.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CompanyType implements EnumClass<String> {

    ANCHOR("ANCHOR"),
    FI("FI"),
    SUPPLIER("SUPPLIER");

    private String id;

    CompanyType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static CompanyType fromId(String id) {
        for (CompanyType at : CompanyType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}