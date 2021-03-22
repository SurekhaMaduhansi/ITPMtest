CREATE TABLE StudentGroups(
	StGrpID int Primary key not null,
	AcademicYrSem varchar(20) not null,
	Program varchar(20) not null,
	GroupNo int not null,
	SubGroupNo int not null,
	GroupID varchar(20) not null,
	SubGroupID varchar(20) not null,

)

CREATE TABLE Tags(
	TagID int Primary key not null,
	TagCode int not null,
	TagName varchar(20) not null,
    RelatedTag varchar(20) not null,

)

select * from StudentGroups 