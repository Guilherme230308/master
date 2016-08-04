package br.com.ibm.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ibm.DAO.EmpresaHibernateDAO;
import br.com.ibm.modelo.Empresa;

@Path("/v1/listarDados")
public class ListarDadosResourcer {
	
	EmpresaHibernateDAO dao = new EmpresaHibernateDAO("empresa");
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Empresa> listarEmpresa() {
		List<Empresa> empresa = new ArrayList<Empresa>();
		empresa = dao.listar();
        return empresa;
	}

}
