CREATE TABLE IF NOT EXISTS 'person' (
  'id' INT NOT NULL AUTO_INCREMENT,
  'first_name' VARCHAR(80) NOT NULL,
  'last_name' VARCHAR(80) NOT NULL,
  'address' VARCHAR(100) NOT NULL,
  'gender' CHAR(1) NOT NULL,
  PRIMARY KEY ('id')
  );