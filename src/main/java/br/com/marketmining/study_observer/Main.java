package br.com.marketmining.study_observer;

public class Main {

	public static void main(String[] args) {
		FonteDeDadosObservable fonteDeDados = new FonteDeDadosObservable();

		Consumidor1Observer consumidor1 = new Consumidor1Observer(fonteDeDados);
		Consumidor2Observer consumidor2 = new Consumidor2Observer(fonteDeDados);

		for (int i = 1; i <= 3; i++) {
			try {

				fonteDeDados.refresh();

				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
