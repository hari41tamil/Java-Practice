class Library {
    String bookName = "Harry Potter";
    void libraryMethod() {
        System.out.println("It is Library");
    }
}

class Book extends Library {
    String paper = "Magic Stick"; 
    void bookMethod() {
        System.out.println(bookName); 
    }
}

class Paper extends Book {
    void paperMethod() {
        System.out.println(paper); 
    }
}

public class MultiLevelLibrary {
    public static void main(String[] args) {
        Paper obj = new Paper();
        obj.libraryMethod();
        obj.bookMethod();
        obj.paperMethod();
    }
}
