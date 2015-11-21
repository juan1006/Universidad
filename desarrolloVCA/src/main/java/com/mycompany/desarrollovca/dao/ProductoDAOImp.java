package com.mycompany.desarrollovca.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mycompany.desarrollovca.metodGeneric.FechaGeneric;
import com.mycompany.desarrollovca.model.Color;
import com.mycompany.desarrollovca.model.Producto;
import com.mycompany.desarrollovca.model.Talla;


@Repository
public class ProductoDAOImp extends JdbcDaoSupport implements ProductoDAO {

	@Autowired
	public ProductoDAOImp(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public List<Producto> obtenerListProducto() {
		String query = "";

		try {			
			query = "SELECT p.sku,p.descripcion,p.estado,p.fechaCreacion,p.fechaModificacion,"
					+"p.creador,p.costo,p.precio,p.info1,p.info2,c.codColor, c.nombreColor,c.info1,c.info2,"
					+"t.codTalla,t.nombreTalla,t.info1,t.info2 "
					+" FROM producto p"
					+" INNER JOIN color c ON c.codColor = p.Color_codColor"
					+" INNER JOIN talla t ON t.codTalla = p.Talla_codTalla";
		    return getJdbcTemplate().query(query, new RowMapper<Producto>() {
                @Override
                public Producto mapRow(ResultSet rs, int i) throws SQLException {
                	Producto producto = new Producto();
                	producto.setSKU(rs.getInt(1));
                	producto.setDescripcion(rs.getString(2));
                	producto.setEstado(rs.getBoolean(3));
                	producto.setFechaCreacion(rs.getDate(4));
                	producto.setFechaModificacion(rs.getDate(5));
                	producto.setCreador(rs.getString(6));
                	producto.setCosto(rs.getLong(7));
                   	producto.setPrecio(rs.getLong(8));
                   	producto.setInfo1(rs.getString(9));
                   	producto.setInfo2(rs.getString(10));
                 	Color color = new Color();
                 	color.setCodColor(rs.getInt(11));
                   	color.setNombreColor(rs.getString(12));
                   	color.setInfo1(rs.getString(13));
                   	color.setInfo2(rs.getString(14));
                   	producto.setColor(color);
                   	Talla talla = new Talla();
                   	talla.setCodTalla(rs.getInt(15));
                   	talla.setNombreTalla(rs.getString(16));
                   	talla.setInfo1(rs.getString(17));
                   	talla.setInfo2(rs.getString(18));
                   	producto.setTalla(talla);
                  
                    return producto;
                }
            });

		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

	@Override
	public int insertar(Producto producto) {
		String query = ""; 
		
		try{
						
			query = "insert into producto(descripcion,estado,fechaCreacion,fechaModificacion"
					+ ",creador,costo,precio,info1,info2,Talla_codTalla,Color_codColor) "
	                + "values(?, ?, ?, ? , ? ,? ,? ,? ,? ,? ,?)";	
		
		return getJdbcTemplate().update(query,
				producto.getDescripcion()==null? "":producto.getDescripcion().trim(),true,
				FechaGeneric.obtenerFechaActual(),FechaGeneric.obtenerFechaActual(),
				producto.getCreador()==null? "":producto.getCreador().trim(),
				producto.getCosto(), producto.getPrecio(),
				producto.getInfo1()==null? "":producto.getInfo1().trim(),producto.getInfo2()==null? "":producto.getInfo2().trim(),
				producto.getTalla().getCodTalla(),producto.getColor().getCodColor());	
      
	    } catch (EmptyResultDataAccessException e) {
	    	e.printStackTrace();
	    	return 0;
	    }
	}

}
