package com.example.boot;

import com.example.db.entity.*;
import com.example.db.parententity.HomeType;
import com.example.db.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan("com.example.db")
@EnableJpaRepositories("com.example.db")
public class BootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    ClientRepository clientRepository;
    HomeContractRepository homeContractRepository;
    MailingAddressRepository mailingAddressRepository;
    OfficialAddressRepository officialAddressRepository;
    TripContractRepository tripContractRepository;

    public BootApplication(ClientRepository clientRepository, HomeContractRepository homeContractRepository,
                           MailingAddressRepository mailingAddressRepository, OfficialAddressRepository officialAddressRepository,
                           TripContractRepository tripContractRepository) {
        this.clientRepository = clientRepository;
        this.homeContractRepository = homeContractRepository;
        this.mailingAddressRepository = mailingAddressRepository;
        this.officialAddressRepository = officialAddressRepository;
        this.tripContractRepository = tripContractRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client("Client1", "Client1 surname", "1.1.2020", null, null, null, null);
        Client client2 = new Client("Client2", "Client2 surname", "8.8.1999", null, null, null, null);

        OfficialAddress officialAddress = new OfficialAddress(85105, "Bratislava", "Jegeho", (byte) 12, client1);
        OfficialAddress officialAddress2 = new OfficialAddress(75757, "Senec", "Bratislavska", (byte) 16, client2);
        MailingAddress mailingAddress = new MailingAddress(82108, "Kosice", "Hlavna", (byte) 3, client2);

        HomeContract homeContract1 = new HomeContract(HomeType.FLAT,225000,officialAddress, client1);
        HomeContract homeContract2 = new HomeContract(HomeType.WOODEN_HOUSE,650000,officialAddress2, client2);
        TripContract tripContract1 = new TripContract("1.1.2022","31.12.2022",true,true, client1);
        TripContract tripContract2 = new TripContract("11.11.2022","30.10.2023",false,false, client2);

        clientRepository.save(client1);
        clientRepository.save(client2);
        officialAddressRepository.save(officialAddress);
        officialAddressRepository.save(officialAddress2);
        mailingAddressRepository.save(mailingAddress);
        homeContractRepository.save(homeContract1);
        homeContractRepository.save(homeContract2);
        tripContractRepository.save(tripContract1);
        tripContractRepository.save(tripContract2);

    }
}
