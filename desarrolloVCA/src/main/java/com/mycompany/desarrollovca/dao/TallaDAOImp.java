package com.mycompany.desarrollovca.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mycompany.desarrollovca.model.Cliente;
import com.mycompany.desarrollovca.model.Talla;

@Repository
public class TallaDAOImp extends JdbcDaoSupport implements TallaDAO{

	@Autowired
	public TallaDAOImp(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Override
	public List<Talla> obtenerListTalla() {
			String query = "";
		
		try {            
			query =  "select * from talla where 1 = 1";
			
			 return getJdbcTemplate().query(query,
		                new BeanPropertyRowMapper<Talla>(Talla.class));
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}

}
