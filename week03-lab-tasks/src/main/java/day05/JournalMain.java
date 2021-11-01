package day05;

public class JournalMain {
    public static void main(String[] args) {
        Journal journal = new Journal();
        System.out.println(journal.addStudent("Bohumil Hrabal"));
        System.out.println(journal.addStudent("Kosztolányi Dezső"));
        System.out.println(journal.addStudent("Anonymus"));
        System.out.println(journal.addStudent("Bele Regis Notarius"));
        System.out.println(journal.getNamesList().toString());
    }
}
