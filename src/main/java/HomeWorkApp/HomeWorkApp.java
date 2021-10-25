package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
    printThreeWords();
    System.out.println(" ");
    checkSumSign();
    System.out.println("");
    printColor();
    System.out.println("");
    compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 7;
        int b = 12;
        System.out.println(a+b);
        if (a+b > 0){
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void printColor(){
        int value = 17;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 12;
        int b = 4;
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
