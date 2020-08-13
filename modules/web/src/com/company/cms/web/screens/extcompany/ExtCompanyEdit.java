package com.company.cms.web.screens.extcompany;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.ExtCompany;

@UiController("cms_ExtCompany.edit")
@UiDescriptor("ext-company-edit.xml")
@EditedEntityContainer("extCompanyDc")
@LoadDataBeforeShow
public class ExtCompanyEdit extends StandardEditor<ExtCompany> {
}