package homework;
public abstract class Animal {

    protected boolean jump; // поля для прыжка
   protected int way; //поле для бега
   protected int distance; // поле для плавания
    protected String name;
    protected String family;
    private static int countanimal=0;//

// вот этот момент уточнить нужно ли создавать конструктор Animal как без этого реализовать методы классам наследникам...
    //насколько я понял конструктор должен быть хорошо прописан

    public Animal(String name, String family, int way, int distance, boolean jump) {

        this.distance = distance;
        this.way = way;
        this.jump = jump;
        this.name = name;
        this.family = family;//семейство животных
        countanimal++;

    }

    // создаем абстрактные методы

    public abstract void sweem();
    public abstract  void run();
//public void countanimal(){
    //System.out.println("Количество созданных животных: "+ countanimal);
//}

    public void jump() {
        if(jump==true) {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я могу прыгать вот так: Jump! %n");
        }
        else if (jump==false) {
            System.out.printf("%nМеня зовут: " + name + " Я из семейства "+ family + " ,и я не умею прыгать( %n");
        }
    }


    //метод подсчета животных
    public static void printCount(){
        System.out.printf("%nКоличестов созданных животных: "+countanimal);
    };



    //пропишем геттеры и сеттеры чтобы классы наследники могли узнать какие переменные есть  в родительском классе

   // public boolean isJump() {
    //        return jump;
    //    }
    //
    //    public int getWay() {
    //        return way;
    //    }
    //
    //    public int getDistance() {
    //        return distance;
    //    }
    //
    //    public void setJump(boolean jump) {
    //        this.jump = jump;
    //    }
    //
    //    public void setWay(int way) {
    //        this.way = way;
    //    }
    //
    //    public void setDistance(int distance) {
    //        this.distance = distance;
    //    }

    //теперь создадим классы наследники и пропишем в них реализацию абстрактных методов


    /*public void setCountanimal(int countanimal) {
        this.countanimal = countanimal;
    }*/
}
