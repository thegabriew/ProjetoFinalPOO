use ACADEMIA;

CREATE TABLE academia (
	cnpj VARCHAR(20) PRIMARY KEY NOT NULL,
    uf varchar(2) NOT NULL,
    nome varchar(90) NOT NULL,
    teleforne varchar(20),
    email varchar(90)
);

CREATE TABLE funcionario (
    idFuncionario INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL,
    nome VARCHAR(90) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    salario DOUBLE NOT NULL,
    email VARCHAR(90),
    telefone VARCHAR(20),
    dataNascimento DATE NOT NULL, 
    dataContratacao DATE NOT NULL
);

CREATE TABLE aluno (
    idAluno INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(90) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(50),
    dataNascimento DATE NOT NULL
);

CREATE TABLE equipamento (
    idEquipamento INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(90) NOT NULL,
    descricao VARCHAR(200),
    tipo VARCHAR(80),
    dataCompra DATE
);