create table if not exists users
(
    id            uuid default gen_random_uuid() primary key,
    first_name    varchar(255) not null,
    last_name     varchar(255) not null,
    password_hash varchar(255) not null
);