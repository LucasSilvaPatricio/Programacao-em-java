-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12-Mar-2023 às 03:31
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pdv`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`id`, `nome`, `usuario`, `senha`) VALUES
(1, 'ADM', 'admin', 'toor');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE `contato` (
  `id` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL,
  `tel` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `contato`
--

INSERT INTO `contato` (`id`, `id_pessoa`, `tel`) VALUES
(15, 8, '(88) 9 8888-8888'),
(16, 8, '(88) 9 8888-8888'),
(17, 9, '(88) 9 8888-8888'),
(18, 9, '(88) 9 8888-8888'),
(19, 10, '(88) 9 8888-8888'),
(20, 10, '(88) 9 8888-8888'),
(21, 11, '11111111'),
(22, 11, '111111111'),
(23, 12, '3434343'),
(24, 12, '333333'),
(25, 13, '6578876867'),
(26, 13, '35345345345'),
(27, 14, '213213'),
(28, 14, '12312312');

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `id` int(11) NOT NULL,
  `id_pessoa` int(11) DEFAULT NULL,
  `cep` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `bairro` varchar(150) NOT NULL,
  `rua` varchar(150) NOT NULL,
  `numero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`id`, `id_pessoa`, `cep`, `estado`, `cidade`, `bairro`, `rua`, `numero`) VALUES
(4, 8, '11111', 'CEARA', 'IGUATU', 'Jardim Oasis', 'Jorge L. de Araujo', 0),
(5, 9, '11111', 'PARAIBA', 'PB', 'AAA', 'BBB', 111),
(6, 10, '11111', 'PARAIBA', 'PB', 'AAA', 'BBB', 111),
(7, 11, '111111', 'maranh?o', 'cidade um', 'bairro fornecedor 1', 'rua do fornecedor 1', 111),
(8, 12, '111111', 'Rio Janeiro', 'teste', 'teste', 'teste', 333),
(9, 13, '234435', 'CEARA', 'iguatu', 'jardim oasis', 'rua F', 122),
(10, 14, '123123', 'CEARA', 'Fortaleza', 'Bairro Fortaleza', 'Rua de Fortaleza', 122);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `email` varchar(200) NOT NULL,
  `identificador` varchar(100) NOT NULL,
  `tipo_de_pessoa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `nome`, `email`, `identificador`, `tipo_de_pessoa`) VALUES
(8, 'Lucas Silva', 'lucassilva@gmail.com', '78978978999', 0),
(9, 'Julia Vitoria', 'juliavitoria@gmail.com', '34534534578', 0),
(10, 'User', 'juliavitoria@gmail.com', '34534534578', 0),
(11, 'Fornecedor1', 'fornecedor1@gmail.com', '222222222', 1),
(12, 'Fornecedor RJ', 'fornecedorrj@gmail.com', '4444444', 1),
(13, 'Henrique', 'henrique@gmail.com', '78978978999', 1),
(14, 'Distribuidora LTDA', 'distribuidoraltda@gmail.com', '23434324', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id` int(11) NOT NULL,
  `imei` varchar(20) NOT NULL,
  `cor` varchar(20) NOT NULL,
  `armazenamento` int(11) NOT NULL,
  `ram` int(11) NOT NULL,
  `valor_unitario` double NOT NULL,
  `data_cadastro` date NOT NULL DEFAULT current_timestamp(),
  `modelo` varchar(100) NOT NULL,
  `fornecedor` varchar(200) NOT NULL,
  `codigo_barras` varchar(150) NOT NULL,
  `valor_revenda` double NOT NULL,
  `quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `imei`, `cor`, `armazenamento`, `ram`, `valor_unitario`, `data_cadastro`, `modelo`, `fornecedor`, `codigo_barras`, `valor_revenda`, `quantidade`) VALUES
(1, '111111', 'preto', 64, 6, 1000, '2023-03-05', 'nokia', 'Item 2', '121212121', 1250, 0),
(2, '44444', 'branco', 128, 6, 2000, '2023-03-05', 'galaxy', 'Item 4', '44333443', 2300, 0),
(3, '213124', 'preto', 16, 2, 500, '2023-03-05', 'j1 mini', 'Item 2', '111111', 600, 50),
(4, '7774', 'verde', 512, 8, 5000, '2023-03-06', 'iphone 14', 'Fornecedor RJ', '474747', 6000, 10),
(5, '45645645', 'rosa', 66, 3, 6.5, '2023-03-08', 'Iphone shopee', 'Henrique', '234234234', 7000, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `contato`
--
ALTER TABLE `contato`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `contato`
--
ALTER TABLE `contato`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de tabela `endereco`
--
ALTER TABLE `endereco`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
