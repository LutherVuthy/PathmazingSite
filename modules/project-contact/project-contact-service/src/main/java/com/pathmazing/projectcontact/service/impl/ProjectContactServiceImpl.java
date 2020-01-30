/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pathmazing.projectcontact.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.pathmazing.projectcontact.model.ProjectContact;
import com.pathmazing.projectcontact.service.base.ProjectContactServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the project contact remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.pathmazing.projectcontact.service.ProjectContactService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContactServiceBaseImpl
 */
@Component(
    property = {
        "json.web.service.context.name=pathmazing",
        "json.web.service.context.path=ProjectContact",
        "auth.token.check.enabled=false"
    },
    service = AopService.class
)
public class ProjectContactServiceImpl extends ProjectContactServiceBaseImpl {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use <code>com.pathmazing.projectcontact.service.ProjectContactServiceUtil</code> to access the project contact remote service.
     */

    @AccessControlled(guestAccessEnabled = true)
    public ProjectContact create(String name, String email, String company, String desc, String by) {
        return projectContactLocalService.create(name, email, company, desc, by);
    }

    public List<ProjectContact> getProjectContacts(int start,int end) {
        return this.projectContactLocalService.getProjectContacts(start,end);
    }

}
