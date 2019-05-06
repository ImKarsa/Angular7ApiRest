insert into regiones (nombre) values ("Europa");
insert into regiones (nombre) values ("America");
insert into regiones (nombre) values ("Asia");
insert into regiones (nombre) values ("Africa");
insert into regiones (nombre) values ("Oceania");

insert into cliente (region_id, nombre, apellido, email, create_at) values(1, "Ruben", "Fernandez","mail1@mail.com","2019-01-05");
insert into cliente (region_id, nombre, apellido, email, create_at) values(2, "Anton", "Reino","mail2@mail.com","2019-01-05");
insert into cliente (region_id, nombre, apellido, email, create_at) values(3, "Borja", "Blanco","mail3@mail.com","2019-01-05");
insert into cliente (region_id, nombre, apellido, email, create_at) values(5, "Arturo", "Gomez","mail4@mail.com","2019-01-05");
insert into cliente (region_id, nombre, apellido, email, create_at) values(2, "Pablo", "Marmol","mail5@mail.com","2019-01-05");

insert into usuarios (username, password, enabled, nombre, apellido, email) values ("andres", "$2a$10$EK65A8zD0Vn4VKgZSCJgSeNIuTWrRM.TI2YZIx/UxTivgxGRrFYJm", 1,"Andres","Guzman","mail1@mail.com");
insert into usuarios (username, password, enabled, nombre, apellido, email) values ("admin", "$2a$10$EK65A8zD0Vn4VKgZSCJgSeNIuTWrRM.TI2YZIx/UxTivgxGRrFYJm", 1,"john","Doe","mail2@mail.com");

insert into roles (nombre) values ("ROLE_USER");
insert into roles (nombre) values ("ROLE_ADMIN");

insert into usuarios_roles (usuario_id, roles_id) values (1,1);
insert into usuarios_roles (usuario_id, roles_id) values (2,2);
insert into usuarios_roles (usuario_id, roles_id) values (2,1); 
