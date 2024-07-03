package computador.model;

import org.springframework.stereotype.Component;

@Component
public class CPU implements Componente {
    @Override
    public void montar() {
        System.out.println("Montando CPU");
    }
}
