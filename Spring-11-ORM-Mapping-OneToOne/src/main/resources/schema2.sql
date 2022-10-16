create table EMPLOYEES(

                         employee_id INT,
                         first_name VARCHAR(50),
                         last_name VARCHAR(50),
                         email VARCHAR(50),
                         hire_date DATE,
                         gender VARCHAR(1),
                         salary INT,
                          primary key (employee_id)
);

create table DEPARTMENTS(

                          department VARCHAR(50),
                          division VARCHAR(50),
                          primary key (department)
);
create table REGIONS(
                            region_id INT,
                            region VARCHAR(20),
                            country VARCHAR(20),
                            primary key (region_id)
);



