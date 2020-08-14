package com.company.cms.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CompanyLevel implements EnumClass<String> {

    MARKET_OWNER("MARKET_OWNER"),
    MARKET_OUTSIDER("MARKET_OUTSIDER"),
    MARKET_PLAYER("MARKET_PLAYER");

    private String id;

    CompanyLevel(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static CompanyLevel fromId(String id) {
        for (CompanyLevel at : CompanyLevel.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}