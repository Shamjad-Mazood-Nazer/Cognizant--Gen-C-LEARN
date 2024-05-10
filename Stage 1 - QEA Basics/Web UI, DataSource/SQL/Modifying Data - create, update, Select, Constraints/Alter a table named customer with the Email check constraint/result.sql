ALTER TABLE customer
ADD CONSTRAINT ck_email
CHECK (email LIKE '%@%.%');

Go