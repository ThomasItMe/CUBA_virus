alter table CMS_EXT_COMPANY change column COMPANY_LICENSE_PHOTO_ID COMPANY_LICENSE_PHOTO_ID__U79373 varchar(32)^
alter table CMS_EXT_COMPANY drop foreign key FK_CMS_EXT_COMPANY_ON_COMPANY_LICENSE_PHOTO;
drop index IDX_CMS_EXT_COMPANY_ON_COMPANY_LICENSE_PHOTO on CMS_EXT_COMPANY ;
alter table CMS_EXT_COMPANY add column COMPANY_LICENSE_PHOTO_ID varchar(32) ;
