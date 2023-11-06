package seminar_4;

public class Homework_4 {
    /**
     * Необходимо создать класс Box, описывающий коробку с фруктами.
     * В одной коробке должны быть фрукты только одного типа.
     * У коробки должны быть методы:
     * 1. Метод добавления нового фрукта в коробку add(Fruit fruit)
     * 2. Метод подсчета суммарного веса коробки getWeight()
     * 3. Метод пересыпания фруктов одной коробки в другую move(Box box)
     * 4. * Реализовать итератор на коробке.
     * То есть должно быть доступно написать foreach, который итерируется по фруктам в коробке.
     */
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        System.out.println(appleBox.getWeight()); // 0

        appleBox.add(new Apple(2)); // Должно компилироваться
        appleBox.add(new Apple(4)); // Должно компилироваться
        System.out.println(appleBox.getWeight()); // 6
        //appleBox.add(new Orange(4)); // Не должно компилироваться!!!
        appleBox.add(new GoldenApple(4)); // Должно компилироваться
        System.out.println(appleBox.getWeight()); // 10

        Box<Orange> orangeBox = new Box<>();
        //orangeBox.add(new Apple(2)); // Не должно компилироваться!!!
        orangeBox.add(new Orange(8)); // Должно компилироваться
        System.out.println(orangeBox.getWeight()); // 8
//
//        orangeBox.move(appleBox); // Не должно компилироваться!!!
//        appleBox.move(orangeBox); // Не должно компилироваться!!!
//
        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(20)); // Должно компилироваться
        //goldenAppleBox.add(new Apple(20)); // Не должно компилироваться!!!
//
//        appleBox.move(goldenAppleBox); // Не должно компилироваться!!!
        goldenAppleBox.move(appleBox); // Должно компилироваться
//
        System.out.println(goldenAppleBox.getWeight()); // 0
        System.out.println(appleBox.getWeight()); // 30

//        for (Apple apple: appleBox) { // Должно компилироваться
//
//        }
//
//        for (GoldenApple goldenApple: goldenAppleBox) { // Должно компилироваться
//
//        }
//
//        for (Orange orange: orangeBox) { // Должно компилироваться
//
//        }

    }

    static class Box<T extends Fruit> {
        private int fweight;
        Box() {
            this.fweight = 0;
        }
        public void add(T fruit) {
            fweight += fruit.getWeight();
        }

        public int getWeight() { return fweight;}

        public void move(Box<Apple> another) {
            another.add(new Apple(fweight));
            fweight = 0;
        }

    }

    static class Fruit {

        private int weight;

        public Fruit(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    static class Apple extends Fruit {
        public Apple(int weight) {
            super(weight);
        }
    }

    static class GoldenApple extends Apple {
        public GoldenApple(int weight) {
            super(weight);
        }
    }

    static class Orange extends Fruit {
        public Orange(int weight) {
            super(weight);
        }
    }

}
