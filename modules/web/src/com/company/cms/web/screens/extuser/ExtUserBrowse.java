package com.company.cms.web.screens.extuser;

import com.haulmont.cuba.gui.screen.*;
import com.company.cms.entity.ExtUser;

@UiController("cms_ExtUser.browse")
@UiDescriptor("ext-user-browse.xml")
@LookupComponent("extUsersTable")
@LoadDataBeforeShow
public class ExtUserBrowse extends StandardLookup<ExtUser> {
}