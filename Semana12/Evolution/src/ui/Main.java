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
import java.util.ArrayList;

public class Main {
	private Scanner sc;
    private ArrayList<Animal> animals;

	public Main() {
		this.sc = new Scanner(System.in);
        this.animals = new ArrayList<Animal>();
	}

	public static void main(String[] args) {
		Main main = new Main();
        main.initAnimals();
        main.removeAnimal(3);
        System.out.println(main.printAnimals());
        /** System.out.println(main.printChickens()); */
        /** System.out.println(main.printChickensCasting()); */


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

    public void initAnimals() {
        Animal humanA = new Human(60, 1.67, 30, "Camilo");
        Mammal humanB = new Human(60, 1.67, 30, "Juan");
        Human humanC = new Human(60, 1.67, 30, "Jorge");
        Felidae felindaeA = new Felidae(20, 20, 5, "Garfield", Species.CAT);
        Bird birdA = new Chicken(10, 25, 5, 20);
        Chicken chicken = new Chicken(10, 27, 6, 21.2);
        Duck duck = new Duck(10, 23, 4, 22.5 );

        animals.add(humanA);
        animals.add(humanB);
        animals.add(humanC);
        animals.add(felindaeA);
        animals.add(birdA);
        animals.add(chicken);
        animals.add(duck);
    }
    
    public String printAnimals() {
        String msg = "";
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) != null) {
                msg += animals.get(i).communication() + "index: "+ i + "\n";
            }
        }
        return msg;
    }

   public String printChickens() {
       String msg = "";
       for (int i = 0; i < animals.size(); i++) {
           if (animals.get(i) instanceof Chicken) {
               msg += animals.get(i).communication() + "\n";
           }
       }
       return msg;
   } 
   
   public String printChickensCasting() {
       String msg = "";
       for (int i = 0; i < animals.size(); i++) {
           if (animals.get(i) instanceof Chicken) {
               msg += ((Chicken)animals.get(i)).run() + "\n";
           }
       }
       return msg;
   } 


   public void removeAnimal(int index){
       this.animals.remove(index);
   }


}
