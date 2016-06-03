package com.springbase.base.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

 /**
  * Proyecto: DaoB2C
  * @date	: 6/11/2015
  * @time	: 12:34:54
  * @author	: Juan Quispe Odar.
 */
public class DaoDefinition<T> extends BeanPropertyRowMapper<T> {
	
	public DaoDefinition(Class<T> mappedClass){
		super(mappedClass);
	}
	
	public boolean encuentraColumnaEnResultSet(String columna,ResultSet rs){
		try{
			return rs.findColumn(columna) > 0 ? true : false;
		}catch(SQLException ex){
			return false;
		}
	}

}
