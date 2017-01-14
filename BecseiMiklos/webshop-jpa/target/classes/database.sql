-- Creating a new schema for the Webshop example app.
CREATE SCHEMA IF NOT EXISTS webshop;

-- Set the active schema so subsequent statements won't have to specify it.
SET SCHEMA 'webshop';

TRUNCATE TABLE shoporder, orderentry, customer, product;

CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    email VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(60) NOT NULL,
    description VARCHAR,
    url VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS shoporder (
    id SERIAL PRIMARY KEY,
    order_date DATE NOT NULL,
    customer_id INTEGER REFERENCES customer(id)
);

CREATE TABLE IF NOT EXISTS orderentry (
    id SERIAL PRIMARY KEY,
    order_id INTEGER REFERENCES shoporder(id),
    product_id INTEGER REFERENCES product(id),
    quantity NUMERIC
);

INSERT INTO product VALUES (1, 'Test Product 1', 'This is some test product.', 'http://funkyshop.com/test1');
INSERT INTO product VALUES (2, 'Test Product 2', 'This is some another test product.', 'http://funkyshop.com/test2');


