CREATE TABLE StudentGroups(
	AcademicYearSemester varchar(5),
	Program varchar(6),
	GroupNumber int,
	SubGroupNumber int,
	GroupID varchar(20),
	SubGroupID varchar(20),
)

select * from StudentGroups

drop table 

CREATE TABLE Tags(
	TagName varchar(5),
	TagCode varchar(6),
	RelatedTag varchar(6),
	
)