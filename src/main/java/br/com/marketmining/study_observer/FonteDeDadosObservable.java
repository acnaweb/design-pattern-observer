package br.com.marketmining.study_observer;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Observable;

public class FonteDeDadosObservable extends Observable {

	private String dados;

	public String getDados() {
		return dados;
	}

	/**
	 * @param parametros - opcional
	 */
	public void update(Map<String, Object> parametros) {

		if (parametros != null) {
			// percorre a lista de parametros e faz algo
			parametros.entrySet().stream().forEach(entry -> {
				String parametro = entry.getKey();
				Object valor = entry.getValue();
				
				// faz algo 
			});
		}

		this.dados = LocalDateTime.now().toString();

		setChanged();
		notifyObservers("Informacao qualquer");
	}

}
