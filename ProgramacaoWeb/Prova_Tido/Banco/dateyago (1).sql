-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23/05/2023 às 20:50
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dateyago`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `carroyago`
--

CREATE TABLE `carroyago` (
  `idyago` int(11) NOT NULL,
  `valoryago` decimal(10,4) NOT NULL,
  `anoyago` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `carroyago`
--

INSERT INTO `carroyago` (`idyago`, `valoryago`, `anoyago`) VALUES
(9, 0.0344, 1997),
(10, 0.0239, 2002),
(11, 0.0358, 2007),
(12, 0.0464, 2012),
(13, 0.0329, 2017),
(14, 0.0227, 2022);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cestayago`
--

CREATE TABLE `cestayago` (
  `idyago` int(11) NOT NULL,
  `valoryago` decimal(10,4) NOT NULL,
  `anoyago` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cestayago`
--

INSERT INTO `cestayago` (`idyago`, `valoryago`, `anoyago`) VALUES
(5, 1.0181, 1997),
(6, 1.3857, 2002),
(7, 1.8147, 2007),
(8, 2.2273, 2012),
(9, 2.1523, 2017),
(10, 1.5922, 2022);

-- --------------------------------------------------------

--
-- Estrutura para tabela `dolaryago`
--

CREATE TABLE `dolaryago` (
  `idyago` int(11) NOT NULL,
  `valoryago` decimal(10,4) NOT NULL,
  `anoyago` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `dolaryago`
--

INSERT INTO `dolaryago` (`idyago`, `valoryago`, `anoyago`) VALUES
(3, 106.1209, 1997),
(4, 76.4590, 2002),
(5, 167.3920, 2007),
(6, 345.4404, 2012),
(7, 304.4283, 2017),
(8, 233.6115, 2022);

-- --------------------------------------------------------

--
-- Estrutura para tabela `gasolinayago`
--

CREATE TABLE `gasolinayago` (
  `idyago` int(11) NOT NULL,
  `valoryago` decimal(10,4) NOT NULL,
  `anoyago` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `gasolinayago`
--

INSERT INTO `gasolinayago` (`idyago`, `valoryago`, `anoyago`) VALUES
(3, 173.9686, 1997),
(4, 114.3655, 2002),
(5, 138.9992, 2007),
(6, 227.0072, 2012),
(7, 254.1361, 2017),
(8, 217.5942, 2022);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pibyago`
--

CREATE TABLE `pibyago` (
  `idyago` int(11) NOT NULL,
  `valoryago` decimal(10,4) NOT NULL,
  `anoyago` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pibyago`
--

INSERT INTO `pibyago` (`idyago`, `valoryago`, `anoyago`) VALUES
(5, 0.9362, 1997),
(7, 1.1772, 2002),
(8, 2.8219, 2007),
(9, 4.3877, 2012),
(10, 6.9763, 2017),
(11, 9.9000, 2022);

-- --------------------------------------------------------

--
-- Estrutura para tabela `processadoryago`
--

CREATE TABLE `processadoryago` (
  `idyago` int(11) NOT NULL,
  `valoryago` decimal(10,4) NOT NULL,
  `anoyago` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `processadoryago`
--

INSERT INTO `processadoryago` (`idyago`, `valoryago`, `anoyago`) VALUES
(8, 66.7300, 2014),
(10, 150.0000, 2023),
(11, 240.0000, 2023);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `carroyago`
--
ALTER TABLE `carroyago`
  ADD PRIMARY KEY (`idyago`);

--
-- Índices de tabela `cestayago`
--
ALTER TABLE `cestayago`
  ADD PRIMARY KEY (`idyago`);

--
-- Índices de tabela `dolaryago`
--
ALTER TABLE `dolaryago`
  ADD PRIMARY KEY (`idyago`);

--
-- Índices de tabela `gasolinayago`
--
ALTER TABLE `gasolinayago`
  ADD PRIMARY KEY (`idyago`);

--
-- Índices de tabela `pibyago`
--
ALTER TABLE `pibyago`
  ADD PRIMARY KEY (`idyago`);

--
-- Índices de tabela `processadoryago`
--
ALTER TABLE `processadoryago`
  ADD PRIMARY KEY (`idyago`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carroyago`
--
ALTER TABLE `carroyago`
  MODIFY `idyago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `cestayago`
--
ALTER TABLE `cestayago`
  MODIFY `idyago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `dolaryago`
--
ALTER TABLE `dolaryago`
  MODIFY `idyago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `gasolinayago`
--
ALTER TABLE `gasolinayago`
  MODIFY `idyago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `pibyago`
--
ALTER TABLE `pibyago`
  MODIFY `idyago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `processadoryago`
--
ALTER TABLE `processadoryago`
  MODIFY `idyago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
