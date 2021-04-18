create table posts (
   id serial primary key,
   name varchar(2000),
   description text,
   created timestamp not null
);

create table users (
  id serial primary key,
  name text not null,
  password text not null,
  email text not null
);