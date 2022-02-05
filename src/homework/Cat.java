package homework;

public class Cat extends Animal {
    public  final int LIMIT1=200; //для всех кошек бег 200м
    private static int countcat=0;
   // public  final int way=0; //для всех кошек плавать не умеет
   //public  final boolean jump=true; //для всех кошек умеют прыгать



    public Cat(String name, String family, int way, int distance, boolean jump) {
        super(name,family,way,distance,jump);
        countcat++;
    }


//чтобы не было ошибки имплементим абстракные методы

    @Override
    public void sweem() {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я не умею плавать %n");
    }


   /* @Override
    public void jump() {
        if(jump==true) {
            System.out.println("Я кошка, " + name + " и я могу прыгать вот так: Jump!");
        }
        else if (jump==false) {
            System.out.println("Я кошка, " + name + " и я не умею прыгать(");
        }
    }*/

    @Override
    public void run() {
        if(distance>0 && distance<=LIMIT1) {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я бегаю на расстояние: " + distance + " метров %n");
        }
        else {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я не умею бегать на такое расстояние %n");
        }
    }



    // создаем конструктор Cat
    //возник вопрос как создать контруктор если мы не знаем переменных родительского класса
    // запрашиваем сеттеры






    //перейдем в метод Main проверим правильно ли создали конструктор Cat, создадим объект - экземпляр класса Cat

    // теперь переопределим абстрактные методы в классе Cat

//т.к. все кошки должны бегать по 200м создадим метод final для run() -нет не делаем этого, кошки не смогут быть абстрактным классом для других кошек






    //повторим это в клаасе Dog

    //создаем публичный метод для подсчета котов а в классе Main потом вызовем публичный метод
    public static int printCat(){
        System.out.printf("%nКоличество созданных котов: "+countcat);
        return countcat;
    }



}
