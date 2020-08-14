package com.company.cms.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CMS_EXT_COMPANY")
@Entity(name = "cms_ExtCompany")
@NamePattern("%s|name")
public class ExtCompany extends StandardEntity {
    private static final long serialVersionUID = -602884000799892741L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "LEVEL_")
    private String level;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REGISTRATION_NO")
    private String registrationNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_LICENSE_PHOTO_ID")
    private FileDescriptor companyLicensePhoto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHORIZATION_LETTER_PHOTO_ID")
    private FileDescriptor authorizationLetterPhoto;

    public void setCompanyLicensePhoto(FileDescriptor companyLicensePhoto) {
        this.companyLicensePhoto = companyLicensePhoto;
    }

    public FileDescriptor getCompanyLicensePhoto() {
        return companyLicensePhoto;
    }

    public FileDescriptor getAuthorizationLetterPhoto() {
        return authorizationLetterPhoto;
    }

    public void setAuthorizationLetterPhoto(FileDescriptor authorizationLetterPhoto) {
        this.authorizationLetterPhoto = authorizationLetterPhoto;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public CompanyStatus getStatus() {
        return status == null ? null : CompanyStatus.fromId(status);
    }

    public void setStatus(CompanyStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public CompanyLevel getLevel() {
        return level == null ? null : CompanyLevel.fromId(level);
    }

    public void setLevel(CompanyLevel level) {
        this.level = level == null ? null : level.getId();
    }

    public CompanyType getType() {
        return type == null ? null : CompanyType.fromId(type);
    }

    public void setType(CompanyType type) {
        this.type = type == null ? null : type.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}