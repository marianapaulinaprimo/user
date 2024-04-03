package config;

import com.unopar.user.entity.User;
import com.unopar.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
public class ConfigTest implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) {
        System.out.println("passei");
        User u1 = new User(1L, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(2L, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
