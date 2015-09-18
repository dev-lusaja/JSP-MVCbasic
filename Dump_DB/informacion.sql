
CREATE DATABASE informacion;

CREATE TABLE IF NOT EXISTS `perfil` (
  `id_usuario` int(6) NOT NULL,
  `nombres` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `e_mail` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


INSERT INTO `perfil` (`id_usuario`, `nombres`, `apellidos`, `e_mail`) VALUES
(1, 'oscar', 'sanchez', 'janoone52@gmail.com');

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(6) NOT NULL,
  `usuarios` varchar(20) NOT NULL,
  `passw` varchar(8) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


INSERT INTO `usuarios` (`id_usuario`, `usuarios`, `passw`) VALUES
(1, 'osanchez', '123456');

ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);