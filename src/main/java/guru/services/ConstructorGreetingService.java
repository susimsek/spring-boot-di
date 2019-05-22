package guru.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO_GURUS="Hello-I was İnjected by th constructor!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
