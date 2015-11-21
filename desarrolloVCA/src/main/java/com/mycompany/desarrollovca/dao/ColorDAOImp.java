package com.mycompany.desarrollovca.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mycompany.desarrollovca.model.Cliente;
import com.mycompany.desarrollovca.model.Color;

@Repository
public class ColorDAOImp extends JdbcDaoSupport implements ColorDAO{

	@Autowired
	public ColorDAOImp(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public List<Color> obtenerListColor() {
String query = "";
		
		try {            
			query =  "select * from color where 1 = 1";
			
			 return getJdbcTemplate().query(query,
		                new BeanPropertyRowMapper<Color>(Color.class));
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}

}
