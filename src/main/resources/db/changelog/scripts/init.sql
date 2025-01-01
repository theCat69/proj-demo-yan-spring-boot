-- liquibase formatted sql
-- changeset demoprojyan:001.1
CREATE SEQUENCE exampletab1_id_seq;

CREATE TABLE exampletab1 (
    id bigint NOT NULL DEFAULT nextval('exampletab1_id_seq') PRIMARY KEY,
    name VARCHAR(100)
);

ALTER SEQUENCE exampletab1_id_seq
OWNED BY exampletab1.id;
-- rollback DROP TABLE exampletab1
-- rollback DROP SEQUENCE exampletab1_id_seq

-- changeset demoprojyan:001.2
insert into exampletab1
values (DEFAULT, 'hello'),
     (DEFAULT, 'boy'),
     (DEFAULT, 'how'),
     (DEFAULT, 'are'),
     (DEFAULT, 'you'),
     (DEFAULT, '?');
-- rollback DELETE from exampletab1