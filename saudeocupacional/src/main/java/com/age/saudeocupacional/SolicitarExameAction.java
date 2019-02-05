package com.age.saudeocupacional;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SolicitarExameAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Funcionario> selectFuncionarios;
	private List<TipoExame> selectTiposExames;
	private Funcionario funcionario;
	private TipoExame tipoExame;
	private Exame exame;
	
	public SolicitarExameAction() {
		selectFuncionarios = new ArrayList<Funcionario>();
		Funcionario funcionario = new Funcionario();
		
		// TODO: buscar Funcionarios no WS
		funcionario.setNome("Diego Mendoza Ferreira");
		
		selectFuncionarios.add(funcionario);
		
		selectTiposExames = new ArrayList<TipoExame>();
		
		// TODO: buscar Tipos Exames no WS
		TipoExame tipoExame1 = new TipoExame();
		tipoExame1.setDescricao("Admissional");
		selectTiposExames.add(tipoExame1);
		
		TipoExame tipoExame2 = new TipoExame();
		tipoExame2.setDescricao("Periódico");
		selectTiposExames.add(tipoExame2);
		
		TipoExame tipoExame3 = new TipoExame();
		tipoExame3.setDescricao("Demissional");
		selectTiposExames.add(tipoExame3);
		
		TipoExame tipoExame4 = new TipoExame();
		tipoExame4.setDescricao("Mudança de Função");
		selectTiposExames.add(tipoExame4);
		
		TipoExame tipoExame5 = new TipoExame();
		tipoExame5.setDescricao("Retorno ao Trabalho");
		selectTiposExames.add(tipoExame5);
	}
	
	public void validate(){
		if (tipoExame == null || tipoExame.getId() == 0) {
	        addFieldError("tipoExame.descricao", "Obrigatório selecionar o tipo de exame.");
	    }
		if (funcionario == null || funcionario.getId() == 0) {
	        addFieldError("funcionario.nome", "Obrigatório selecionar o funcionário.");
	    }
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	public String inserir() throws Exception {
		return "success";
	}
	
	public String alterar() throws Exception {
		return "success";
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Funcionario> getSelectFuncionarios() {
		return selectFuncionarios;
	}

	public void setSelectFuncionarios(List<Funcionario> selectFuncionarios) {
		this.selectFuncionarios = selectFuncionarios;
	}

	public List<TipoExame> getSelectTiposExames() {
		return selectTiposExames;
	}

	public void setSelectTiposExames(List<TipoExame> selectTiposExames) {
		this.selectTiposExames = selectTiposExames;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
	}
}
