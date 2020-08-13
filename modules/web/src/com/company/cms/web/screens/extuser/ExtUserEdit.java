package com.company.cms.web.screens.extuser;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.ExtUser;

@UiController("cms_ExtUser.edit")
@UiDescriptor("ext-user-edit.xml")
@EditedEntityContainer("extUserDc")
@LoadDataBeforeShow
public class ExtUserEdit extends StandardEditor<ExtUser> {
}