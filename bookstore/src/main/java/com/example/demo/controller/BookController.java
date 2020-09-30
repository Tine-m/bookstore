package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BookController {
    //This is a placeholder that will act as a database
    ArrayList<Book> inventory = new ArrayList<Book>(Arrays.asList(
            new Book("Peter Pedal i zoologisk have",2020,true),
            new Book("1984",1949,false),
            new Book("Hærværk",1930,false)
    ));

    @GetMapping("/")
    public String bookList(Model model) {
        model.addAttribute("books", inventory);
        return "booklist";
    }

    @GetMapping("/newbook")
    public String newbook(Model model) {
        model.addAttribute("books", inventory);
        return "newbook";
    }

    @PostMapping("/addToList")
    public String bookList(HttpServletRequest request) {
        String param1 = request.getParameter("title");
        String param2 = request.getParameter("year");
        String param3 = request.getParameter("ebook");
        Book book = new Book(param1, Integer.parseInt(param2), Boolean.parseBoolean(param3));
        inventory.add(book);
        return"redirect:/";
    }
}
