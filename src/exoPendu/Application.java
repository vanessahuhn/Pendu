package exoPendu;

public class Application {

	public static void main(String[] args) {
		//cr�ation d'une instance de la classe Game, indispensable pour pouvoir appeler la m�thode partie()
		Game game1 = new Game();
		
		//appel de la m�thode partie() pour l'instance game1 de la clase Game
		//la m�thode prend en argument une cha�ne de caract�res qui correspond au mot � deviner
		game1.partie("mystere");
	}

}
