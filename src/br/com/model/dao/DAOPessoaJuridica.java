package br.com.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import br.com.model.beans.Pessoa;
import br.com.model.beans.PessoaJuridica;
import br.com.util.ConnectionFactory;
import br.com.util.SQLUtil;


public class DAOPessoaJuridica extends DaoGenerico<Pessoa>{

	private static DAOPessoaJuridica DaoPessoaJuridica;

	public static DAOPessoaJuridica getInstace() {
		if (DaoPessoaJuridica != null) {
			return DaoPessoaJuridica;
		}

		return DaoPessoaJuridica = new DAOPessoaJuridica();
	}

	@SuppressWarnings("unchecked")
	public List<PessoaJuridica> findAll(){
		EntityManager em = ConnectionFactory.getInstance().getConnection();
		List<PessoaJuridica>pessoasJuridicas = em.createQuery(SQLUtil.PessoaJuridica.SELECT_ALL).getResultList();
		em.close();
		return pessoasJuridicas;
	}


	public PessoaJuridica findByCnpj(String cnpj) {
		PessoaJuridica pessoa;
		try {
			EntityManager em = ConnectionFactory.getInstance().getConnection();
			TypedQuery<PessoaJuridica> tq = em.createQuery(SQLUtil.PessoaJuridica.SELECT_CNPJ, PessoaJuridica.class);
			tq.setParameter("cnpj", cnpj);
			 pessoa = tq.getSingleResult();
			em.close();
		}catch (NoResultException e) {
			pessoa = null;
		}
		return pessoa;
	}


	public List<PessoaJuridica> findByFind(String str){
		EntityManager em = ConnectionFactory.getInstance().getConnection();
		TypedQuery<PessoaJuridica> tq = em.createQuery(SQLUtil.PessoaJuridica.SELECT, PessoaJuridica.class);
		tq.setParameter("str", str);
		List<PessoaJuridica> pessoa = tq.getResultList();
		em.close();
		return pessoa;
	}
}
