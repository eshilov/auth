alter table users
    add column if not exists email varchar(255) not null default 'empty@empty.email';
