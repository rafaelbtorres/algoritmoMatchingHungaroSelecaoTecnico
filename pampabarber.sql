-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06-Out-2021 às 23:48
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pampabarber`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `id` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `preco` varchar(200) NOT NULL,
  `nomeImgHash` varchar(200) NOT NULL,
  `nomeImg` varchar(200) NOT NULL,
  `diretorio` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `descricao`, `preco`, `nomeImgHash`, `nomeImg`, `diretorio`) VALUES
(1, 'Kit Anti-Caspa', '100,00', 'dhsudiadTESTE.JPG', 'produto1.JPG', '../view/imagens/produtos/\r\n'),
(2, 'Gel de Fixação', '55,00', 'dsaudgas.jpg', 'produto2.jpg', '../view/imagens/produtos/\r\n');

-- --------------------------------------------------------

--
-- Estrutura da tabela `servicos`
--

CREATE TABLE `servicos` (
  `id` int(10) NOT NULL,
  `descricao` varchar(255) CHARACTER SET utf8 NOT NULL,
  `nomeImg` varchar(255) CHARACTER SET utf8 NOT NULL,
  `preco` int(50) NOT NULL,
  `nomeImgHash` varchar(255) NOT NULL,
  `diretorio` varchar(255) CHARACTER SET utf8 NOT NULL,
  `link` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `servicos`
--

INSERT INTO `servicos` (`id`, `descricao`, `nomeImg`, `preco`, `nomeImgHash`, `diretorio`, `link`) VALUES
(1, 'Contamos com profissionais preparados para realizar o seu corte da maneira que desejar.', 'corte.jpg', 0, 'Corte do cabelo', 'imagens/100px180/', 'https://api.whatsapp.com/send?phone=5555984618335&text=Ol%C3%A1%2C%20gostaria%20de%20receber%20mais%20informa%C3%A7%C3%B5es%20sobre%20um%20dos%20seus%20servi%C3%A7os!'),
(2, 'Está precisando dar aquela aparada na barba e deixá-la perfeita, está no lugar certo!', 'barba.jpg', 0, 'Ajuste de barba', 'imagens/100px180/', 'https://api.whatsapp.com/send?phone=5555984618335&text=Ol%C3%A1%2C%20gostaria%20de%20receber%20mais%20informa%C3%A7%C3%B5es%20sobre%20um%20dos%20seus%20servi%C3%A7os!'),
(3, 'Vai para um evento e deseja prepara aquele penteado top para marcar presença, basta escolher o penteado que deixarmos igual!', 'penteado.jpg', 0, 'Penteados personalizados', 'imagens/100px180/', 'https://api.whatsapp.com/send?phone=5555984618335&text=Ol%C3%A1%2C%20gostaria%20de%20receber%20mais%20informa%C3%A7%C3%B5es%20sobre%20um%20dos%20seus%20servi%C3%A7os!');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `senha` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `senha`) VALUES
(1, 'mardegan', 'f4708c613502c7580f8353fa567a5b53'),
(2, 'torres', 'e94301f6fc7d4c56657bfeaf7164a83e'),
(3, 'glener', 'b8c96ecf911d7e686c721e3873432fd0'),
(4, 'leo', 'b01d84237065cc309ef0508f1697f6bb');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `servicos`
--
ALTER TABLE `servicos`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
