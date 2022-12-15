package com.example.demo;

import com.example.demo.model.Location;
import com.example.demo.model.User;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private final UserRepository userRepository;


	private final LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Ramesh");
		user1.setLastName("Fadatare");
		user1.setEmail("ramesh@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("John");
		user2.setLastName("Cena");
		user2.setEmail("john@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);

	}
}
