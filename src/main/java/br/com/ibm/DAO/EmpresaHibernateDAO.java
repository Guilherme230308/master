package br.com.ibm.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ibm.modelo.Empresa;

public class EmpresaHibernateDAO implements EmpresaDAO {

	private final EntityManager em;
	private EntityManagerFactory entityManagerFactory;

	public EmpresaHibernateDAO(String factory) {
		entityManagerFactory = Persistence.createEntityManagerFactory(factory);
		this.em = entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> listar() {
		List<Empresa> empresa = em.createQuery("from Empresa").getResultList();
		return empresa;
	}

	@Override
	public void salvar(Empresa empresa) {
		em.persist(empresa);

	}

}
