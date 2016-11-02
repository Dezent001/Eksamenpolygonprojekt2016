CREATE DATABASE IF NOT EXISTS polygon;
USE polygon;


Drop table if exists report;
Drop table if exists building;
Drop table if exists users;
Drop table if exists zip;


create Table zip (
zipcodes int(10),
city varchar(255),
primary key (zipcodes)
);

create Table users (
buildingID int(100),
userID int(100),
zipID int(100),
usertype int(1),
firmName varchar(255),
ContactFirstName varchar (255),
ContactLastName varchar (255),
telefon varchar(15),
mail varchar(255),
cvr int(10),
gade varchar(255),
primary key (userID),
foreign key (zipID) references zip(zipcodes)
);

create Table building (
userID int(100),
buildingID int(100),
zipID int(100),
street varchar(255),
m2 int(10),
floors int(10),
floorplan blob,
primary key (buildingID),
foreign key (userID) references users(userID),
foreign key (zipID) references zip(zipcodes)
);

create Table report (
reportID int ,
buildingID int(100),
zipID int(100),
dato varchar(255),
pic blob,
kommentar varchar(500),
skadestype varchar(255),
skadesomfang int(10),
skadeslokalition varchar(255),
floor varchar(10),
udført int(1),
primary key (reportID),
foreign key (buildingID) references building(buildingID),
foreign key (zipID) references zip(zipcodes)
);

