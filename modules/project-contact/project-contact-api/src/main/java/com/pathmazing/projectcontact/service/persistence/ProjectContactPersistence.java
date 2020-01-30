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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.pathmazing.projectcontact.exception.NoSuchProjectContactException;
import com.pathmazing.projectcontact.model.ProjectContact;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the project contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContactUtil
 * @generated
 */
@ProviderType
public interface ProjectContactPersistence
	extends BasePersistence<ProjectContact> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProjectContactUtil} to access the project contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the project contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching project contacts
	 */
	public java.util.List<ProjectContact> findByUuid(String uuid);

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
	public java.util.List<ProjectContact> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ProjectContact> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProjectContact> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<ProjectContact> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProjectContact> orderByComparator);

	/**
	 * Returns the first project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project contact
	 * @throws NoSuchProjectContactException if a matching project contact could not be found
	 */
	public ProjectContact findByUuid_First(
			String uuid, OrderByComparator<ProjectContact> orderByComparator)
		throws NoSuchProjectContactException;

	/**
	 * Returns the first project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching project contact, or <code>null</code> if a matching project contact could not be found
	 */
	public ProjectContact fetchByUuid_First(
		String uuid, OrderByComparator<ProjectContact> orderByComparator);

	/**
	 * Returns the last project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project contact
	 * @throws NoSuchProjectContactException if a matching project contact could not be found
	 */
	public ProjectContact findByUuid_Last(
			String uuid, OrderByComparator<ProjectContact> orderByComparator)
		throws NoSuchProjectContactException;

	/**
	 * Returns the last project contact in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching project contact, or <code>null</code> if a matching project contact could not be found
	 */
	public ProjectContact fetchByUuid_Last(
		String uuid, OrderByComparator<ProjectContact> orderByComparator);

	/**
	 * Returns the project contacts before and after the current project contact in the ordered set where uuid = &#63;.
	 *
	 * @param projectContactId the primary key of the current project contact
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next project contact
	 * @throws NoSuchProjectContactException if a project contact with the primary key could not be found
	 */
	public ProjectContact[] findByUuid_PrevAndNext(
			long projectContactId, String uuid,
			OrderByComparator<ProjectContact> orderByComparator)
		throws NoSuchProjectContactException;

	/**
	 * Removes all the project contacts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of project contacts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching project contacts
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the project contact in the entity cache if it is enabled.
	 *
	 * @param projectContact the project contact
	 */
	public void cacheResult(ProjectContact projectContact);

	/**
	 * Caches the project contacts in the entity cache if it is enabled.
	 *
	 * @param projectContacts the project contacts
	 */
	public void cacheResult(java.util.List<ProjectContact> projectContacts);

	/**
	 * Creates a new project contact with the primary key. Does not add the project contact to the database.
	 *
	 * @param projectContactId the primary key for the new project contact
	 * @return the new project contact
	 */
	public ProjectContact create(long projectContactId);

	/**
	 * Removes the project contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectContactId the primary key of the project contact
	 * @return the project contact that was removed
	 * @throws NoSuchProjectContactException if a project contact with the primary key could not be found
	 */
	public ProjectContact remove(long projectContactId)
		throws NoSuchProjectContactException;

	public ProjectContact updateImpl(ProjectContact projectContact);

	/**
	 * Returns the project contact with the primary key or throws a <code>NoSuchProjectContactException</code> if it could not be found.
	 *
	 * @param projectContactId the primary key of the project contact
	 * @return the project contact
	 * @throws NoSuchProjectContactException if a project contact with the primary key could not be found
	 */
	public ProjectContact findByPrimaryKey(long projectContactId)
		throws NoSuchProjectContactException;

	/**
	 * Returns the project contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectContactId the primary key of the project contact
	 * @return the project contact, or <code>null</code> if a project contact with the primary key could not be found
	 */
	public ProjectContact fetchByPrimaryKey(long projectContactId);

	/**
	 * Returns all the project contacts.
	 *
	 * @return the project contacts
	 */
	public java.util.List<ProjectContact> findAll();

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
	public java.util.List<ProjectContact> findAll(int start, int end);

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
	public java.util.List<ProjectContact> findAll(
		int start, int end, OrderByComparator<ProjectContact> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<ProjectContact> findAll(
		int start, int end,
		OrderByComparator<ProjectContact> orderByComparator);

	/**
	 * Removes all the project contacts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of project contacts.
	 *
	 * @return the number of project contacts
	 */
	public int countAll();

}