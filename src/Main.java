public class Main {
    public static void main(String[] args) {
        Author knyazev = new Author("Князев", "Милослав");
        Book sets = new Book("Полный набор. Наследие древних", knyazev, 2016);
        System.out.println(knyazev);
        System.out.println(sets);

        Author alyokhin = new Author("Алёхин", "Александр");
        Book tom4 = new Book("Полное собрание партий с авторскими комментариями. Том 4. 1931—1946", alyokhin, 2017);
        System.out.println(alyokhin);
        System.out.println(tom4);

        System.out.println(alyokhin.equals(knyazev));
        System.out.println(sets.equals(tom4));
    }
}