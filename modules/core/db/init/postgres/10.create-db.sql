-- begin CMS_EXT_COMPANY
create table CMS_EXT_COMPANY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    STATUS varchar(50),
    --
    primary key (ID)
)^
-- end CMS_EXT_COMPANY
-- begin SEC_USER
alter table SEC_USER add column PHONE varchar(32) ^
update SEC_USER set PHONE = '' where PHONE is null ^
alter table SEC_USER alter column PHONE set not null ^
alter table SEC_USER add column EXTCOMPANY_ID uuid ^
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'cms_ExtUser' where DTYPE is null ^
-- end SEC_USER
