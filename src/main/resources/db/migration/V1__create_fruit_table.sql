create table fruit (
    id              bigint          auto_increment primary key,
    color           varchar(30)     not null,
    fruit_name      varchar(30)     not null,
    date_created    date
)