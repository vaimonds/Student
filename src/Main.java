public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Var1: " + dog + " | " + "Var2: " + cat + " | " + "Var3: " + paper);

        dog = dog + 4;
        cat = cat +4;
        paper = paper + 4;
        System.out.println("Var1: " + dog + " | " + "Var2: " + cat + " | " + "Var3: " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Var1: " + dog + " | " + "Var2: " + cat + " | " + "Var3: " + paper);

        var fried = 19;
        System.out.println("fried: " + fried);
        fried = fried + 2;
        System.out.println("fried: " + fried);
        fried = fried / 7;
        System.out.println("fried: " + fried);

        var frog = 3.5;
        System.out.println("frog: " + frog);
        frog = frog * 10;
        System.out.println("frog: " + frog);
        frog = frog / 3.5;
        System.out.println("frog: " + frog);
        frog = frog + 4;
        System.out.println("frog: " + frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        var totalMass = weightBoxer1 + weightBoxer2;
        System.out.println("Общая масса двух бойцов: " + totalMass + " кг.");

        var difference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между бойцами: " + difference + " кг.");

        var remainder = weightBoxer2 % weightBoxer1;
        System.out.println("Остаток от деления между двумя весами: " + remainder + " кг.");

        var quantityEmployee = 640 / 8;
        System.out.println("Всего работников в компании - " + quantityEmployee + " человек");

        quantityEmployee = quantityEmployee + 94;

        var hourWorks = quantityEmployee * 8;
        System.out.println("Если в компании работает " + quantityEmployee + " человек, то всего " + hourWorks + " часов работы может быть поделено между сотрудниками");
    }
}
