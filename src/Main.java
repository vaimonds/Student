public class Main {
    public static void main(String[] args) {
        // Задача 1
        int appleBox = 223494888;
        System.out.println("Значение переменной с типом int равно " + appleBox);
        byte pen = 127;
        System.out.println("Значение переменной с типом byte равно " + pen);
        short fly = 30123;
        System.out.println("Значение переменной с типом short равно " + fly);
        long weight = 200133304L;
        System.out.println("Значение переменной с типом long равно " + weight);
        float water = 63.2345678f;
        System.out.println("Значение переменной с типом float равно " + water);
        double gasoline = 135.1783745834534;
        System.out.println("Значение переменной с типом double равно " + gasoline);

        // Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f; //В уроке значение указано через запятую, что является ошибкой на сколько я помню
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        // Задача 3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;

        short allPapers = 480;

        int allStudents = class1 + class2 + class3;

        int studentPapers = allPapers / allStudents;
        System.out.println("На каждого ученика рассчитано " + studentPapers + " листов бумаги" );

        // Задача 4
        byte perfomanceOneMinuts = 16 / 2;
        System.out.println("Производительность машины в минуту " + perfomanceOneMinuts + " бутылок");
        int perfomance20Minuts = perfomanceOneMinuts * 20;
        System.out.println("За 20 минут машина произвела " + perfomance20Minuts + " бутылок");
        int perfomanceOneDay = perfomanceOneMinuts * 1440;
        System.out.println("За сутки (1440 минут) машина произвела " + perfomanceOneDay + " бутылок");
        int perfomanceThreeDay = perfomanceOneMinuts * 4320;
        System.out.println("За 3 дня (4320 минут) машина произвела " + perfomanceThreeDay + " бутылок");
        int perfomanceOneMonth = perfomanceOneMinuts * 44640;
        System.out.println("За 1 месяц (44640 минут - если 31 день) машина произвела " + perfomanceOneMonth + " бутылок");

        // Задача 5
        byte allClass = 120 / (2 + 4);

        int whitePaintAll = 2 * allClass;
        int brownPaintAll = 4 * allClass;

        System.out.println("В школе, где " + allClass + " классов, нужно " + whitePaintAll + " банок белой краски и " + brownPaintAll + " банок коричневой краски");

        // Задача 6
        byte weightOneBanana = 80;
        byte weight100mlMilk = 105;
        byte weightOnePlombirIceCream = 100;
        byte weightRawOneEgg = 70;

        int weightDishGramm = weightOneBanana * 5 + weight100mlMilk * 2 + weightOnePlombirIceCream * 2 + weightRawOneEgg * 4;
        System.out.println("Масса блюда в граммах составляет " + weightDishGramm + " граммов");

        float weightDishKg = weightDishGramm / 1000f;
        System.out.println("Масса блюда в килограммах составляет " + weightDishKg + " килограммов");

        // Задача 7
        short dumpWeight = 7;
        short dumpWeight250OneDay = 250;
        short dumpWeight500OneDay = 500;

        short dumpWeightGramm = 7 * 1000;

        int dump250Day = dumpWeightGramm / dumpWeight250OneDay;
        System.out.println("При потере веса в 250 грамм в день. Потребуется " + dump250Day + " дней для сброса " + dumpWeight + " килограмм");
        int dump500Day = dumpWeightGramm / dumpWeight500OneDay;
        System.out.println("При потере веса в 500 грамм в день. Потребуется " + dump500Day + " дней для сброса " + dumpWeight + " килограмм");

        int dumpAverage = (dump250Day + dump500Day) / 2;

        System.out.println("В среднем потребуется " + dumpAverage + " дней, чтобы сбросить вес в 7 кг. при потере веса от 250 до 500 грамм в день");

        // Задача 8

        int monthlySalaryMasha = 67760;
        int monthlySalaryDenis = 83690;
        int monthlySalaryChristina = 76230;

        int yearSalaryMasha = monthlySalaryMasha * 12;
        System.out.println("Годовой доход Маши до повышения " + yearSalaryMasha);
        int yearSalaryDenis = monthlySalaryDenis * 12;
        System.out.println("Годовой доход Дениса до повышения " + yearSalaryDenis);
        int yearSalaryChristina = monthlySalaryChristina * 12;
        System.out.println("Годовой доход Кристины до повышения " + yearSalaryChristina);

        float percent = 0.1f;

        double monthlySalaryMasha10Percent = monthlySalaryMasha * percent + monthlySalaryMasha;
        System.out.println("Ежемесячный доход Маши после повышения " + monthlySalaryMasha10Percent);
        double monthlySalaryDenis10Percent = monthlySalaryDenis * percent + monthlySalaryDenis;
        System.out.println("Ежемесячный доход Дениса после повышения " + monthlySalaryDenis10Percent);
        double monthlySalaryChristina10Percent = monthlySalaryChristina * percent + monthlySalaryChristina;
        System.out.println("Ежемесячный доход Кристины после повышения " + monthlySalaryChristina10Percent);

        double yearSalaryMasha10Percent = monthlySalaryMasha10Percent * 12;
        System.out.println("Годовой доход Маши после повышения " + yearSalaryMasha10Percent);
        double yearSalaryDenis10Percent = monthlySalaryDenis10Percent * 12;
        System.out.println("Годовой доход Дениса после повышения " + yearSalaryDenis10Percent);
        double yearSalaryChristina10Percent = monthlySalaryChristina10Percent * 12;
        System.out.println("Годовой доход Кристины после повышения " + yearSalaryChristina10Percent);

        double differenceYearSalaryMasha = yearSalaryMasha10Percent - yearSalaryMasha;
        System.out.println("Разница между годовым доходом Маши с нынешним после повышения составляет " + differenceYearSalaryMasha);
        double differenceYearSalaryDenis = yearSalaryDenis10Percent - yearSalaryDenis;
        System.out.println("Разница между годовым доходом Маши с нынешним после повышения составляет " + differenceYearSalaryDenis);
        double differenceYearSalaryChristina = yearSalaryChristina10Percent - yearSalaryChristina;
        System.out.println("Разница между годовым доходом Маши с нынешним после повышения составляет " + differenceYearSalaryChristina);

        System.out.println("Маша теперь получает " + monthlySalaryMasha10Percent + " рублей в месяц. Годовой доход вырос на " + differenceYearSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + monthlySalaryDenis10Percent + " рублей в месяц. Годовой доход вырос на " + differenceYearSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthlySalaryChristina10Percent + " рублей в месяц. Годовой доход вырос на " + differenceYearSalaryChristina + " рублей");











    }
}
