create table customers
(
    id             serial not null,
    surname        varchar(255) not null,
    name           varchar(255) not null,
    age            integer      not null,
    city_of_living varchar(255),
    phone_number   varchar(255),
    primary key (id)
);