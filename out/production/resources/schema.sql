CREATE TABLE  parkingBoy (
  parkingId int not null primary key,
  name VARCHAR(64) NOT NULL,
);

CREATE TABLE parkingLot(
parkingLotID int not null primary key,
capatity int not null,
availablePositionCount int not null,
 parkingId int not null
);
