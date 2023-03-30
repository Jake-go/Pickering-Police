package ca.sheridancollege.gollej.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.gollej.beans.Phonecase;
import ca.sheridancollege.gollej.beans.Police;
import ca.sheridancollege.gollej.repositories.PhonecaseRepository;
import ca.sheridancollege.gollej.repositories.PoliceRepository;
import lombok.AllArgsConstructor;

//Author: Jacob Golle
//Student Number: 991 429 916
//Date: Tue, March 28, 2023

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private PoliceRepository policeRepository;
    private PhonecaseRepository phonecaseRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading bootstrap data...");

        Police police1 = new Police();
        police1.setName("John");
        policeRepository.save(police1);

        Police police2 = new Police();
        police2.setName("Jane");
        policeRepository.save(police2);

        Police police3 = new Police();
        police3.setName("Jack");
        policeRepository.save(police3);

        Phonecase phonecase1 = new Phonecase();
        phonecase1.setName("iPhone 12 Pro");
        phonecase1.setPrice(60.00);
        phonecase1.setQuantity(30);
        phonecase1.setEmployeeName(police1.getName());
        phonecaseRepository.save(phonecase1);

        Phonecase phonecase2 = new Phonecase();
        phonecase2.setName("Google Pixel Pro 6");
        phonecase2.setPrice(70.00);
        phonecase2.setQuantity(50);
        phonecase2.setEmployeeName(police2.getName());
        phonecaseRepository.save(phonecase2);

        Phonecase phonecase3 = new Phonecase();
        phonecase3.setName("Otterbox");
        phonecase3.setPrice(80.00);
        phonecase3.setQuantity(70);
        phonecase3.setEmployeeName(police2.getName());
        phonecaseRepository.save(phonecase3);

        Phonecase phonecase4 = new Phonecase();
        phonecase4.setName("Samsung Galaxy S21");
        phonecase4.setPrice(90.00);
        phonecase4.setQuantity(90);
        phonecase4.setEmployeeName(police3.getName());
        phonecaseRepository.save(phonecase4);

        Phonecase phonecase5 = new Phonecase();
        phonecase5.setName("Samsung Galaxy S21 Ultra");
        phonecase5.setPrice(100.00);
        phonecase5.setQuantity(100);
        phonecase5.setEmployeeName(police3.getName());
        phonecaseRepository.save(phonecase5);
        
        Phonecase phonecase6 = new Phonecase();
        phonecase6.setName("Samsung Galaxy");
        phonecase6.setPrice(25.25);
        phonecase6.setQuantity(120);
        phonecase6.setEmployeeName(police3.getName());
        phonecaseRepository.save(phonecase6);

        Phonecase phonecase7 = new Phonecase();
        phonecase7.setName("iPhone 7");
        phonecase7.setPrice(61.44);
        phonecase7.setQuantity(140);
        phonecase7.setEmployeeName(police3.getName());
        phonecaseRepository.save(phonecase7);

        Phonecase phonecase8 = new Phonecase();
        phonecase8.setName("iPhone 12 Pro Max");
        phonecase8.setPrice(60.00);
        phonecase8.setQuantity(160);
        phonecase8.setEmployeeName(police1.getName());
        phonecaseRepository.save(phonecase8);

        Phonecase phonecase9 = new Phonecase();
        phonecase9.setName("iPhone 7");
        phonecase9.setPrice(60.00);
        phonecase9.setQuantity(180);
        phonecase9.setEmployeeName(police1.getName());
        phonecaseRepository.save(phonecase9);

        Phonecase phonecase10 = new Phonecase();
        phonecase10.setName("iPhone 8");
        phonecase10.setPrice(62.00);
        phonecase10.setQuantity(200);
        phonecase10.setEmployeeName(police1.getName());
        phonecaseRepository.save(phonecase10);

        System.out.println("Bootstrap data loaded...");
    }
}
