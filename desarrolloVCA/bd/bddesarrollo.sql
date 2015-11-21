-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2015 a las 07:13:54
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bddesarrollo`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `validarLogin`(IN `_nick` VARCHAR(50), IN `_contrasena` VARCHAR(50))
BEGIN

 select * from empleado where nick = _nick and contrasena = _contrasena;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codCliente` int(11) NOT NULL AUTO_INCREMENT,
  `primerNombre` varchar(45) DEFAULT NULL,
  `segundoNombre` varchar(45) DEFAULT NULL,
  `primerApellido` varchar(45) DEFAULT NULL,
  `segundoApellido` varchar(45) DEFAULT NULL,
  `razonSocial` varchar(45) DEFAULT NULL,
  `ruc` varchar(45) DEFAULT NULL,
  `dni` varchar(45) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `fechaCreacion` date DEFAULT NULL,
  `fechaModificacion` date DEFAULT NULL,
  `fechaUltVisita` date DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `nombreCompleto` varchar(45) DEFAULT NULL,
  `TipoCliente_codTipoCliente` varchar(30) NOT NULL,
  PRIMARY KEY (`codCliente`),
  KEY `fk_Cliente_TipoCliente1_idx` (`TipoCliente_codTipoCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codCliente`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `razonSocial`, `ruc`, `dni`, `sexo`, `estado`, `correo`, `fechaCreacion`, `fechaModificacion`, `fechaUltVisita`, `info1`, `info2`, `nombreCompleto`, `TipoCliente_codTipoCliente`) VALUES
(1, 'Juan', 'Jesus', 'Quispe', 'Odar', 'RS', '12312323112', '1231313', 1, 1, 'juan@hotmail.com', '2015-11-02', '2015-11-03', '2015-11-04', NULL, NULL, 'Juan QUispe Odar', 'I'),
(2, 'Juan4', '1', '2', '3', NULL, NULL, '46081373', 1, 1, NULL, '2015-11-16', '2015-11-16', '2015-11-16', NULL, NULL, NULL, 'I'),
(3, 'Juan5', 'Jesis', 'QUi', 'Od', NULL, NULL, '20112351', 1, 1, NULL, '2015-11-16', '2015-11-16', '2015-11-16', NULL, NULL, NULL, 'I'),
(4, '', '', '', '', NULL, NULL, '', 1, 1, NULL, '2015-11-16', '2015-11-16', '2015-11-16', NULL, NULL, NULL, 'I');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `color`
--

CREATE TABLE IF NOT EXISTS `color` (
  `codColor` int(11) NOT NULL AUTO_INCREMENT,
  `nombreColor` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codColor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `controldinerocaja`
--

CREATE TABLE IF NOT EXISTS `controldinerocaja` (
  `codControlDineroCaja` int(11) NOT NULL AUTO_INCREMENT,
  `montoApertura` float DEFAULT NULL,
  `fechaCreacion` date DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  `Empleado_codEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`codControlDineroCaja`),
  KEY `fk_controlDineroCaja_Tienda1_idx` (`Tienda_codTienda`),
  KEY `fk_controlDineroCaja_Empleado1_idx` (`Empleado_codEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `codEmpleado` int(11) NOT NULL AUTO_INCREMENT,
  `primNombre` varchar(45) DEFAULT NULL,
  `segNombre` varchar(45) DEFAULT NULL,
  `apellidoPat` varchar(45) DEFAULT NULL,
  `apellidoMat` varchar(45) DEFAULT NULL,
  `fechaRegistro` date DEFAULT NULL,
  `fechaActualizacion` date DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `fechaIngreso` date DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `contrasena` varchar(45) DEFAULT NULL,
  `sexo` int(11) NOT NULL,
  `nick` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `nombreCompleto` varchar(215) DEFAULT NULL,
  PRIMARY KEY (`codEmpleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codEmpleado`, `primNombre`, `segNombre`, `apellidoPat`, `apellidoMat`, `fechaRegistro`, `fechaActualizacion`, `estado`, `fechaIngreso`, `telefono`, `correo`, `contrasena`, `sexo`, `nick`, `info1`, `info2`, `nombreCompleto`) VALUES
(1, 'Juan', 'Jesus', 'Quispe', 'Odar', '2015-11-02', '2015-11-03', 1, '2015-11-02', '5648978465', 'CORREO', '123', 0, 'juan', 'info1', 'info2', 'nombreCOmpleto'),
(2, 'Juan 2', NULL, '1', '1', '2016-04-11', '2016-04-11', 1, '2016-04-11', NULL, '3', '123', 1, 'jj', NULL, NULL, NULL),
(3, 'Ronadl', NULL, 'Jaim', 'Jaim', '2015-11-16', '2015-11-16', 1, '2015-11-16', NULL, 'rrr', '123', 1, 'ron', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingmercaderia`
--

CREATE TABLE IF NOT EXISTS `ingmercaderia` (
  `codIngMercaderia` int(11) NOT NULL AUTO_INCREMENT,
  `fechaIngreso` date DEFAULT NULL,
  `fechaCreacion` date DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `costoTotal` float DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Proveedor_codProveedor` int(11) NOT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  `Empleado_codEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`codIngMercaderia`),
  KEY `fk_IngMercaderia_Proveedor1_idx` (`Proveedor_codProveedor`),
  KEY `fk_IngMercaderia_Tienda1_idx` (`Tienda_codTienda`),
  KEY `fk_IngMercaderia_Empleado1_idx` (`Empleado_codEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingmercanciadetalle`
--

CREATE TABLE IF NOT EXISTS `ingmercanciadetalle` (
  `codIngMercanciaDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `costo` float DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Producto_sku` int(11) NOT NULL,
  `IngMercaderia_codIngMercaderia` int(11) NOT NULL,
  PRIMARY KEY (`codIngMercanciaDetalle`),
  KEY `fk_IngMercanciaDetalle_Producto1_idx` (`Producto_sku`),
  KEY `fk_IngMercanciaDetalle_IngMercaderia1_idx` (`IngMercaderia_codIngMercaderia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordencompra`
--

CREATE TABLE IF NOT EXISTS `ordencompra` (
  `codOrdenCompra` int(11) NOT NULL AUTO_INCREMENT,
  `estado` int(11) DEFAULT NULL,
  `fechaCreacion` date DEFAULT NULL,
  `fechaDeCompra` date DEFAULT NULL,
  `precioTotal` float DEFAULT NULL,
  `costoTotal` float DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Proveedor_codProveedor` int(11) NOT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  `Empleado_codEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`codOrdenCompra`),
  KEY `fk_OrdenCompra_Proveedor1_idx` (`Proveedor_codProveedor`),
  KEY `fk_OrdenCompra_Tienda1_idx` (`Tienda_codTienda`),
  KEY `fk_OrdenCompra_Empleado1_idx` (`Empleado_codEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordencompradetalle`
--

CREATE TABLE IF NOT EXISTS `ordencompradetalle` (
  `codOrdenCompraDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Producto_sku` int(11) NOT NULL,
  `OrdenCompra_codOrdenCompra` int(11) NOT NULL,
  PRIMARY KEY (`codOrdenCompraDetalle`),
  KEY `fk_OrdenCompraDetalle_Producto1_idx` (`Producto_sku`),
  KEY `fk_OrdenCompraDetalle_OrdenCompra1_idx` (`OrdenCompra_codOrdenCompra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `sku` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `fechaCreacion` date DEFAULT NULL,
  `fechaModificacion` date DEFAULT NULL,
  `creador` varchar(45) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Talla_codTalla` int(11) NOT NULL,
  `Color_codColor` int(11) NOT NULL,
  PRIMARY KEY (`sku`),
  KEY `fk_Producto_Talla1_idx` (`Talla_codTalla`),
  KEY `fk_Producto_Color1_idx` (`Color_codColor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `codProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `ruc` varchar(45) DEFAULT NULL,
  `web` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `razonSocial` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reqinv`
--

CREATE TABLE IF NOT EXISTS `reqinv` (
  `codReqInv` int(11) NOT NULL AUTO_INCREMENT,
  `fechaRequerimiento` date DEFAULT NULL,
  `codTiendaSalida` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Empleado_codEmpleado` int(11) NOT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  PRIMARY KEY (`codReqInv`),
  KEY `fk_ReqInv_Empleado1_idx` (`Empleado_codEmpleado`),
  KEY `fk_ReqInv_Tienda1_idx` (`Tienda_codTienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reqinvdetalle`
--

CREATE TABLE IF NOT EXISTS `reqinvdetalle` (
  `codReqInvDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `ReqInv_codReqInv` int(11) NOT NULL,
  `Producto_sku` int(11) NOT NULL,
  PRIMARY KEY (`codReqInvDetalle`),
  KEY `fk_ReqInvDetalle_ReqInv1_idx` (`ReqInv_codReqInv`),
  KEY `fk_ReqInvDetalle_Producto1_idx` (`Producto_sku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `talla`
--

CREATE TABLE IF NOT EXISTS `talla` (
  `codTalla` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTalla` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codTalla`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tienda`
--

CREATE TABLE IF NOT EXISTS `tienda` (
  `codTienda` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `fechaCreacion` varchar(45) DEFAULT NULL,
  `fechaActualizacion` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `TipoTienda_codTipoTienda` int(11) NOT NULL,
  PRIMARY KEY (`codTienda`),
  KEY `fk_Tienda_TipoTienda1_idx` (`TipoTienda_codTipoTienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiendaproducto`
--

CREATE TABLE IF NOT EXISTS `tiendaproducto` (
  `cantidadReal` int(11) NOT NULL AUTO_INCREMENT,
  `cantidadSeparada` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Producto_sku` int(11) NOT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  PRIMARY KEY (`cantidadReal`),
  KEY `fk_TiendaProducto_Producto1_idx` (`Producto_sku`),
  KEY `fk_TiendaProducto_Tienda1_idx` (`Tienda_codTienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipocliente`
--

CREATE TABLE IF NOT EXISTS `tipocliente` (
  `codTipoCliente` varchar(30) NOT NULL,
  `nombreTipo` varchar(30) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codTipoCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipocliente`
--

INSERT INTO `tipocliente` (`codTipoCliente`, `nombreTipo`, `info`) VALUES
('I', 'Individual', NULL),
('J', 'Juridica', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumento`
--

CREATE TABLE IF NOT EXISTS `tipodocumento` (
  `codTipDocumento` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codTipDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopago`
--

CREATE TABLE IF NOT EXISTS `tipopago` (
  `codTipoPago` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTipo` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codTipoPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipotienda`
--

CREATE TABLE IF NOT EXISTS `tipotienda` (
  `codTipoTienda` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `info` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codTipoTienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transferencia`
--

CREATE TABLE IF NOT EXISTS `transferencia` (
  `codTransferencia` int(11) NOT NULL AUTO_INCREMENT,
  `codTiendaSalida` int(11) DEFAULT NULL,
  `fechaTransferencia` date DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `fechaRecibido` date DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `TransferenciaEstado_codTransferenciaEstado` int(11) NOT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  `Empleado_codEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`codTransferencia`),
  KEY `fk_Transferencia_TransferenciaEstado1_idx` (`TransferenciaEstado_codTransferenciaEstado`),
  KEY `fk_Transferencia_Tienda1_idx` (`Tienda_codTienda`),
  KEY `fk_Transferencia_Empleado1_idx` (`Empleado_codEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transferenciadetalle`
--

CREATE TABLE IF NOT EXISTS `transferenciadetalle` (
  `codTransferenciaDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Transferencia_codTransferencia` int(11) NOT NULL,
  `Producto_sku` int(11) NOT NULL,
  PRIMARY KEY (`codTransferenciaDetalle`),
  KEY `fk_transferenciaDetalle_Transferencia1_idx` (`Transferencia_codTransferencia`),
  KEY `fk_transferenciaDetalle_Producto1_idx` (`Producto_sku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transferenciaestado`
--

CREATE TABLE IF NOT EXISTS `transferenciaestado` (
  `codTransferenciaEstado` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codTransferenciaEstado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `codVenta` int(11) NOT NULL AUTO_INCREMENT,
  `numeroDoc` varchar(45) DEFAULT NULL,
  `tipoVenta` varchar(45) DEFAULT NULL,
  `subTotal` float DEFAULT NULL,
  `subTotalConImp` float DEFAULT NULL,
  `impuesto` float DEFAULT NULL,
  `total` float DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `fechaVenta` date DEFAULT NULL,
  `fechaModificacion` date DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `codTipoDocumento` int(11) DEFAULT NULL,
  `Cliente_codCliente` int(11) NOT NULL,
  `TipoDocumento_codTipDocumento` int(11) NOT NULL,
  `Tienda_codTienda` int(11) NOT NULL,
  `Empleado_codEmpleado` int(11) NOT NULL,
  `VentaPago_codVentaPago` int(11) NOT NULL,
  PRIMARY KEY (`codVenta`),
  KEY `fk_Venta_Cliente1_idx` (`Cliente_codCliente`),
  KEY `fk_Venta_TipoDocumento1_idx` (`TipoDocumento_codTipDocumento`),
  KEY `fk_Venta_Tienda1_idx` (`Tienda_codTienda`),
  KEY `fk_Venta_Empleado1_idx` (`Empleado_codEmpleado`),
  KEY `fk_Venta_VentaPago1_idx` (`VentaPago_codVentaPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventadetalle`
--

CREATE TABLE IF NOT EXISTS `ventadetalle` (
  `codVentaDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `nroLinea` int(11) DEFAULT NULL,
  `precioVenta` float DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precioV_Cant` float DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `tienda` int(11) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `Producto_sku` int(11) NOT NULL,
  `Venta_codVenta` int(11) NOT NULL,
  PRIMARY KEY (`codVentaDetalle`),
  KEY `fk_VentaDetalle_Producto1_idx` (`Producto_sku`),
  KEY `fk_VentaDetalle_Venta1_idx` (`Venta_codVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventapago`
--

CREATE TABLE IF NOT EXISTS `ventapago` (
  `codVentaPago` int(11) NOT NULL AUTO_INCREMENT,
  `montoPago` float DEFAULT NULL,
  `numeroTarjeta` float DEFAULT NULL,
  `nombreTarjeta` varchar(45) DEFAULT NULL,
  `info1` varchar(45) DEFAULT NULL,
  `info2` varchar(45) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `tipoPago_codTipoPago` int(11) NOT NULL,
  PRIMARY KEY (`codVentaPago`),
  KEY `fk_VentaPago_tipoPago1_idx` (`tipoPago_codTipoPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_Cliente_TipoCliente1` FOREIGN KEY (`TipoCliente_codTipoCliente`) REFERENCES `tipocliente` (`codTipoCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `controldinerocaja`
--
ALTER TABLE `controldinerocaja`
  ADD CONSTRAINT `fk_controlDineroCaja_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_controlDineroCaja_Empleado1` FOREIGN KEY (`Empleado_codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ingmercaderia`
--
ALTER TABLE `ingmercaderia`
  ADD CONSTRAINT `fk_IngMercaderia_Proveedor1` FOREIGN KEY (`Proveedor_codProveedor`) REFERENCES `proveedor` (`codProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_IngMercaderia_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_IngMercaderia_Empleado1` FOREIGN KEY (`Empleado_codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ingmercanciadetalle`
--
ALTER TABLE `ingmercanciadetalle`
  ADD CONSTRAINT `fk_IngMercanciaDetalle_Producto1` FOREIGN KEY (`Producto_sku`) REFERENCES `producto` (`sku`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_IngMercanciaDetalle_IngMercaderia1` FOREIGN KEY (`IngMercaderia_codIngMercaderia`) REFERENCES `ingmercaderia` (`codIngMercaderia`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ordencompra`
--
ALTER TABLE `ordencompra`
  ADD CONSTRAINT `fk_OrdenCompra_Proveedor1` FOREIGN KEY (`Proveedor_codProveedor`) REFERENCES `proveedor` (`codProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_OrdenCompra_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_OrdenCompra_Empleado1` FOREIGN KEY (`Empleado_codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ordencompradetalle`
--
ALTER TABLE `ordencompradetalle`
  ADD CONSTRAINT `fk_OrdenCompraDetalle_Producto1` FOREIGN KEY (`Producto_sku`) REFERENCES `producto` (`sku`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_OrdenCompraDetalle_OrdenCompra1` FOREIGN KEY (`OrdenCompra_codOrdenCompra`) REFERENCES `ordencompra` (`codOrdenCompra`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_Producto_Talla1` FOREIGN KEY (`Talla_codTalla`) REFERENCES `talla` (`codTalla`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Producto_Color1` FOREIGN KEY (`Color_codColor`) REFERENCES `color` (`codColor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reqinv`
--
ALTER TABLE `reqinv`
  ADD CONSTRAINT `fk_ReqInv_Empleado1` FOREIGN KEY (`Empleado_codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ReqInv_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reqinvdetalle`
--
ALTER TABLE `reqinvdetalle`
  ADD CONSTRAINT `fk_ReqInvDetalle_ReqInv1` FOREIGN KEY (`ReqInv_codReqInv`) REFERENCES `reqinv` (`codReqInv`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ReqInvDetalle_Producto1` FOREIGN KEY (`Producto_sku`) REFERENCES `producto` (`sku`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tienda`
--
ALTER TABLE `tienda`
  ADD CONSTRAINT `fk_Tienda_TipoTienda1` FOREIGN KEY (`TipoTienda_codTipoTienda`) REFERENCES `tipotienda` (`codTipoTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tiendaproducto`
--
ALTER TABLE `tiendaproducto`
  ADD CONSTRAINT `fk_TiendaProducto_Producto1` FOREIGN KEY (`Producto_sku`) REFERENCES `producto` (`sku`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TiendaProducto_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `transferencia`
--
ALTER TABLE `transferencia`
  ADD CONSTRAINT `fk_Transferencia_TransferenciaEstado1` FOREIGN KEY (`TransferenciaEstado_codTransferenciaEstado`) REFERENCES `transferenciaestado` (`codTransferenciaEstado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Transferencia_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Transferencia_Empleado1` FOREIGN KEY (`Empleado_codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `transferenciadetalle`
--
ALTER TABLE `transferenciadetalle`
  ADD CONSTRAINT `fk_transferenciaDetalle_Transferencia1` FOREIGN KEY (`Transferencia_codTransferencia`) REFERENCES `transferencia` (`codTransferencia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_transferenciaDetalle_Producto1` FOREIGN KEY (`Producto_sku`) REFERENCES `producto` (`sku`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_Venta_Cliente1` FOREIGN KEY (`Cliente_codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Venta_TipoDocumento1` FOREIGN KEY (`TipoDocumento_codTipDocumento`) REFERENCES `tipodocumento` (`codTipDocumento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Venta_Tienda1` FOREIGN KEY (`Tienda_codTienda`) REFERENCES `tienda` (`codTienda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Venta_Empleado1` FOREIGN KEY (`Empleado_codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Venta_VentaPago1` FOREIGN KEY (`VentaPago_codVentaPago`) REFERENCES `ventapago` (`codVentaPago`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ventadetalle`
--
ALTER TABLE `ventadetalle`
  ADD CONSTRAINT `fk_VentaDetalle_Producto1` FOREIGN KEY (`Producto_sku`) REFERENCES `producto` (`sku`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_VentaDetalle_Venta1` FOREIGN KEY (`Venta_codVenta`) REFERENCES `venta` (`codVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ventapago`
--
ALTER TABLE `ventapago`
  ADD CONSTRAINT `fk_VentaPago_tipoPago1` FOREIGN KEY (`tipoPago_codTipoPago`) REFERENCES `tipopago` (`codTipoPago`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
