package com.company.cms.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum StatusType implements EnumClass<String> {

    ACTIVE("active"),
    INACTIVE("inactive");

    private String id;

    StatusType(String value) {
        this.id = value;
    }

    StatusType() {

    }

    public String getId() {
        return id;
    }

    @Nullable
    public static StatusType fromId(String id) {
        for (StatusType at : StatusType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}