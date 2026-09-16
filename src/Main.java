
public class Main {

    public static void main(String[] args) {
        Author dmitry = new Author("Дмитрий", "Глуховский");

        Book metro2033 = new Book("Метро 2033", dmitry,  2005);

        Author tatsuki = new Author("Тацуки", "Фудзимото");

        Book сhainsawMan = new Book ("Chainsaw Man", tatsuki, 2018);

        metro2033.setYearPublic(2020);

        System.out.println(metro2033.getYearPublic());

    }

}
