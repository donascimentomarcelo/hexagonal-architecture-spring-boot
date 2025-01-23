package br.com.pdi.hexagonal;

import br.com.pdi.hexagonal.infrastructure.Main;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = Main.class)
public abstract class IntegrationTest {
}
