----------------------------------
-- Insertando datos en la tabla `clientes` (12 registros)
-- --------------------------------------------------------
INSERT INTO `clientes` (`apellidos`, `email`, `nombre`, `password`, `telefono`) VALUES
('García', 'juan.garcia@email.com', 'Juan', 'pass123', '600111222'),
('Rodríguez', 'maria.rod@email.com', 'María', 'claveSecreta', '611222333'),
('Pérez', 'pedro.perez@email.com', 'Pedro', 'micontra', '622333444'),
('López', 'ana.lopez@email.com', 'Ana', 'anaPass2025', '633444555'),
('Martínez', 'luis.martinez@email.com', 'Luis', 'luisito1','644555666'),
('Sánchez', 'carmen.sanchez@email.com', 'Carmen', 'carmenPass', '655666777'),
('Gómez', 'jose.gomez@email.com', 'José', 'jose1234', '666777888'),
('Fernández', 'isabel.fdz@email.com', 'Isabel', 'isabel_pwd', '677888999'),
('Díaz', 'miguel.diaz@email.com', 'Miguel', 'miguelon', '688999000'),
('Moreno', 'laura.moreno@email.com', 'Laura', 'laurita', '699000111'),
('Álvarez', 'david.alvarez@email.com', 'David', 'davidPass!', '601234567'),
('Ruiz', 'elena.ruiz@email.com', 'Elena', 'elena_secure', '612345678');

-- --------------------------------------------------------
-- Insertando datos en la tabla `productos` (12 registros)
-- --------------------------------------------------------
INSERT INTO `productos` (`categoria`, `descripcion`, `nombre`, `precio`) VALUES
('HOMBRE', 'Camiseta de algodón 100% color blanco', 'Camiseta Básica Blanca', 19.99),
('MUJER', 'Pantalón vaquero corte pitillo azul oscuro', 'Vaquero Skinny Mujer', 39.95),
('HOMBRE', 'Zapatillas deportivas para running', 'Zapatillas Running Pro', 75.50),
('INFANTIL', 'Sudadera con capucha y dibujo animado', 'Sudadera Infantil Dino', 25.00),
('MUJER', 'Vestido corto de verano estampado floral', 'Vestido Floral Verano', 45.99),
('HOMBRE', 'Polo de piqué color azul marino', 'Polo Clásico Marino', 29.95),
('MUJER', 'Falda midi plisada color negro', 'Falda Plisada Midi', 34.50),
('HOMBRE', 'Chaqueta tipo bomber ligera', 'Chaqueta Bomber Verde', 59.99),
('INFANTIL', 'Conjunto de pijama de algodón suave', 'Pijama Infantil Estrellas', 22.00),
('MUJER', 'Botines de tacón bajo en piel sintética', 'Botines Negros Casual', 49.90),
('HOMBRE', 'Bañador corto estampado tropical', 'Bañador Tropical', 24.99),
('INFANTIL', 'Gorra con visera ajustable', 'Gorra Infantil Béisbol', 12.50);

-- --------------------------------------------------------
-- Insertando datos en la tabla `facturas` (12 registros)
-- Nota: Se asume que los id_cliente van del 1 al 12 y los id_producto del 1 al 12
--       debido a las inserciones anteriores y la configuración AUTO_INCREMENT.
--       Ajusta los IDs si tus valores AUTO_INCREMENT iniciales son diferentes.
-- --------------------------------------------------------
INSERT INTO `facturas` (`cantidad`, `fecha`, `modo_pago`, `id_cliente`, `id_producto`) VALUES
(1, '2025-04-01', 'TARJETA', 1, 1),       -- Juan compra Camiseta Básica
(2, '2025-04-01', 'EFECTIVO', 2, 2),      -- María compra 2 Vaqueros Skinny
(1, '2025-04-02', 'BIZUM', 3, 3),         -- Pedro compra Zapatillas Running
(1, '2025-04-03', 'TARJETA', 4, 5),       -- Ana compra Vestido Floral
(1, '2025-04-03', 'TRANSFERENCIA', 5, 6), -- Luis compra Polo Clásico
(1, '2025-04-04', 'EFECTIVO', 6, 7),      -- Carmen compra Falda Plisada
(3, '2025-04-05', 'TARJETA', 7, 9),       -- José compra 3 Pijamas Infantiles
(1, '2025-04-06', 'BIZUM', 8, 10),       -- Isabel compra Botines Negros
(1, '2025-04-07', 'EFECTIVO', 9, 8),      -- Miguel compra Chaqueta Bomber
(1, '2025-04-08', 'TARJETA', 10, 4),      -- Laura compra Sudadera Infantil
(2, '2025-04-09', 'TRANSFERENCIA', 11, 11),-- David compra 2 Bañadores Tropicales
(1, '2025-04-10', 'BIZUM', 12, 12);      -- Elena compra Gorra Infantil

-- Reactivar la comprobación de claves foráneas
SET FOREIGN_KEY_CHECKS=1;

-- Mensaje final (opcional, solo para indicar que el script terminó)
-- SELECT 'Script de inserción completado.' AS Estado;
