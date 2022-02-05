package homework;

public class Dog extends Animal {
    public  final int LIMIT2=500; //для всех собак бег 500м
    public  final int LIMIT3=10; //для всех собак плавать на 10м
    private static int countdog=0;

    public Dog(String name, String family, int way, int distance, boolean jump) {
        super(name,family,way,distance,jump);
        countdog++;
    }

    @Override
    public void sweem() {
        System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " и я плаваю на "+ LIMIT3 +" метров %n" );
    }

    @Override
    public void run() {
        if(distance>0 && distance<=LIMIT2) {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я бегаю на расстояние: " + distance + " метров %n");
        }
        else {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я не умею бегать на такое расстояние %n");
        }
    }
//метод подсчета собак
    public static int printDog(){
        System.out.printf("%nКоличество созданных собак: "+ countdog);
        return countdog;
    }

}
