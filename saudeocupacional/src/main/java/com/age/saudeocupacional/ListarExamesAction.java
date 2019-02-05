package com.age.saudeocupacional;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ListarExamesAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Exame> exames;
	
	public String execute() throws Exception {
		return "success";
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
}
