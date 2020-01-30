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

import com.liferay.portal.kernel.model.User;
import com.pathmazing.projectcontact.model.ProjectContact;
import com.pathmazing.projectcontact.service.base.ProjectContactLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the project contact local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.pathmazing.projectcontact.service.ProjectContactLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContactLocalServiceBaseImpl
 */
@Component(
    property = "model.class.name=com.pathmazing.projectcontact.model.ProjectContact",
    service = AopService.class
)
public class ProjectContactLocalServiceImpl
    extends ProjectContactLocalServiceBaseImpl {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>com.pathmazing.projectcontact.service.ProjectContactLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.pathmazing.projectcontact.service.ProjectContactLocalServiceUtil</code>.
     */

    public ProjectContact create(String name, String email, String clientCompany, String description, String cooperateBy) {
        ProjectContact project = projectContactLocalService.createProjectContact(counterLocalService.increment());
        project.setClientName(name);
        project.setEmail(email);
        project.setClientCompany(clientCompany);
        project.setDescription(description);
        project.setCooperateBy(cooperateBy);
        project.setCreateDate(new Date());
        project.setModifiedDate(new Date());
        this.projectContactLocalService.updateProjectContact(project);
        return project;
    }

	@Override
	public List<ProjectContact> getProjectContacts(int start, int end) {
		return super.getProjectContacts(start, end);
	}
}
