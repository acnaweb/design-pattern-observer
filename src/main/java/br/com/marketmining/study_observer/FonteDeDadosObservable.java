package br.com.marketmining.study_observer;

import java.time.LocalDateTime;
import java.util.Observable;

public class FonteDeDadosObservable extends Observable {

	private String dados;
	
	public String getDados() {
		return dados;
	}

	public void refresh() {
		this.dados = LocalDateTime.now().toString();

		setChanged();
		notifyObservers("Informacao qualquer");
	}

}
