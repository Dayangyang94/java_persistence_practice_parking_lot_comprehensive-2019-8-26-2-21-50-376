CREATE TABLE  parkingBoy (
  employeeID int PRIMARY KEY,
  Name VARCHAR(64) NOT NULL,
);

CREATE TABLE parkingLot(
parkingLotID int not null primary key,
capatity int not null,
availablePositionCount int not null,
 employeeID int not null
);
ALTER TABLE parkingLot ADD CONSTRAINT FK_parkingBoy FOREIGN KEY(employeeID) REFERENCES parkingBoy(employeeID);
