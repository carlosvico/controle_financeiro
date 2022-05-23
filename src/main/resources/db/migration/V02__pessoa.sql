CREATE TABLE pessoa(
     id SERIAL PRIMARY KEY,
     nome VARCHAR(20) NOT NULL,
     ativo BOOLEAN NOT NULL,
     logradouro VARCHAR(50) NOT NULL,
     numero VARCHAR(10) NOT NULL,
     complemento VARCHAR(50) NOT NULL,
     bairro VARCHAR(50) NOT NULL,
     cep VARCHAR(50) NOT NULL,
     cidade VARCHAR(50) NOT NULL,
     estado VARCHAR(50) NOT NULL
);

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Mario Henrique', false, 'Rua Albuquerque', 36, 'Cs1', 'Jd. Oliva', '0156-456', 'Olinda', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Antonia Maria', true, 'Rua Iporã', 222, 'Casa Verde', 'Jd. Guilherme', '0235-454', 'Poá', 'Rio de Janeiro');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Arthur Silva', false, 'Rua Marcondez', 7, 'Apt 10', 'Jd. Agreste', '0557-480', 'Nobal', 'Para');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Bruno Silva', false, 'Rua Marcondez', 356, 'Cs3', 'Jd. Bom Menino', '0156-016', 'Jundiaí', 'Acre');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Marcelo Vendramini', false, 'Rua Marcondez', 775, 'Apt 23', 'Av. Olavo', '0156-456', 'Imperial', 'Fortaleza');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Pedro Pontel', false, 'Rua Marcondez', 9, 'Apt 3', 'Jd. Pontapora', '0856-460', 'Cruz Grande', 'Tocantins');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Carol Scallot', false, 'Rua Vicente ', 98, 'Apt 23', 'Vila Rochenbauth', '0656-456', 'Campinas', 'São Paulo');
