-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-02-2023 a las 07:18:05
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_apolo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_usuario` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `dni` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_usuario`, `contraseña`, `nombre`, `apellido`, `dni`, `correo`, `edad`) VALUES
('ADMIN-0', 'bask3t*16', 'Maximo', 'Moreno', '07485632', 'moreno@gmail.com', 25),
('ADMIN-1', '12345', 'Mauricio', 'Hinostroza', '76511489', 'mauricio@gmail.com', 22);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `id_cliente` varchar(100) NOT NULL,
  `dni` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `desarrollo`
--

CREATE TABLE `desarrollo` (
  `tipo` varchar(100) NOT NULL,
  `id_cliente` varchar(100) NOT NULL,
  `id_venta` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `id_curso` varchar(100) NOT NULL,
  `docente` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `desarrollo`
--

INSERT INTO `desarrollo` (`tipo`, `id_cliente`, `id_venta`, `precio`, `id_curso`, `docente`) VALUES
('FRONT END', 'CLI-0', 'VENT-0', 600, 'FRONT-0', 'Lizardo Silva');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `id_docente` varchar(100) NOT NULL,
  `especialidad` varchar(100) NOT NULL,
  `tipo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`nombre`, `apellido`, `id_docente`, `especialidad`, `tipo`) VALUES
('Lizardo', 'Silva', 'DOC-0', 'Programacion', 'JAVA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programacion`
--

CREATE TABLE `programacion` (
  `tipo` varchar(100) NOT NULL,
  `id_cliente` varchar(100) NOT NULL,
  `id_venta` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `id_curso` varchar(100) NOT NULL,
  `docente` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `dni` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `contraseña`, `nombre`, `apellido`, `dni`, `correo`, `edad`) VALUES
('USER-0', '12345', 'Roy', 'Campos', '76511488', 'delgado@gmail.com', 25);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `desarrollo`
--
ALTER TABLE `desarrollo`
  ADD PRIMARY KEY (`id_venta`),
  ADD UNIQUE KEY `id_cliente` (`id_cliente`),
  ADD UNIQUE KEY `id_curso` (`id_curso`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indices de la tabla `programacion`
--
ALTER TABLE `programacion`
  ADD PRIMARY KEY (`id_venta`),
  ADD UNIQUE KEY `id_cliente` (`id_cliente`),
  ADD UNIQUE KEY `id_curso` (`id_curso`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
