package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.models.Address;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.services.CandidateService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class Week4LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week4LabApplication.class, args);
	}


	@Autowired
	private CandidateService candidateService;

//	@Bean
	CommandLineRunner test() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Address address = new Address(UUID.randomUUID());
				Candidate candidate = new Candidate(UUID.randomUUID(), LocalDateTime.now(), "hiep@gmail.com", "Nguyen Van A", "087654321", address);

				boolean result = candidateService.create(candidate);
				System.out.println("Insert candidate: " + result);

				List<Candidate> candidates = candidateService.getAll();

				System.out.println(candidates);
				System.out.println("123");
			}
		};
	}
}
