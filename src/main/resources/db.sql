CREATE SCHEMA weblibrary DEFAULT CHARACTER SET utf8;
use weblibrary;

CREATE TABLE addresses (
    id int not null auto_increment
    , state varchar(100) not null
    , city varchar(100) not null
    , street varchar(100) not null
    , house_number int not null
    , apartment_complex int
    , flat_number int
    , constraint PK_ADDRESSES primary key (id)
);

create table passports (
    id varchar(14) not null
    , passport_number varchar(9) not null
    , type varchar(1)
    , code_of_issuing_state varchar(3)
    , authority varchar(200)
    , nationality varchar(100)
    , place_of_birth varchar(100)
    , date_of_issue date
    , date_of_expiry date
    , constraint unique UN_PASSPORTS (id)
    , constraint PK_PASSPORTS primary key (id)
);

create table persons (
    id int not null auto_increment
    , first_name varchar(100) not null
    , last_name varchar(100) not null
    , middle_name varchar(100)
    , birth_date date
    , phone_number int
    , email varchar(100)
    , address_id int
    , passport_id varchar(14) not null
    , constraint FK_ADDRESS_ID_PERSONS foreign key (address_id) references addresses (id) on delete cascade
    , constraint FK_PASSPORT_ID_PERSONS foreign key (passport_id) references passports (id) on delete cascade
    , constraint PK_PERSONS primary key (id)
);

create table authors (
    id int not null auto_increment
    , person_id int not null
    , constraint FK_AUTHORS foreign key (person_id) references persons (id) on delete cascade
    , constraint PK_AUTHORS primary key (id)
);

create table libraries (
    id int not null auto_increment
    , name varchar(100) not null
    , constraint PK_AUTHORS primary key (id)
);

create table books (
    isbn int not null
    , lbc int
    , udc int
    , name varchar(200)
    , publisher varchar(200)
    , publish_date date
    , page_amount int
    , author_id int not null
    , library_id int not null
    , constraint FK_AUTHOR_ID_BOOKS foreign key (author_id) references authors (id) on delete cascade
    , constraint FK_LIBRARY_ID_BOOKS foreign key (library_id) references libraries (id) on delete cascade
    , constraint PK_BOOKS primary key (isbn)
);

create table librarians (
    id int not null auto_increment
    , library_id int not null
    , person_id int not null
    , constraint FK_LIBRARY_ID_LIBRARIES foreign key (library_id) references libraries (id) on delete cascade
    , constraint FK_PERSON_ID_LIBRARIES foreign key (person_id) references persons (id) on delete cascade
    , constraint PK_LIBRARIES primary key (id)
);

create table readers (
    id int not null
    , library_id int not null
    , person_id int not null
    , constraint FK_LIBRARY_ID_READERS foreign key (library_id) references libraries (id) on delete cascade
    , constraint FK_PERSON_ID_READERS foreign key (person_id) references persons (id) on delete cascade
    , constraint PK_READERS primary key (id)
);

create table histories (
    id int not null
    , reader_id int not null
    , book_isbn int not null
    , is_book_come_back bit(1) not null
    , constraint FK_READER_ID_HISTORIES foreign key (reader_id) references readers (id) on delete cascade
    , constraint FK_BOOK_ID_HISTORIES foreign key (book_isbn) references books (isbn) on delete cascade
    , constraint PK_HISTORIES primary key (id)
);