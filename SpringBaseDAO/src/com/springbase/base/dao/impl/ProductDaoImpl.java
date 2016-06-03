package com.springbase.base.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.springbase.base.bean.Rol;
import com.springbase.base.constante.ConstantesDAO;
import com.springbase.base.dao.ProductDao;
import com.springbase.base.dao.definition.RolDaoDefinition;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SimpleJdbcCall jdbcCall;
	@Autowired
	private RolDaoDefinition rolDaoDefinition;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> obtenerRoles() {
//		LOGGER.info("RolDaoImpl.listarMenu_estado: " + estadoRol);
		List<Rol> listaRol = null;
		
		listaRol = new ArrayList<Rol>();
		jdbcCall = new SimpleJdbcCall(jdbcTemplate);
		jdbcCall.withSchemaName(ConstantesDAO.SCHEMA_NAME);
		jdbcCall.withProcedureName(ConstantesDAO.SP_ROL_LISTAR);
		jdbcCall.withoutProcedureColumnMetaDataAccess();
		SqlParameterSource in = new MapSqlParameterSource();
		
		jdbcCall.returningResultSet("ref", rolDaoDefinition);
		listaRol = jdbcCall.executeObject(List.class, in);
			
		if(listaRol!= null | listaRol.isEmpty()){
			return listaRol;
		}
		
		return new ArrayList<Rol>();
	}
}
