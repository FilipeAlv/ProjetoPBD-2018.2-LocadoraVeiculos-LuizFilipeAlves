package br.com.util;

public class SQLUtil {
	public class Pessoa{
		public static final String SELECT_ALL = "SELECT p FROM Pessoa p";
		public static final String SELECT_MAX_COD = "SELECT MAX(codigo) FROM Pessoa";
		public static final String SELECT_MAX_ID = "SELECT MAX(id) FROM Pessoa";
	}
	
	public class PessoaFisica{
		public static final String SELECT_ALL = "SELECT p FROM PessoaFisica p";
		public static final String SELECT_CPF = "SELECT p FROM PessoaFisica p WEHERE p.cpf = :cpf";
	}
	
	public class PessoaJuridica{
		public static final String SELECT_ALL = "SELECT p FROM PessoaJuridica p";
		public static final String SELECT_CNPJ = "SELECT p FROM PessoaJuridica p WEHERE p.cnpj = :cnpj";
	}
	
	public class Categoria{
		public static final String SELECT_ALL = "SELECT c FROM Categoria c";
		public static final String SELECT_MAX_ID = "SELECT MAX(id) FROM Categoria";
		public static final String SELECT_TAMANHO = "SELECT c FROM Categoria c WHERE c.tamanho = :tamanho";
		
	}
	
	public class CaminhonetaCarga{
		public static final String SELECT_ALL = "SELECT c FROM CaminhonetaCarga c";
		public static final String SELECT_POTENCIA = "SELECT c FROM CaminhonetaCarga c WHERE c.potencia = :potencia";
	}
	
	public class CaminhonetaPassageiro{
		public static final String SELECT_ALL = "SELECT c FROM CaminhonetaPassageiro c";
	}
	
	public class Endereco{
		public static final String SELECT_UF = "SELECT e FROM Endereco e WHERE e.uf = :uf";
		public static final String SELECT_MAX_ID = "SELECT MAX(id) FROM Endereco";
	}
	
	public class Filial{
		public static final String SELECT_NOME = "SELECT f FROM Filial f WHERE f.nome = :nome";
		public static final String SELECT_MAX_ID = "SELECT MAX(id) FROM Filial";
		public static final String SELECT_ALL = "SELECT f FROM Filial";
	}
	
	public class Funcionario{
		public static final String SELECT_ALL = "SELECT f FROM Funcionario f";
		public static final String SELECT_CARGO = "SELECT f FROM Funcionario f WHERE f.cargo = :cargo";
	}
	
	public class Locacao{
		public static final String SELECT_ALL = "SELECT l FROM Locacao l";
		public static final String SELECT_DATA = "SELECT l FROM Locacao l WHERE l.dataFinal = :dataFinal";
	}
	
	public class Motorista{
		public static final String SELECT_ALL = "SELECT m FROM Motorista m";
		public static final String SELECT_HABILITACAO = "SELECT m FROM Motorista m WHERE m.habilitacao = :habilitacao";
	}
	
	public class Reserva{
		public static final String SELECT_ALL = "SELECT r FROM Reserva r";
		public static final String SELECT_DATA = "SELECT r FROM Reserva r WHERE r.dataInicial = :dataInicial";
		public static final String SELECT_TIPO = "SELECT r FROM Reserva r WHERE e.tipoLocacao = :tipo";
	}
	
	public class Veiculo{
		public static final String SELECT_ALL = "SELECT v FROM Veiculo v";
	}
}