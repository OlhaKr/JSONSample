package sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Book {
    String name;
    int pages;
    String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

public class Main {

    static String JSON_TEXT = """
                        
                {
                    "name": "The New York Trilogy",
                    "pages": 100,
                    "author": "Paul Auster"
                }
                        
            """;

    static String JSON_TEXT2 = """
                {
                    "name": "The Atlas 6",
                    "pages": 200,
                    "author": "Olivia Blake"
                }  
            """;


    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Book book = gson.fromJson(JSON_TEXT, Book.class);
        System.out.println(book);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        Book book2 = gson2.fromJson(JSON_TEXT2, Book.class);
        System.out.println(book2);

    }

}


