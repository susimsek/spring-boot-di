package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    public static final String HELLO_GURUS="Servicio de Seludo Primario ";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
