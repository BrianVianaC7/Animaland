-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Servidor: sql3.freemysqlhosting.net
-- Tiempo de generación: 19-05-2022 a las 14:17:52
-- Versión del servidor: 5.5.54-0ubuntu0.12.04.1
-- Versión de PHP: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `BD_Soundland`
--
CREATE DATABASE IF NOT EXISTS `BD_Animaland` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `BD_Animaland`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DATOS_USUARIO`
--

CREATE TABLE `DATOS_USUARIO` (
  `ID_Usuario` int(11) NOT NULL,
  `Nombre_Usuario` varchar(45) NOT NULL,
  `A_Paterno_Usuario` varchar(45) NOT NULL,
  `A_Materno_Usuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `DATOS_USUARIO`
--

INSERT INTO `DATOS_USUARIO` (`ID_Usuario`, `Nombre_Usuario`, `A_Paterno_Usuario`, `A_Materno_Usuario`) VALUES
(12, 'Brian Alejandro', 'Viana', 'Clavijo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DETALLES_USUARIOS`
--

CREATE TABLE `DETALLES_USUARIOS` (
  `ID_Usuarios` int(11) NOT NULL,
  `User_Name` varchar(45) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `DETALLES_USUARIOS`
--

INSERT INTO `DETALLES_USUARIOS` (`ID_Usuarios`, `User_Name`, `Correo`, `Contraseña`) VALUES
(12, 'Brian7', 'brian.vianac@outlook.com', '123456');

-- --------------------------------------------------------

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `DATOS_USUARIO`
--
ALTER TABLE `DATOS_USUARIO`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- Indices de la tabla `DETALLES_USUARIOS`
--
ALTER TABLE `DETALLES_USUARIOS`
  ADD PRIMARY KEY (`ID_Usuarios`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `DETALLES_USUARIOS`
--
ALTER TABLE `DETALLES_USUARIOS`
  ADD CONSTRAINT `idUsuarios` FOREIGN KEY (`ID_Usuarios`) REFERENCES `DATOS_USUARIO` (`ID_Usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `PARTIDA`
--
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
