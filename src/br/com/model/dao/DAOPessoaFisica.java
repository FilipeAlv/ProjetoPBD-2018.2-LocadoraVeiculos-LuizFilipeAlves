package br.com.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.model.beans.Pessoa;
import br.com.model.beans.PessoaFisica;
import br.com.util.ConnectionFactory;
import br.com.util.SQLUtil;


public class DAOPessoaFisica extends DaoGenerico<Pessoa>{

	private static DAOPessoaFisica DaoPessoaFisica;

	public static DAOPessoaFisica getInstace() {
		if (DaoPessoaFisica != null) {
			return DaoPessoaFisica;
		}

		return DaoPessoaFisica = new DAOPessoaFisica();
	}

	@SuppressWarnings("unchecked")
	public List<PessoaFisica> findAll(){
		EntityManager em = ConnectionFactory.getInstance().getConnection();
		List<PessoaFisica>pessoasFisicas = em.createQuery(SQLUtil.PessoaFisica.SELECT_ALL).getResultList();
		return pessoasFisicas;
	}


	public PessoaFisica findByCpf(String cpf) {
		EntityManager em = ConnectionFactory.getInstance().getConnection();
		TypedQuery<PessoaFisica> tq = em.createQuery(SQLUtil.PessoaFisica.SELECT_CPF, PessoaFisica.class);
		tq.setParameter("cpf", cpf);
		PessoaFisica pessoa = tq.getSingleResult();
		return pessoa;
	}

}