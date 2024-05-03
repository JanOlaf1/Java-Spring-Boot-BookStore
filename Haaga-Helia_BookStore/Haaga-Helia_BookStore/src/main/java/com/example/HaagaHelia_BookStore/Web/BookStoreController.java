package com.example.HaagaHelia_BookStore.Web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.HaagaHelia_BookStore.Domain.*;

import jakarta.validation.Valid;

@Controller
public class BookStoreController {

    @Autowired
    private BookRepository bRepository;
    @Autowired
    private CategoryRepository cRepository;

    // haku palkki
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchBooks(@RequestParam("searchTerm") String searchTerm, Model model) {
        List<Book> books = bRepository.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(searchTerm,
                searchTerm);
        model.addAttribute("books", books);
        return "booklist";
    }

    // login
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    // etusivu
    @RequestMapping(value = "/frontpage")
    public String frontpage(Model model) {
        return "frontpage";
    }

    // booklist sivu
    @RequestMapping(value = "/booklist")
    public String bookList(Model model) {
        model.addAttribute("books", bRepository.findAll());
        return "booklist";
    }

    // kategoriaan siirtyminen.
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/saveCategory")
    public String saveCategory(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("categories", cRepository.findAll());
        return "addcategory";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("category", cRepository.findAll());
        return "addbook";
    }

    // editointi
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editBook(@PathVariable("id") Long bookId, Model model) {
        model.addAttribute("book", bRepository.findById(bookId).orElse(null));
        model.addAttribute("category", cRepository.findAll());
        return "editbook";
    }

    // tallenna kirja
    @PostMapping("/save")
    public String saveBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errorMessage");
            model.addAttribute("category", cRepository.findAll());

            return "addbook";
        } else {
            bRepository.save(book);
            return "redirect:/booklist";
        }
    }

    // kategorian tallennus
    @RequestMapping(value = "/saveCategory1", method = RequestMethod.POST)
    public String save(Category category) {
        cRepository.save(category);
        return "redirect:booklist";
    }

    // Deletointi
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long bookId, Model model) {
        bRepository.deleteById(bookId);
        return "redirect:../booklist";

    }

    // Author Järjestys sorttaus
    @GetMapping("/booklist/sortByAuthorAsc")
    public String sortByAuthorAsc(Model model) {
        model.addAttribute("books", bRepository.findAllByOrderByAuthorAsc());
        return "booklist";
    }
    // Author Järjestys sorttaus

    @GetMapping("/booklist/sortByAuthorDesc")
    public String sortByAuthorDesc(Model model) {
        model.addAttribute("books", bRepository.findAllByOrderByAuthorDesc());
        return "booklist";
    }

    // Title Järjestys sorttaus
    @GetMapping("/booklist/sortByTitleAsc")
    public String sortByTitleAsc(Model model) {
        model.addAttribute("books", bRepository.findAllByOrderByTitleAsc()); // Muutettu AuthorAsc -> TitleAsc
        return "booklist";
    }
    // Title Järjestys sorttaus

    @GetMapping("/booklist/sortByTitleDesc")
    public String sortByTitleDesc(Model model) {
        model.addAttribute("books", bRepository.findAllByOrderByTitleDesc()); // Muutettu AuthorDesc -> TitleDesc
        return "booklist";
    }

}
