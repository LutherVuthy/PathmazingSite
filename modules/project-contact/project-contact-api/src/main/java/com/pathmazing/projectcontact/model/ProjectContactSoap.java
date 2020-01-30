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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.pathmazing.projectcontact.service.http.ProjectContactServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ProjectContactSoap implements Serializable {

	public static ProjectContactSoap toSoapModel(ProjectContact model) {
		ProjectContactSoap soapModel = new ProjectContactSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProjectContactId(model.getProjectContactId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setClientName(model.getClientName());
		soapModel.setEmail(model.getEmail());
		soapModel.setClientCompany(model.getClientCompany());
		soapModel.setDescription(model.getDescription());
		soapModel.setCooperateBy(model.getCooperateBy());

		return soapModel;
	}

	public static ProjectContactSoap[] toSoapModels(ProjectContact[] models) {
		ProjectContactSoap[] soapModels = new ProjectContactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProjectContactSoap[][] toSoapModels(
		ProjectContact[][] models) {

		ProjectContactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new ProjectContactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProjectContactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProjectContactSoap[] toSoapModels(
		List<ProjectContact> models) {

		List<ProjectContactSoap> soapModels = new ArrayList<ProjectContactSoap>(
			models.size());

		for (ProjectContact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProjectContactSoap[soapModels.size()]);
	}

	public ProjectContactSoap() {
	}

	public long getPrimaryKey() {
		return _projectContactId;
	}

	public void setPrimaryKey(long pk) {
		setProjectContactId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProjectContactId() {
		return _projectContactId;
	}

	public void setProjectContactId(long projectContactId) {
		_projectContactId = projectContactId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getClientName() {
		return _clientName;
	}

	public void setClientName(String clientName) {
		_clientName = clientName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getClientCompany() {
		return _clientCompany;
	}

	public void setClientCompany(String clientCompany) {
		_clientCompany = clientCompany;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getCooperateBy() {
		return _cooperateBy;
	}

	public void setCooperateBy(String cooperateBy) {
		_cooperateBy = cooperateBy;
	}

	private String _uuid;
	private long _projectContactId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _clientName;
	private String _email;
	private String _clientCompany;
	private String _description;
	private String _cooperateBy;

}