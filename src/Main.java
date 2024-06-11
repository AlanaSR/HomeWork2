import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");

        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2");
        var dog1 = (dog + 4);
        var cat1 = (cat + 4);
        var paper1 = (paper + 4);
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        System.out.println("Задание 3");
        var dog2 = (dog - 3.5);
        var cat2 = (cat - 1.6);
        var paper2 = (paper - 7639);
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        var friend1 = (friend + 2);
        System.out.println(friend1);
        var friend2 = (friend1 / 7);
        System.out.println(friend2);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        var frog1 = (frog * 10);
        System.out.println(frog1);
        var frog2 = (frog1 / 3.5);
        System.out.println(frog2);
        var frog3 = (frog2 + 4);
        System.out.println(frog3);

        System.out.println("Задание 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1+boxer2;
        System.out.println(totalWeight);
        var differenceWeight = abs(boxer1-boxer2);
        System.out.println(differenceWeight);

        System.out.println("Задание 7");
        var weightRemains = boxer2 % boxer1;
        System.out.println(weightRemains);

        System.out.println("Задание 8");
        var totalTime = 640;
        var onePersonTime = 8;
        var persones = totalTime / onePersonTime;
        System.out.println("Всего работников в компании - " + persones + " человек.");
        var persones1 = persones + 94;
        var totalTime1 = persones1 * onePersonTime;
        System.out.println("Если в компании работает " + persones1 + " человека, то всего " + totalTime1 + " часов работы может быть поделено между сотрудниками.");



    }
}