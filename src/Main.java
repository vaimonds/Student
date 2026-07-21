public class Main {
    public static void main(String[] args) {
        // Задача 1
        short ageOne = 18;

        if (ageOne >= 18) {
            System.out.println("Если возраст человека равен " + ageOne + ". Он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageOne + ". Он не совершеннолетний, нужно подождать");
        }

        // Задача 2
        short temperature = 12;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. Холодно, нужно надеть шапку");
        } else if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        }

        // Задача 3
        short speed = 50;

        if (speed > 60){
            System.out.println("Если скорость " + speed + ",то скорость превышена");
        } else if (speed <= 60){
            System.out.println("Если скорость " + speed + ", то превышения скорости нет");
        }

        // Задача 4
        short ageTwo = 27;

        if (ageTwo > 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить на работу");
        } else if (ageTwo >= 18 && ageTwo <= 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в университет");
        } else if (ageTwo >= 7 && ageTwo <= 17) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить на в школу");
        } else if (ageTwo >= 2 && ageTwo <= 6) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в детский сад");
        }

        // Задача 5
        short ageThree = 14;

        if (ageThree > 14) {
            System.out.println("Если возраст ребёнка равен " + ageThree + ", то ему можно кататься на аттракционе");
        } else if (ageThree >= 5 && ageThree <= 14) {
            System.out.println("Если возраст ребёнка равен " + ageThree + ", то ему можно кататься на аттракционе только в сопровождении родителей");
        } else if (ageThree < 5 ) {
            System.out.println("Если возраст ребёнка равен " + ageThree + ", то ему нельзя кататься на аттракционе");
        }

        // Задача 6
        byte carCapacity = 102;
        byte numberOfSeats = 60;
        short numberOfPeople = 101;



        if (numberOfPeople >= 102) {
            System.out.println("Если в вагоне будет находится " + numberOfPeople + ", то мест нет, вагон забит");
        } else if (numberOfPeople >= 60) {
            System.out.println("Если в вагоне будет находится " + numberOfPeople + " человек, то есть только " + (carCapacity - numberOfPeople) + " стоячих мест");
        } else if (numberOfPeople < 60) {
            System.out.println("Если в вагоне будет находится " + numberOfPeople + " человек, то есть " + (numberOfSeats - numberOfPeople) + " сидячих мест и " + (carCapacity - numberOfSeats) + " стоячих мест");
        }

        // Задача 7
        int one = 2;
        int two = 1;
        int three = 1;

        if (one > two && one > three) {
            System.out.println("Число " + one + " большее среди чисел " + two + " и " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее среди чисел " + one + " и " + three);
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " большее среди чисел " + one + " и " + two);
        }


    }
}
