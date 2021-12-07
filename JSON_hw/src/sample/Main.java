package sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

class Books {
    Book[] books;

    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}

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
                    "books": [      
                {
                    "name": "The New York Trilogy",
                    "pages": 100,
                    "author": "Paul Auster"
                },
                {
                    "name": "The Atlas 6",
                    "pages": 200,
                    "author": "Olivia Blake"
                } 
                ]
                }     
            """;


    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Books books = gson.fromJson(JSON_TEXT, Books.class);
        System.out.println(books);

    }

}

