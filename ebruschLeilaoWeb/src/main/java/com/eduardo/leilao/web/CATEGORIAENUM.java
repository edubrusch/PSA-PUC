package com.eduardo.leilao.web;

public enum CATEGORIAENUM {

	AUTOMOVEIS("Automoveis"),
	ELETRONICOS("Eletronicos"),
	EQUIPAMENTOS_ESPORTIVOS("Equipamentos esportivos"),
	IMOVEIS("Imoveis"),
	INFORMATICA("Informatica"),
	MOBILIA("Mobilia"),
	OUTROS("Outros");

	private String label;

	private CATEGORIAENUM(String label){
		setLabel(label);
	}


	public void setLabel(String lab){
		this.label = lab;
	}

	public String getLabel(){
		return this.label;
	}

}


/**
<f:selectItem itemValue="1" itemLabel="Automoveis" />
<f:selectItem itemValue="2" itemLabel="Eletronicos" />
<f:selectItem itemValue="3" itemLabel="Equipamentos Esportivos" />
<f:selectItem itemValue="4" itemLabel="Imoveis" />
<f:selectItem itemValue="5" itemLabel="Informatica" />
<f:selectItem itemValue="6" itemLabel="Mobilia" />
<f:selectItem itemValue="7" itemLabel="Outros" />*/