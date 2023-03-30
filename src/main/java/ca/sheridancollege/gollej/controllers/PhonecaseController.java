package ca.sheridancollege.gollej.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.gollej.beans.Phonecase;
import ca.sheridancollege.gollej.repositories.PhonecaseRepository;
import lombok.AllArgsConstructor;

//Author: Jacob Golle
//Student Number: 991 429 916
//Date: Tue, March 28, 2023

@RestController
@AllArgsConstructor
@RequestMapping("/api/phonecase")
public class PhonecaseController {

    private PhonecaseRepository phonecaseRepository;

    @GetMapping(value = { "/", "" })
    public List<Phonecase> getPhonecaseCollection() {
        return phonecaseRepository.findAll();
    }

    @GetMapping("/{id}")
    public Phonecase getPhonecaseById(@PathVariable Long id) {
        Optional<Phonecase> phonecase = phonecaseRepository.findById(id);
        if (phonecase.isPresent()) {
            return phonecase.get();
        } else {
            return null;
        }
    }

    @PostMapping(value = { "/", "" }, headers = "Content-type=application/json")
    public Phonecase postPhonecaseCollection(@RequestBody Phonecase phonecase) {
        phonecase.setId(null);
        return phonecaseRepository.save(phonecase);
    }

//    @PutMapping(value = "/{id}", headers = "Content-type=application/json")
//    public Phonecase putPhonecaseCollection(@PathVariable Long id, @RequestBody Phonecase phonecase) {
//        phonecase.setId(id);
//        phonecaseRepository.save(phonecase);
//        return phonecaseRepository.fdinbyId(id).get();
//    }

    @DeleteMapping("/{id}")
    public void deletePhonecaseById(@PathVariable Long id) {
        phonecaseRepository.deleteById(id);
        System.out.println("Phonecase with id " + id + " has been deleted.");
    }
}
