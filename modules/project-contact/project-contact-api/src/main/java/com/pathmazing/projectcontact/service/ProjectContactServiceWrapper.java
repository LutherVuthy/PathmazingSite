/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pathmazing.projectcontact.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link ProjectContactService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContactService
 * @generated
 */
@ProviderType
public class ProjectContactServiceWrapper
	implements ProjectContactService, ServiceWrapper<ProjectContactService> {

	public ProjectContactServiceWrapper(
		ProjectContactService projectContactService) {

		_projectContactService = projectContactService;
	}

	@Override
	public com.pathmazing.projectcontact.model.ProjectContact create(
		String name, String email, String company, String desc, String by) {

		return _projectContactService.create(name, email, company, desc, by);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _projectContactService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.pathmazing.projectcontact.model.ProjectContact>
		getProjectContacts(int start, int end) {

		return _projectContactService.getProjectContacts(start, end);
	}

	@Override
	public ProjectContactService getWrappedService() {
		return _projectContactService;
	}

	@Override
	public void setWrappedService(ProjectContactService projectContactService) {
		_projectContactService = projectContactService;
	}

	private ProjectContactService _projectContactService;

}