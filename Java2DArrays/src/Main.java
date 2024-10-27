
public class Main {

	public static void main(String[] args) {
		//un array 2d è un array contenete altri array
		//inizializziamo un array stringa 2d
		//si utilizzano[][] per indicare un array 2d
		//Il primo [] contiene le righe
		//Il secondo [] contiene le colonne
		String[][] macchine= new String[2][2];
		//inseriamo i dati
		macchine[0][0]="Subaru";  //riempio la prima riga e le 2 colonne
		macchine[0][1]="Mazda";	  //riempio la prima riga e le 2 colonne
		
		macchine[1][0]="Citroen";  //riempio la seconda riga e le 2 colonne
		macchine[1][1]="Hyundai";  //riempio la seconda riga e le 2 colonne
		
		//stampiamo i valori
		for(int i=0;i<macchine.length;i++) {
			System.out.println();//vado a capo dopo aver scritto una riga
			//ciclo sulla lunghezza della riga delle macchine nell'indice i
			for(int j=0;j<macchine[i].length;j++) {
				//stampo i valori della riga e delle colonne presenti in quella riga
				System.out.print(macchine[i][j]+" ");
			}
		}
		System.out.println();
		//un altro metodo per scrivere un array 2d è
		
		String[][] cars = {
							{"Mazda","Subaru"},
							{"Citroen","Hyundai"}
						  };
		//l'array 2d cars è composto da 2righe(0,1) e 2colonne(0,1)
		//stampiamo i valori
				for(int i=0;i<cars.length;i++) {
					System.out.println();//vado a capo dopo aver scritto una riga
					//ciclo sulla lunghezza della riga delle macchine nell'indice i
					for(int j=0;j<cars[i].length;j++) {
						//stampo i valori della riga e delle colonne presenti in quella riga
						System.out.print(cars[i][j]+" ");
					}
				}
	}

}
