package com.example.boot;

import com.example.db.entity.Client;
import com.example.db.entity.MailingAddress;
import com.example.db.entity.OfficialAddress;
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

        clientRepository.save(client1);
        clientRepository.save(client2);
        officialAddressRepository.save(officialAddress);
        officialAddressRepository.save(officialAddress2);
        mailingAddressRepository.save(mailingAddress);

    }
}
