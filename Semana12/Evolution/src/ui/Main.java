package ui;

import model.Animal;
import model.Bird;
import model.Chicken;
import model.Duck;
import model.Felidae;
import model.Human;
import model.IFly;
import model.IMove;
import model.Mammal;
import model.Species;

import java.util.Scanner;

public class Main {
	private Scanner sc;

	public Main() {
		this.sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Main main = new Main();
		
        /** System.out.println("Create Animals"); */
		/** main.factoryAnimal(); */
        /** System.out.println("Create IMove Objects"); */
        /** main.factoryIMove(); */

        /** Animal human = new Human(60, 1.75, 30, "Javier"); */
        /** System.out.println(human); */

        /** IMove humanM = new Human(60, 1.75, 30, "Javier"); */
        /** System.out.println(humanM); */
        
        /** Human human = new Human(60, 1.72, 30, "Javier"); */
        /** System.out.println(human.communication()); */
        
        /** Human sapiens = new Human(60, 1.75, 30, "camilo"); */
        /** System.out.println(sapiens.communication()); */
        /** System.out.println(sapiens.run()); */

        /** Chicken pollo = new Chicken(20, 20, 3, 10); */
        /** System.out.println(pollo.run()); */
        
        IFly dA = new Duck(20, 20, 3, 10);
        IMove dB = new Duck(20, 20, 3, 10);

        System.out.println(dA.communication());
        System.out.println(dB.communication());

	}

    /**
     * crea objetos de tipo Animal
     *
     **/
    public void factoryAnimal() {
        
        Animal human = new Human(60, 1.65, 30, "Nicolas");
        System.out.println(human.communication());
        Animal cat = new Felidae(15, 30, 3, "Garfield", Species.CAT);
        System.out.println(cat.communication());
        Animal duck = new Duck(6, 30, 4, 60);
        System.out.println(duck.communication());
    }

    /**
     * crea objetos de tipo IMove
     *
     **/
    public void factoryIMove() {
        IMove moveHuman = new Human(60, 1.65, 30, "Nicolas");
        System.out.println(moveHuman.run());
        IMove moveCat = new Felidae(15, 30, 3, "Garfield", Species.CAT);
        System.out.println(moveCat.jump());
        Duck moveDuck = new Duck(6, 30, 4, 60);
        System.out.println(moveDuck.fly());
        
        ///////////////////////////////////////////////////////////////
        //  PREGUNTA: ¿Un objeto de tipo IMove es igual 
        //  a un objeto de tipo Animal? Cual es la diferencia entre 
        //  'human' y 'moveHuman'
        ///////////////////////////////////////////////////////////////

    }
    

}
