create table Pathmazing_ProjectContact (
	uuid_ VARCHAR(75) null,
	projectContactId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	clientName VARCHAR(75) null,
	email VARCHAR(75) null,
	clientCompany VARCHAR(75) null,
	description VARCHAR(75) null,
	cooperateBy VARCHAR(75) null
);