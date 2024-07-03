package computador.service;

import computador.model.Componente;
import org.springframework.stereotype.Service;

@Service
public class ComponenteService {

    public void operarComponente(Componente componente) {
        componente.montar();
    }
}
