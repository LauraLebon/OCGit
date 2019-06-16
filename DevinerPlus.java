public class escargot{
  public static void main(String[] args){
	int nbEscargots = 5;
    int[] nombre = new int[nbEscargots]; 
    int max = 50;
    int essai = -1;
	int nombreCourant = 0;
	for (int tour=1; tour<=nbEscargots; tour=tour+1){
		nombre[tour] = 0;
	}
    while(nombreCourant < max){
		for (int tour=1; tour<=nbEscargots; tour=tour+1){
			essai = MOOC.auSort(1,6);
			nombre[tour] = nombre[tour] + essai;
			System.out.print(nombre[tour]);
			if (nombreCourant < nombre[tour]) {
				nombreCourant = nombre[tour];
			}
		}
		System.out.println("");
    }
    System.out.println("Bravo, c'était bien ça.");
  }
}