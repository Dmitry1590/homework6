package homework;

public class Main {

    public static void main(String[] args) {
    // создаем переменную счетчика животных (объектов созданных конструктором)

        //создаем объект кошку экземпляр класса Cat
//        Cat Kitty=new Cat("Kitty", "Кошачьи" ,200, 20, true);
//        Kitty.sweem();
//        Kitty.jump();
//        Kitty.run();
//
//        Cat Lizy=new Cat("Lizy", "Кошачьи", 0, 250, false);
//        Lizy.sweem();
//        Lizy.jump();
//        Lizy.run();
//
//        //создаем объект собаку экземпляр класса Dog
//        Dog Baddy=new Dog("Baddy", "Собачьи" ,0, 400, true);
//        Baddy.sweem();
//        Baddy.jump();
//        Baddy.run();
//
//        Dog Scooby=new Dog("Scooby", "Собачьи" ,200, 700, false);
//        Scooby.sweem();
//        Scooby.jump();
//        Scooby.run();


       // создадим массив животных

        Animal animals[] = new Animal[4];
        //переопределим элементы массива объектов

        animals[0]=new Cat("Kitty", "Кошачьи" ,200, 20, true);
        animals[1]=new Cat("Lizy", "Кошачьи", 0, 250, false);
        animals[2]=new Dog("Baddy", "Собачьи" ,0, 400, true);
        animals[3]=new Dog("Scooby", "Собачьи" ,200, 700, false);

        for (int i = 0; i < animals.length; i++) {
           animals[i].sweem();
            animals[i].run();
            animals[i].jump();
        }
//подсчитываем количество созданных объектов
        Animal.printCount();
        Cat.printCat();
        Dog.printDog();

    }
}
