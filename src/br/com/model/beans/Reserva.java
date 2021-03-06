package br.com.model.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="sequencia_reserva", sequenceName="seq_res", initialValue=1, allocationSize=1)
public class Reserva implements EntidadeBase{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequencia_reserva")
	private Integer id;
	private Date dataReserva;
	private Date dataInicial;
	private Date dataFinalPrevista;
	@Column(length=10)
	private String tipoLocacao;
	private double valorPrevisto;
	@ManyToOne
	private Pessoa cliente;
	@OneToOne
	private Pessoa motorista;
	@ManyToOne
	private Filial filial;
	@ManyToOne
	private Filial filialEntrega;
	@ManyToOne
	private Categoria categoria;
	private String status;
	public Reserva() {
		super();
	}
	
	
	
	
	

	public Reserva(Date dataReserva, Date dataInicial, Date dataFinalPrevista, String tipoLocacao, double valorPrevisto,
			Pessoa cliente, Pessoa motorista, Filial filial, Filial filialEntrega, Categoria categoria, String status) {
		super();
		this.dataReserva = dataReserva;
		this.dataInicial = dataInicial;
		this.dataFinalPrevista = dataFinalPrevista;
		this.tipoLocacao = tipoLocacao;
		this.valorPrevisto = valorPrevisto;
		this.cliente = cliente;
		this.motorista = motorista;
		this.filial = filial;
		this.filialEntrega = filialEntrega;
		this.categoria = categoria;
		this.status = status;
	}



	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinalPrevista() {
		return dataFinalPrevista;
	}
	public void setDataFinalPrevista(Date dataFinalPrevista) {
		this.dataFinalPrevista = dataFinalPrevista;
	}
	public String getTipoLocacao() {
		return tipoLocacao;
	}
	public void setTipoLocacao(String tipoLocacao) {
		this.tipoLocacao = tipoLocacao;
	}
	public double getValorPrevisto() {
		return valorPrevisto;
	}
	public void setValorPrevisto(double valorPrevisto) {
		this.valorPrevisto = valorPrevisto;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Pessoa getMotorista() {
		return motorista;
	}
	public void setMotorista(Pessoa motorista) {
		this.motorista = motorista;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	public Filial getFilialEntrega() {
		return filialEntrega;
	}



	public void setFilialEntrega(Filial filialEntrega) {
		this.filialEntrega = filialEntrega;
	}



	public String getStatus() {
		return status;
	}






	public void setStatus(String status) {
		this.status = status;
	}






	public void setId(Integer id) {
		this.id = id;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataFinalPrevista == null) ? 0 : dataFinalPrevista.hashCode());
		result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
		result = prime * result + ((dataReserva == null) ? 0 : dataReserva.hashCode());
		result = prime * result + ((filial == null) ? 0 : filial.hashCode());
		result = prime * result + ((filialEntrega == null) ? 0 : filialEntrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tipoLocacao == null) ? 0 : tipoLocacao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorPrevisto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataFinalPrevista == null) {
			if (other.dataFinalPrevista != null)
				return false;
		} else if (!dataFinalPrevista.equals(other.dataFinalPrevista))
			return false;
		if (dataInicial == null) {
			if (other.dataInicial != null)
				return false;
		} else if (!dataInicial.equals(other.dataInicial))
			return false;
		if (dataReserva == null) {
			if (other.dataReserva != null)
				return false;
		} else if (!dataReserva.equals(other.dataReserva))
			return false;
		if (filial == null) {
			if (other.filial != null)
				return false;
		} else if (!filial.equals(other.filial))
			return false;
		if (filialEntrega == null) {
			if (other.filialEntrega != null)
				return false;
		} else if (!filialEntrega.equals(other.filialEntrega))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tipoLocacao == null) {
			if (other.tipoLocacao != null)
				return false;
		} else if (!tipoLocacao.equals(other.tipoLocacao))
			return false;
		if (Double.doubleToLongBits(valorPrevisto) != Double.doubleToLongBits(other.valorPrevisto))
			return false;
		return true;
	}




	
	
}
