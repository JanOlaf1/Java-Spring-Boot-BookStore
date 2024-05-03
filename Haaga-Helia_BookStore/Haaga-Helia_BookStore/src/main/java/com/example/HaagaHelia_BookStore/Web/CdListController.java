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
public class CdListController {

    @Autowired
    private CdRepository cdRepository;
    @Autowired
    private CategoryRepository cRepository;

    // cd list
    @RequestMapping(value = "/cdlist")
    public String cdlist(Model model) {
        model.addAttribute("cds", cdRepository.findAll());
        return "cdlist";
    }

    // Cd lisäys
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/addcd")
    public String addCd(Model model) {
        model.addAttribute("cd", new Cd());
        model.addAttribute("category", cRepository.findAll());

        return "addcd";
    }

    // cd editointi
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/editcd/{id}", method = RequestMethod.GET)
    public String editCd(@PathVariable("id") Long cdId, Model model) {

        model.addAttribute("cd", cdRepository.findById(cdId).orElse(null));
        model.addAttribute("category", cRepository.findAll());
        return "editcd";

    }

    @PostMapping("/savecd")
    public String save(@Valid @ModelAttribute("cd") Cd cd, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errorMessage");
            model.addAttribute("category", cRepository.findAll());

            return "addcd";
        } else {
            cdRepository.save(cd);
            return "redirect:/booklist";
        }
    }

    // haku
    @RequestMapping(value = "/searchcd", method = RequestMethod.GET)
    public String searchCd(@RequestParam("searchCd") String searchCd, Model model) {
        List<Cd> cds = cdRepository.findBySongNameContainingIgnoreCaseOrArtistContainingIgnoreCase(searchCd, searchCd);
        model.addAttribute("cds", cds);
        return "cdlist";
    }

    // Artistin nouseva järjestys sorttaus
    @GetMapping("/cdlist/sortByArtistAsc")
    public String sortByArtistAsc(Model model) {
        model.addAttribute("cds", cdRepository.findAllByOrderByArtistAsc());
        return "cdlist";
    }

    // Artistin laskeva järjestys sorttaus
    @GetMapping("/cdlist/sortByArtistDesc")
    public String sortByArtistDesc(Model model) {
        model.addAttribute("cds", cdRepository.findAllByOrderByArtistDesc());
        return "cdlist";
    }

    // Biisi nouseva järjestys sorttaus
    @GetMapping("/cdlist/sortBySongNameAsc")
    public String sortByAlbumAsc(Model model) {
        model.addAttribute("cds", cdRepository.findAllByOrderBySongNameAsc());
        return "cdlist";
    }

    // Biisi laskeva järjestys sorttaus
    @GetMapping("/cdlist/sortBySongNameDesc")
    public String sortByAlbumDesc(Model model) {
        model.addAttribute("cds", cdRepository.findAllByOrderBySongNameDesc());
        return "cdlist";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/deletecd/{id}", method = RequestMethod.GET)
    public String deleteCd(@PathVariable("id") Long cdId, Model model) {
        cdRepository.deleteById(cdId);
        return "redirect:../cdlist";

    }

}