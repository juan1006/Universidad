package com.springbase.base.dao.definition;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.springbase.base.bean.Rol;
import com.springbase.base.dao.util.DaoDefinition;

@Repository("RolDaoDefinition")
public class RolDaoDefinition extends DaoDefinition<Rol> {
	
	public RolDaoDefinition() {
		super(Rol.class);
	}
	
	@Override
	public Rol mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Rol rol = super.mapRow(rs, rowNumber);
		return rol;
	}
}
