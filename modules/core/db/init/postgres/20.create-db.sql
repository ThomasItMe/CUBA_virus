-- begin SEC_USER
alter table SEC_USER add constraint FK_SEC_USER_ON_EXTCOMPANY foreign key (EXTCOMPANY_ID) references CMS_EXT_COMPANY(ID)^
create index IDX_SEC_USER_ON_EXTCOMPANY on SEC_USER (EXTCOMPANY_ID)^
-- end SEC_USER
