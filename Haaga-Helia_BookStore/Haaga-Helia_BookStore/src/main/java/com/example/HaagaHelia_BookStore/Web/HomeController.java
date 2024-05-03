package com.example.HaagaHelia_BookStore.Web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.HaagaHelia_BookStore.Domain.*;

@Controller
public class HomeController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CdRepository cdRepository;

    // haku kirjoista ja cd-levyistä
    @RequestMapping(value = "/searchItems", method = RequestMethod.GET)
    public String searchItems(@RequestParam("searchTerm") String searchTerm, Model model) {
        List<Book> books = bookRepository.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(searchTerm,
                searchTerm);
        List<Cd> cds = cdRepository.findBySongNameContainingIgnoreCaseOrArtistContainingIgnoreCase(searchTerm,
                searchTerm);

        model.addAttribute("books", books);
        model.addAttribute("cds", cds);
        return "frontpage";
    }
}
