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
import com.mycompany.desarrollovca.model.Cliente;

@Repository
public class ClienteDAOImp  extends JdbcDaoSupport implements ClienteDAO{

	 @Autowired
	    public ClienteDAOImp(DataSource dataSource) {
	        setDataSource(dataSource);
	    }
	 
	@Override
	public  List<Cliente> obtenerListClienteY() {
		String query = "";
		
		try {
            
			query =  "select sd.id, sc.name, sp.ruc, sd.resolution_number, "
                    + "sd.tax_code, sd.amount, sd.period "
                    + "from sunat_debt sd "
                    + "left join sunat_concept sc "
                    + "on sd.concept_id = sc.id "
                    + "left join sunat_person sp "
                    + "on sd.person_id = sp.id "
                    + "where 1 = 1";
			
            return getJdbcTemplate().query(query,
                    new RowMapper<Cliente>() {

                @Override
                public Cliente mapRow(ResultSet rs, int i) throws SQLException {
                    Cliente d = new Cliente();
//                    d.setId(rs.getInt(1));
//                    d.setResolutionNumber(rs.getString(4));
//                    d.setTaxcode(rs.getString(5));
//                    d.setPeriod(rs.getString(7));
//                    d.setAmount(rs.getDouble(6));
//                    d.setConcept(new Concept(i, rs.getString(2)));
//                    Person p = new Person();
//                    p.setRuc(rs.getString(3));
//                    d.setPerson(p);
                    return d;
                }
            });
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}

	@Override
	public  List<Cliente> obtenerListCliente() {
		String query = "";
		
		try {            
			query =  "select * from cliente where 1 = 1";
			
			 return getJdbcTemplate().query(query,
		                new BeanPropertyRowMapper<Cliente>(Cliente.class));
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}

	@Override
	public int insertar(Cliente cliente) {
		String query = ""; 
		String nombreCompleto="";
		try{
			if(cliente.getPrimerNombre() != null ){
				nombreCompleto = cliente.getPrimerNombre().trim();
			}
			if(cliente.getSegundoNombre() != null){
				nombreCompleto += " " + cliente.getSegundoNombre().trim();
			}
			if(cliente.getPrimerApellido() != null){
				nombreCompleto += " " +cliente.getPrimerApellido().trim();
			}
			if(cliente.getSegundoApellido() != null){
				nombreCompleto += " " +cliente.getSegundoApellido().trim();
			}
			
			query = "insert into cliente(primerNombre,segundoNombre,primerApellido,segundoApellido,razonSocial,ruc,dni,sexo,estado,correo"
					+ ",fechaCreacion,fechaModificacion,fechaUltVisita,info1,info2,nombreCompleto,TipoCliente_codTipoCliente) "
	                + "values(?, ?, ?, ? , ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?)";	
		
		return getJdbcTemplate().update(query,
				cliente.getPrimerNombre()==null? "":cliente.getPrimerNombre().trim(), cliente.getSegundoNombre()==null? "":cliente.getSegundoNombre().trim(),
				cliente.getPrimerApellido()==null? "":cliente.getPrimerApellido().trim(),
				cliente.getSegundoApellido()==null? "":cliente.getSegundoApellido().trim(),
				cliente.getRazonSocial()==null? "":cliente.getRazonSocial().trim(),cliente.getRUC()==null? "":cliente.getRUC().trim(),
				cliente.getDNI()==null? "":cliente.getDNI().trim(),cliente.isSexo(),true,cliente.getCorreo()==null? "":cliente.getCorreo().trim() ,
				FechaGeneric.obtenerFechaActual() ,FechaGeneric.obtenerFechaActual(),
                FechaGeneric.obtenerFechaActual(),cliente.getInfo1()==null? "":cliente.getInfo1().trim() ,
                cliente.getInfo2()==null? "":cliente.getInfo2().trim(),nombreCompleto,cliente.getTipoCliente().getCodTipoCliente());
      
	    } catch (EmptyResultDataAccessException e) {
	    	e.printStackTrace();
	    	return 0;
	    }
	}

}
