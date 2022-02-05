package homework;

public class Cow extends Animal {
    public  final int LIMIT4=100;
    private static int countcow=0;

    public Cow(String name, String family, int way, int distance, boolean jump) {
        super(name, family, way, distance, jump);
        countcow++;

    }

    @Override
        public void sweem() {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я не умею плавать %n");
        }


    @Override
    public void run() {
        if(distance>0 && distance<=LIMIT4) {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я бегаю на расстояние: " + distance + " метров %n");
        }
        else {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я не умею бегать на такое расстояние %n");
        }
    }

    public static int countCow(){
        System.out.printf("%nКоличество созданных коров: "+countcow);
        return countcow;
    }

}
