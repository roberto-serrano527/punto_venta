--Categories
INSERT INTO categories (name, description, status)
    VALUES ('Higiene', "Higiene", true);

INSERT INTO categories (name, father_category, description, status)
    VALUES ('Higiene bucal', 'Higiene', "Higiene bucal", true);

--Suppliers
INSERT INTO suppliers (name, short_name, phone_number, address, description, status)
    VALUES ('Grupo Bimbo, S.A.B. DE C.V', 'bimbo', '5546785900', 'Avenida Carretera A Santiago Tepalcatlalpan 161, 16200 Xochimilco, CDMX', "Pan bimbo", true);

--Brands
INSERT INTO brands (name, short_name, description, status)
    VALUES ('Bimbo', 'Bimbo', 'Pan bimbo', true);

--Boxes
INSERT INTO boxes (name, description, status)
    VALUES ('CAJA 1', 'caja de la entrada', true);

--Units
INSERT INTO units (name, description, status)
    VALUES ('Piezas', 'Venta de productos por piezas', true);
INSERT INTO units (name, description, status)
    VALUES ('Kilos', 'Venta de productos a granel', true);

--Taxes
INSERT INTO taxes (name, tax_rate, description, status)
    VALUES ('IVA', 16, 'Porcentaje de impuestos', true);


