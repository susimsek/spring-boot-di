package guru.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO_GURUS="Hello-I was İnjected by th setter!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
