class Book {
    String title;
    String author;
    int numberOfPages;
    String ISBN;

    Book(String tit, String aut, int num) {
        title = tit;
        author = aut;
        numberOfPages = num;
        ISBN = "unknown";
    }

    Book(String tit, String aut, int num, String isbn) {
        title = tit;
        author = aut;
        numberOfPages = num;
        ISBN = isbn;
    }

    public String getInitials() {
        String initials = "";
        for (int i = 0; i < author.length(); i++) {
            char currentChar = author.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z')
                initials = initials + currentChar + '.';
        }
        return initials;
    }
}

class ExampleBooks4 {
    public static void main(String[] args) {
        Book b;

        b = new Book("Thinking in Java", "Bruce Eckel", 1129);
        System.out.println("Initials: " + b.getInitials());
    }
}

class ExampleBooks5 {
    public static void main(String[] args) {
        Book[] a = new Book[3];
        a[0] = new Book("Thinking in Java", "Bruce Eckel", 1129);
        a[1] = new Book("Java in a nutshell", "David Flanagan", 353);
        a[2] = new Book("Java network programming",
                "Elliott Rusty Harold", 649);
        for (int i = 0; i < a.length; i++)
            System.out.println("Initials: " + a[i].getInitials());
    }
}

class ExampleBooks6 {
    public static void main(String[] args) {
        Book b1, b2;
        b1 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        b2 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        if (b1 == b2)
            System.out.println("The two books are the same");
        else
            System.out.println("The two books are different");
    }
}
