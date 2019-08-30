package com.api.superbay.utils;

public enum StatesOrder {
	AN("Andamento"),  AG("AGUARDANDO PAGAMENTO"), FE("FECHADO"), FA("FATURADO"), CN("CANCELADO"), EX("EXCLUIDO");
	
	private String stateOrder;
	
	StatesOrder(String stateOrder) {
		this.stateOrder = stateOrder;
	}
	
	public String getStateOrder() {
		return stateOrder;
	}
}
