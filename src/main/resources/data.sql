--Categories
INSERT INTO categories (name, box_id, description, status) VALUES ('Higiene', 12, "Higiene", true);
INSERT INTO categories (name, father_category, box_id, description, status) VALUES ('Higiene bucal', 'Higiene', 10, "Higiene bucal", true);

--Suppliers
INSERT INTO suppliers (name, short_name, phone_number, address, box_id, description, status)
    VALUES ('Grupo Bimbo, S.A.B. DE C.V', 'bimbo', '5546785900', 'Avenida Carretera A Santiago Tepalcatlalpan 161, 16200 Xochimilco, CDMX', 12, "Pan bimbo", true);


