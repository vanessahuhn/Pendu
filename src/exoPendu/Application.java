package exoPendu;

public class Application {

	public static void main(String[] args) {
		//création d'une instance de la classe Game, indispensable pour pouvoir appeler la méthode partie()
		Game game1 = new Game();
		
		//appel de la méthode partie() pour l'instance game1 de la clase Game
		//la méthode prend en argument une chaîne de caractères qui correspond au mot à deviner
		game1.partie("mystere");
	}

}
