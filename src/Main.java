public class Main {
    public static void main(String[] args) {
        Author timBerton = new Author("Тим", "Бертон");
        Book nine = new Book(" Книга 9", timBerton, 2009);
        nine.setPublishDate();
        System.out.println(timBerton);
        System.out.println(nine);
        System.out.println("Дата выпуска сеттер = " + nine.setPublishDate());


        Author levTolstoy = new Author("Лев", "Толстой");
        Book war = new Book(" Война и мир", levTolstoy, 1767);
        war.setPublishDate();
        System.out.println(levTolstoy);
        System.out.println(war);
        System.out.println("Дата выпуска сеттер = " + war.setPublishDate());

    }
}