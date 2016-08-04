package br.com.ibm.DAO;

import java.util.List;

import br.com.ibm.modelo.Empresa;

public interface EmpresaDAO {
	void salvar(Empresa produto);

	List<Empresa> listar();


}
