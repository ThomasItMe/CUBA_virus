package com.company.cms.web.screens.extcompany;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.ExtCompany;

@UiController("cms_ExtCompany.browse")
@UiDescriptor("ext-company-browse.xml")
@LookupComponent("extCompaniesTable")
@LoadDataBeforeShow
public class ExtCompanyBrowse extends StandardLookup<ExtCompany> {
}