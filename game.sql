-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2019 a las 19:19:58
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `game`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asset`
--

CREATE TABLE `asset` (
  `id` bigint(20) NOT NULL,
  `path` varchar(255) DEFAULT NULL,
  `symbol` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asset`
--

INSERT INTO `asset` (`id`, `path`, `symbol`) VALUES
(1, '/src/assets/tree.png', 'a'),
(2, '/src/assets/boy.png', 'b'),
(3, '/src/assets/blade.png', 'c');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `map`
--

CREATE TABLE `map` (
  `id` bigint(20) NOT NULL,
  `character_map` varchar(255) DEFAULT NULL,
  `final_map` bit(1) NOT NULL,
  `first_map` bit(1) NOT NULL,
  `id_quest` bigint(20) NOT NULL,
  `background_path` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `map`
--

INSERT INTO `map` (`id`, `character_map`, `final_map`, `first_map`, `id_quest`, `background_path`) VALUES
(1, 'aaabaaa\r\naaaaaaa\r\naaacaaa', b'0', b'1', 1, '/src/backgrounds/red'),
(2, 'aaabaaa\r\naaaaaaa\r\naaacaaa', b'0', b'0', 1, '/src/backgrounds/blu'),
(3, 'aaabaaa\r\naaaaaaa\r\naaacaaa', b'1', b'0', 1, '/src/backgrounds/red');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `map_order`
--

CREATE TABLE `map_order` (
  `id` bigint(20) NOT NULL,
  `current_order` bigint(20) NOT NULL,
  `id_next_order` bigint(20) NOT NULL,
  `id_previous_order` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `map_order`
--

INSERT INTO `map_order` (`id`, `current_order`, `id_next_order`, `id_previous_order`) VALUES
(1, 1, 2, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mechanics`
--

CREATE TABLE `mechanics` (
  `id` bigint(20) NOT NULL,
  `order_mechanics` int(11) NOT NULL,
  `score` bigint(20) NOT NULL,
  `x_possition` int(11) NOT NULL,
  `y_possition` int(11) NOT NULL,
  `id_mission` bigint(20) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `message_done` varchar(255) DEFAULT NULL,
  `message_not_done` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mechanics`
--

INSERT INTO `mechanics` (`id`, `order_mechanics`, `score`, `x_possition`, `y_possition`, `id_mission`, `message`, `message_done`, `message_not_done`) VALUES
(1, 1, 50, 2, 2, 1, 'Ohh! I found the Blade, now I must kill the dragon', 'You already got the blade must go to the Dragon and kill it', ''),
(2, 2, 100, 3, 3, 1, 'die now!', 'You alrready kill the dragon', 'You must go for a Blade');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mission`
--

CREATE TABLE `mission` (
  `id` bigint(20) NOT NULL,
  `character_map` varchar(255) DEFAULT NULL,
  `final_mission` bit(1) NOT NULL,
  `first_mission` bit(1) NOT NULL,
  `id_map` bigint(20) NOT NULL,
  `background_path` varchar(20) NOT NULL,
  `number_of_mechanics` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mission`
--

INSERT INTO `mission` (`id`, `character_map`, `final_mission`, `first_mission`, `id_map`, `background_path`, `number_of_mechanics`) VALUES
(1, 'aaabaaa\r\naaaaaaa\r\naaacaaa', b'0', b'1', 1, '/', 3),
(2, 'aaabaaa\r\naaaaaaa\r\naaacaaa', b'0', b'0', 1, '/src/backgrounds/blu', 3),
(3, 'aaabaaa\r\naaaaaaa\r\naaacaaa', b'1', b'0', 1, '/src/backgrounds/red', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mission_history`
--

CREATE TABLE `mission_history` (
  `id` bigint(20) NOT NULL,
  `mission_from` bigint(20) NOT NULL,
  `mission_to` bigint(20) NOT NULL,
  `id_user` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mission_history`
--

INSERT INTO `mission_history` (`id`, `mission_from`, `mission_to`, `id_user`) VALUES
(1, 1, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mission_order`
--

CREATE TABLE `mission_order` (
  `id` bigint(20) NOT NULL,
  `current_order` bigint(20) NOT NULL,
  `id_next_order` bigint(20) NOT NULL,
  `id_previous_order` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `quest`
--

CREATE TABLE `quest` (
  `id` bigint(20) NOT NULL,
  `chatacter_map` varchar(255) DEFAULT NULL,
  `final_quest` bit(1) NOT NULL,
  `first_quest` bit(1) NOT NULL,
  `background_path` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `quest`
--

INSERT INTO `quest` (`id`, `chatacter_map`, `final_quest`, `first_quest`, `background_path`) VALUES
(1, 'aaaabaaaa\r\naaaaaaaaa\r\naaaacaaaa', b'0', b'0', NULL),
(2, 'aaaabaaaa\r\naaaaaaaaa\r\naaaacaaaa', b'0', b'0', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `quest_order`
--

CREATE TABLE `quest_order` (
  `id` bigint(20) NOT NULL,
  `current_quest` bigint(20) NOT NULL,
  `id_next_quest` bigint(20) NOT NULL,
  `id_previous_quest` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `spent_score`
--

CREATE TABLE `spent_score` (
  `id` bigint(20) NOT NULL,
  `object_spending` varchar(255) DEFAULT NULL,
  `score` bigint(20) NOT NULL,
  `spent_score` bigint(20) NOT NULL,
  `id_user` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id_user` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id_user`, `password`, `score`, `user_name`) VALUES
(1, 'abc', '1000', 'Gabriel');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_stage`
--

CREATE TABLE `user_stage` (
  `id` bigint(20) NOT NULL,
  `id_user` bigint(20) NOT NULL,
  `id_map` bigint(20) DEFAULT NULL,
  `id_mission` bigint(20) DEFAULT NULL,
  `id_quest` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `map`
--
ALTER TABLE `map`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3q3bsdncnnpyof6fq1fwxtryq` (`id_quest`);

--
-- Indices de la tabla `map_order`
--
ALTER TABLE `map_order`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mechanics`
--
ALTER TABLE `mechanics`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKa03a1uq6go0kay11uvt7rqidq` (`id_mission`);

--
-- Indices de la tabla `mission`
--
ALTER TABLE `mission`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKaqnp595t2wxfqlnr3uu0i9ccw` (`id_map`);

--
-- Indices de la tabla `mission_history`
--
ALTER TABLE `mission_history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5w6toj2lcgdoe7ospc5vxqvb` (`id_user`);

--
-- Indices de la tabla `mission_order`
--
ALTER TABLE `mission_order`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `quest`
--
ALTER TABLE `quest`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `quest_order`
--
ALTER TABLE `quest_order`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `spent_score`
--
ALTER TABLE `spent_score`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKollpmma306wo6gd6dfvurjpq3` (`id_user`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indices de la tabla `user_stage`
--
ALTER TABLE `user_stage`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjh0rky21iry10uywd19mi349v` (`id_map`),
  ADD KEY `FKlpgtxlwix8caos4vko8eqo052` (`id_mission`),
  ADD KEY `FKi42srldhireqo7p1vbpfincx4` (`id_quest`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
