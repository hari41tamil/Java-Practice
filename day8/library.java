class libraryParentClass{
    String  book = "C Program";
    String  book1 = "Java Programming";
    String book2 = "Web Development";
    String  Ar = "Kumutham";
    String  Ar1 = "Vikadan";
    String news = "ThinaNandhi";
    String new1 = "Thina Malar";
    }

class Books extends libraryParentClass{
    void bookMethod(){
        System.out.println("Books are:");
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println();
    }
}

class ArticleClass extends libraryParentClass{
    void ArtMethod(){
        System.out.println("Articles are:");
        System.out.println(Ar);
        System.out.println(Ar1);
        System.out.println();
    }
}

class NewsChildClass extends libraryParentClass{
    void newsMethod(){
        System.out.println("NewsPapers are:");
        System.out.println(news);
        System.out.println(new1);
        System.out.println();
    }
}
public class library {
    public static void main(String[] args) {
        Books obj = new Books();
        ArticleClass obj1 = new ArticleClass();
        NewsChildClass obj2 = new NewsChildClass();
        obj.bookMethod();
        obj1.ArtMethod();
        obj2.newsMethod();

    }
    
}
