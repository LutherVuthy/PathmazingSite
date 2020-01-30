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

package com.pathmazing.projectcontact.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.pathmazing.projectcontact.model.ProjectContact;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the project contact service. This utility wraps <code>com.pathmazing.projectcontact.service.persistence.impl.ProjectContactPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContactPersistence
 * @generated
 */
@ProviderType
public class ProjectContactUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ProjectContact projectContact) {
		getPersistence().clearCache(projectContact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ProjectContact> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProjectContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProjectContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProjectContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProjectContact> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProjectContact update(ProjectContact projectContact) {
		return getPersistence().update(projectContact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProjectContact update(
		ProjectContact projectContact, ServiceContext serviceContext) {

		return getPersistence().update(projectContact, serviceContext);
	}

	/**
	 * Returns all the project contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching project contacts
	 */
	public static List<ProjectContact> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the project contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ProjectContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of project contacts
	 * @param end the upper bound of the range of project contacts (not inclusive)
	 * @return the range of matching project contacts
	 */
	public static List<ProjectContact> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the project contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ProjectContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of project contacts
	 * @param end the upper bound of the range of project contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching project contacts
	 */
	@Deprecated
	public static List<ProjectContact> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProjectContact> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the project contacts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ProjectContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of project contacts
	 * @param end the upper bound of the range of project contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching project contacts
	 */
	public static List<ProjectContact> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProjectContact> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project contact
	 * @throws NoSuchProjectContactException if a matching project contact could not be found
	 */
	public static ProjectContact findByUuid_First(
			String uuid, OrderByComparator<ProjectContact> orderByComparator)
		throws com.pathmazing.projectcontact.exception.
			NoSuchProjectContactException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project contact, or <code>null</code> if a matching project contact could not be found
	 */
	public static ProjectContact fetchByUuid_First(
		String uuid, OrderByComparator<ProjectContact> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project contact
	 * @throws NoSuchProjectContactException if a matching project contact could not be found
	 */
	public static ProjectContact findByUuid_Last(
			String uuid, OrderByComparator<ProjectContact> orderByComparator)
		throws com.pathmazing.projectcontact.exception.
			NoSuchProjectContactException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project contact, or <code>null</code> if a matching project contact could not be found
	 */
	public static ProjectContact fetchByUuid_Last(
		String uuid, OrderByComparator<ProjectContact> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the project contacts before and after the current project contact in the ordered set where uuid = &#63;.
	 *
	 * @param projectContactId the primary key of the current project contact
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next project contact
	 * @throws NoSuchProjectContactException if a project contact with the primary key could not be found
	 */
	public static ProjectContact[] findByUuid_PrevAndNext(
			long projectContactId, String uuid,
			OrderByComparator<ProjectContact> orderByComparator)
		throws com.pathmazing.projectcontact.exception.
			NoSuchProjectContactException {

		return getPersistence().findByUuid_PrevAndNext(
			projectContactId, uuid, orderByComparator);
	}

	/**
	 * Removes all the project contacts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of project contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching project contacts
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the project contact in the entity cache if it is enabled.
	 *
	 * @param projectContact the project contact
	 */
	public static void cacheResult(ProjectContact projectContact) {
		getPersistence().cacheResult(projectContact);
	}

	/**
	 * Caches the project contacts in the entity cache if it is enabled.
	 *
	 * @param projectContacts the project contacts
	 */
	public static void cacheResult(List<ProjectContact> projectContacts) {
		getPersistence().cacheResult(projectContacts);
	}

	/**
	 * Creates a new project contact with the primary key. Does not add the project contact to the database.
	 *
	 * @param projectContactId the primary key for the new project contact
	 * @return the new project contact
	 */
	public static ProjectContact create(long projectContactId) {
		return getPersistence().create(projectContactId);
	}

	/**
	 * Removes the project contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectContactId the primary key of the project contact
	 * @return the project contact that was removed
	 * @throws NoSuchProjectContactException if a project contact with the primary key could not be found
	 */
	public static ProjectContact remove(long projectContactId)
		throws com.pathmazing.projectcontact.exception.
			NoSuchProjectContactException {

		return getPersistence().remove(projectContactId);
	}

	public static ProjectContact updateImpl(ProjectContact projectContact) {
		return getPersistence().updateImpl(projectContact);
	}

	/**
	 * Returns the project contact with the primary key or throws a <code>NoSuchProjectContactException</code> if it could not be found.
	 *
	 * @param projectContactId the primary key of the project contact
	 * @return the project contact
	 * @throws NoSuchProjectContactException if a project contact with the primary key could not be found
	 */
	public static ProjectContact findByPrimaryKey(long projectContactId)
		throws com.pathmazing.projectcontact.exception.
			NoSuchProjectContactException {

		return getPersistence().findByPrimaryKey(projectContactId);
	}

	/**
	 * Returns the project contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectContactId the primary key of the project contact
	 * @return the project contact, or <code>null</code> if a project contact with the primary key could not be found
	 */
	public static ProjectContact fetchByPrimaryKey(long projectContactId) {
		return getPersistence().fetchByPrimaryKey(projectContactId);
	}

	/**
	 * Returns all the project contacts.
	 *
	 * @return the project contacts
	 */
	public static List<ProjectContact> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the project contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ProjectContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of project contacts
	 * @param end the upper bound of the range of project contacts (not inclusive)
	 * @return the range of project contacts
	 */
	public static List<ProjectContact> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the project contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ProjectContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of project contacts
	 * @param end the upper bound of the range of project contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of project contacts
	 */
	@Deprecated
	public static List<ProjectContact> findAll(
		int start, int end, OrderByComparator<ProjectContact> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the project contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ProjectContactModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of project contacts
	 * @param end the upper bound of the range of project contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of project contacts
	 */
	public static List<ProjectContact> findAll(
		int start, int end,
		OrderByComparator<ProjectContact> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the project contacts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of project contacts.
	 *
	 * @return the number of project contacts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProjectContactPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ProjectContactPersistence, ProjectContactPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ProjectContactPersistence.class);

		ServiceTracker<ProjectContactPersistence, ProjectContactPersistence>
			serviceTracker =
				new ServiceTracker
					<ProjectContactPersistence, ProjectContactPersistence>(
						bundle.getBundleContext(),
						ProjectContactPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}