package br.com.cagece.model;

public enum Status {
	
	ANDAMENTO("Em Andamento"),
	FINALIZADO("Finalizado");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}

}
