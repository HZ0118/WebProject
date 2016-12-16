# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table manga (
  id                            bigint not null,
  name                          varchar(255),
  genre                         varchar(255),
  studio                        varchar(255),
  realease_year                 integer,
  rating                        double,
  constraint pk_manga primary key (id)
);
create sequence manga_seq;

create table movies (
  id                            bigint not null,
  name                          varchar(255),
  genre                         varchar(255),
  studio                        varchar(255),
  realease_year                 integer,
  rating                        double,
  constraint pk_movies primary key (id)
);
create sequence movies_seq;

create table series (
  id                            bigint not null,
  name                          varchar(255),
  genre                         varchar(255),
  studio                        varchar(255),
  realease_year                 integer,
  rating                        double,
  constraint pk_series primary key (id)
);
create sequence series_seq;


# --- !Downs

drop table if exists manga;
drop sequence if exists manga_seq;

drop table if exists movies;
drop sequence if exists movies_seq;

drop table if exists series;
drop sequence if exists series_seq;

