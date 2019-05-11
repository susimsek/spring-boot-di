package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    public static final String HELLO_GURUS="Hello Primary Greeting Service";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
