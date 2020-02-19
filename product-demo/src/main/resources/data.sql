DROP TABLE IF EXISTS PRODUCTS;

CREATE TABLE PRODUCTS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  product_description VARCHAR(250) NOT NULL,
  product_category VARCHAR(250) DEFAULT NULL
);


