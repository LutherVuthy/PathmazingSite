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

package com.pathmazing.projectcontact.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link ProjectContact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectContact
 * @generated
 */
@ProviderType
public class ProjectContactWrapper
	extends BaseModelWrapper<ProjectContact>
	implements ProjectContact, ModelWrapper<ProjectContact> {

	public ProjectContactWrapper(ProjectContact projectContact) {
		super(projectContact);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("projectContactId", getProjectContactId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("clientName", getClientName());
		attributes.put("email", getEmail());
		attributes.put("clientCompany", getClientCompany());
		attributes.put("description", getDescription());
		attributes.put("cooperateBy", getCooperateBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long projectContactId = (Long)attributes.get("projectContactId");

		if (projectContactId != null) {
			setProjectContactId(projectContactId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String clientName = (String)attributes.get("clientName");

		if (clientName != null) {
			setClientName(clientName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String clientCompany = (String)attributes.get("clientCompany");

		if (clientCompany != null) {
			setClientCompany(clientCompany);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String cooperateBy = (String)attributes.get("cooperateBy");

		if (cooperateBy != null) {
			setCooperateBy(cooperateBy);
		}
	}

	/**
	 * Returns the client company of this project contact.
	 *
	 * @return the client company of this project contact
	 */
	@Override
	public String getClientCompany() {
		return model.getClientCompany();
	}

	/**
	 * Returns the client name of this project contact.
	 *
	 * @return the client name of this project contact
	 */
	@Override
	public String getClientName() {
		return model.getClientName();
	}

	/**
	 * Returns the cooperate by of this project contact.
	 *
	 * @return the cooperate by of this project contact
	 */
	@Override
	public String getCooperateBy() {
		return model.getCooperateBy();
	}

	/**
	 * Returns the create date of this project contact.
	 *
	 * @return the create date of this project contact
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this project contact.
	 *
	 * @return the description of this project contact
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the email of this project contact.
	 *
	 * @return the email of this project contact
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the modified date of this project contact.
	 *
	 * @return the modified date of this project contact
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this project contact.
	 *
	 * @return the primary key of this project contact
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project contact ID of this project contact.
	 *
	 * @return the project contact ID of this project contact
	 */
	@Override
	public long getProjectContactId() {
		return model.getProjectContactId();
	}

	/**
	 * Returns the uuid of this project contact.
	 *
	 * @return the uuid of this project contact
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the client company of this project contact.
	 *
	 * @param clientCompany the client company of this project contact
	 */
	@Override
	public void setClientCompany(String clientCompany) {
		model.setClientCompany(clientCompany);
	}

	/**
	 * Sets the client name of this project contact.
	 *
	 * @param clientName the client name of this project contact
	 */
	@Override
	public void setClientName(String clientName) {
		model.setClientName(clientName);
	}

	/**
	 * Sets the cooperate by of this project contact.
	 *
	 * @param cooperateBy the cooperate by of this project contact
	 */
	@Override
	public void setCooperateBy(String cooperateBy) {
		model.setCooperateBy(cooperateBy);
	}

	/**
	 * Sets the create date of this project contact.
	 *
	 * @param createDate the create date of this project contact
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this project contact.
	 *
	 * @param description the description of this project contact
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the email of this project contact.
	 *
	 * @param email the email of this project contact
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the modified date of this project contact.
	 *
	 * @param modifiedDate the modified date of this project contact
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this project contact.
	 *
	 * @param primaryKey the primary key of this project contact
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project contact ID of this project contact.
	 *
	 * @param projectContactId the project contact ID of this project contact
	 */
	@Override
	public void setProjectContactId(long projectContactId) {
		model.setProjectContactId(projectContactId);
	}

	/**
	 * Sets the uuid of this project contact.
	 *
	 * @param uuid the uuid of this project contact
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ProjectContactWrapper wrap(ProjectContact projectContact) {
		return new ProjectContactWrapper(projectContact);
	}

}