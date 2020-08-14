-- begin CMS_EXT_COMPANY
create table CMS_EXT_COMPANY (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE_ varchar(50),
    LEVEL_ varchar(50),
    STATUS varchar(50),
    REGISTRATION_NO varchar(255),
    COMPANY_LICENSE_PHOTO_ID varchar(32),
    AUTHORIZATION_LETTER_PHOTO_ID varchar(32),
    --
    primary key (ID)
)^
-- end CMS_EXT_COMPANY
-- begin SEC_USER
alter table SEC_USER add column PHONE varchar(32) ^
update SEC_USER set PHONE = '' where PHONE is null ^
alter table SEC_USER modify column PHONE varchar(32) not null ^
alter table SEC_USER add column EXTCOMPANY_ID varchar(32) ^
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'cms_ExtUser' where DTYPE is null ^
-- end SEC_USER
