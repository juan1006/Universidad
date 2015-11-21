package com.mycompany.desarrollovca.dao;


import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mycompany.desarrollovca.metodGeneric.FechaGeneric;
import com.mycompany.desarrollovca.model.Empleado;

@Repository
public class EmpleadoDAOImp  extends JdbcDaoSupport implements EmpleadoDAO{

	 private SimpleJdbcCall simpleJdbcCall; 
	 
	@Autowired
	public EmpleadoDAOImp(DataSource dataSource) {
        setDataSource(dataSource);
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("validarLogin");
	}
	
	@Override
	public Empleado validarEmpleado(String nick, String contrasena) {
		  try {
	            return getJdbcTemplate().queryForObject(
	                    "select * from empleado where estado = 1 and nick='" + nick + "' and contrasena = '" + contrasena + "'",
	                    new BeanPropertyRowMapper<Empleado>(Empleado.class));
//	            
//	            SimpleJdbcCall procReadActor = new SimpleJdbcCall(getJdbcTemplate())
//	                    .withProcedureName("read_actor")
//	                    .withoutProcedureColumnMetaDataAccess()
//	                    .useInParameterNames("in_id")
//	                    .declareParameters( 
//	                    		new SqlParameter(OracleTypes.STRUCT,"ACTOR_TYPE")
//	                    );
//			    Empleado e = new Empleado();
//	            SimpleJdbcCall call=new SimpleJdbcCall(getJdbcTemplate()).withFunctionName("validarLogin");
//	            MapSqlParameterSource in=new MapSqlParameterSource();
//	            in.addValue("nick",nick);
//	            in.addValue("contrasena",contrasena);
//                call.executeFunction(e.getClass(),in);
               // return e;
			  
			  //MEtodo SP
//			  SqlParameterSource in = new MapSqlParameterSource().addValue("_nick", nick).addValue("_contrasena", contrasena);  
//			
//			   Map<String,Object> out = simpleJdbcCall.execute(in);  
//			   //List<Empleado> list = new ArrayList<Empleado>(out.values());
//			   if(out.isEmpty()){
//				   return null;
//			   }else{
//			   Empleado empleado = new Empleado();			  
//     		   empleado.setNombreCompleto((String)out.get("nombreCompleto"));  
//			   empleado.setNick((String)out.get("nick"));
//			   empleado.setPrimerNombre((String)out.get("primerNombre"));  
//			   return empleado;
			  //}
	        } catch (EmptyResultDataAccessException e) {
	            return null;
	        }
	}


	@Override
	public Integer insertar(Empleado object) {
		String query = ""; 
		
		try{
			query = "insert into empleado(primNombre,apellidoPat, apellidoMat , correo,nick,"
					+ "contrasena , sexo , fechaRegistro, fechaActualizacion , fechaIngreso,estado) "
	                + "values(?, ?, ?, ? , ? ,? ,? ,? ,? ,? ,?)";	
		
		return getJdbcTemplate().update(query,
                object.primerNombre, object.apellidoPat, object.apellidoMat, object.correo,object.nick
                ,object.contrasena, true , FechaGeneric.obtenerFechaActual(), FechaGeneric.obtenerFechaActual(), FechaGeneric.obtenerFechaActual(),true );
      
	    } catch (EmptyResultDataAccessException e) {
	    	return 0;
	    }
	}

}
