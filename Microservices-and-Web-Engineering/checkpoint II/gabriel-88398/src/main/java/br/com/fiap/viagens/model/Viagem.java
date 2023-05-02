package br.com.fiap.viagens.model;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Viagem {
	
	private String dataDecolagem;
	private int diasEstadia;
	private int qtdeAssentosDisponiveis;
	private String modeloNave;
	
	@NotNull(message = "O campo nome é obrigatório")
	private String nomeComandante1;
	
	@Pattern(regexp = "[a-zA-Z]{4}[0-9]{4}[A-Z]{1}", message = "Matrícula inválida")
	private String matriculaComandante1;
	
	@NotNull(message = "O campo último nome é obrigatório")
	private String nomeComandante2;
	
	@Pattern(regexp = "[a-zA-Z]{4}[0-9]{4}[A-Z]{1}", message = "Matrícula inválida")
	private String matriculaComandante2;
	
	public Viagem(
			String dataDecolagem, 
			int diasEstadia, 
			int qtdeAssentosDisponiveis, 
			String modeloNave,
			String nomeComandante1, 
			String matriculaComandante1, 
			String nomeComandante2,
			String matriculaComandante2
		) {
		super();
		this.dataDecolagem = dataDecolagem;
		this.diasEstadia = diasEstadia;
		this.qtdeAssentosDisponiveis = qtdeAssentosDisponiveis;
		this.modeloNave = modeloNave;
		this.nomeComandante1 = nomeComandante1;
		this.matriculaComandante1 = matriculaComandante1;
		this.nomeComandante2 = nomeComandante2;
		this.matriculaComandante2 = matriculaComandante2;
	}
	
	public Viagem() {
	}

	public String getDataDecolagem() {
		return dataDecolagem;
	}
	public void setDataDecolagem(String dataDecolagem) {
		this.dataDecolagem = dataDecolagem;
	}
	
	public int getDiasEstadia() {
		return diasEstadia;
	}
	public void setDiasEstadia(int diasEstadia) {
		this.diasEstadia = diasEstadia;
	}
	
	public int getQtdeAssentosDisponiveis() {
		return qtdeAssentosDisponiveis;
	}
	public void setQtdeAssentosDisponiveis(int qtdeAssentosDisponiveis) {
		this.qtdeAssentosDisponiveis = qtdeAssentosDisponiveis;
	}
	
	public String getModeloNave() {
		return modeloNave;
	}
	public void setModeloNave(String modeloNave) {
		this.modeloNave = modeloNave;
	}
	
	public String getNomeComandante1() {
		return nomeComandante1;
	}
	public void setNomeComandante1(String nomeComandante1) {
		this.nomeComandante1 = nomeComandante1;
	}
	
	public String getMatriculaComandante1() {
		return matriculaComandante1;
	}
	public void setMatriculaComandante1(String matriculaComandante1) {
		this.matriculaComandante1 = matriculaComandante1;
	}
	
	public String getNomeComandante2() {
		return nomeComandante2;
	}
	public void setNomeComandante2(String nomeComandante2) {
		this.nomeComandante2 = nomeComandante2;
	}
	
	public String getMatriculaComandante2() {
		return matriculaComandante2;
	}
	public void setMatriculaComandante2(String matriculaComandante2) {
		this.matriculaComandante2 = matriculaComandante2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDecolagem, diasEstadia, matriculaComandante1, matriculaComandante2, modeloNave,
				nomeComandante1, nomeComandante2, qtdeAssentosDisponiveis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viagem other = (Viagem) obj;
		return Objects.equals(dataDecolagem, other.dataDecolagem) && diasEstadia == other.diasEstadia
				&& Objects.equals(matriculaComandante1, other.matriculaComandante1)
				&& Objects.equals(matriculaComandante2, other.matriculaComandante2)
				&& Objects.equals(modeloNave, other.modeloNave)
				&& Objects.equals(nomeComandante1, other.nomeComandante1)
				&& Objects.equals(nomeComandante2, other.nomeComandante2)
				&& qtdeAssentosDisponiveis == other.qtdeAssentosDisponiveis;
	}
}