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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for ProjectContact. This utility wraps
 * <code>com.pathmazing.projectcontact.service.impl.ProjectContactServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContactService
 * @generated
 */
@ProviderType
public class ProjectContactServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.pathmazing.projectcontact.service.impl.ProjectContactServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.pathmazing.projectcontact.model.ProjectContact create(
		String name, String email, String company, String desc, String by) {

		return getService().create(name, email, company, desc, by);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List
		<com.pathmazing.projectcontact.model.ProjectContact> getProjectContacts(
			int start, int end) {

		return getService().getProjectContacts(start, end);
	}

	public static ProjectContactService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjectContactService, ProjectContactService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProjectContactService.class);

		ServiceTracker<ProjectContactService, ProjectContactService>
			serviceTracker =
				new ServiceTracker
					<ProjectContactService, ProjectContactService>(
						bundle.getBundleContext(), ProjectContactService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}