package jpa.jpaprojekt.component;

import jpa.jpaprojekt.model.Unicode;
import jpa.jpaprojekt.repository.UnicodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    private final UnicodeRepository repository;

    public InitData(UnicodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        Set<Character> unicodeChars = Set.of('A', 'B', 'C', 'Æ', 'Ø', 'Å');

        for (char c : unicodeChars) {
            repository.save(new Unicode((int) c, c, "Favoritbogstav"));
        }

        System.out.println("Unicode data gemt i databasen!");
    }
}
