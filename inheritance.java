// latestCar.java


    class Animal {
        String sound = "Roar";

        void makeSound() {
            System.out.println(sound);
        }
    }

    class Dog extends Animal {
        String sound = "Bark";

        void makeSound() {
            System.out.println(sound);
        }
    }

    public class inheritance {
        public static void main(String[] args) {
            Dog dg = new Dog();

            dg.makeSound();
        }
    }




