package computador.controller;

import computador.factory.ComponenteFactory;
import computador.model.Componente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/componentes")
public class ComponenteController {

    private final ComponenteFactory componenteFactory;

    @Autowired
    public ComponenteController(ComponenteFactory componenteFactory) {
        this.componenteFactory = componenteFactory;
    }

    @PostMapping("/criar")
    public String criarComponente(@RequestParam String tipoComponente) {
        Componente componente = componenteFactory.criarComponente(tipoComponente);
        if (componente != null) {
            componente.montar();
            return "Componente criado e montado com sucesso: " + tipoComponente;
        }
        return "Falha ao criar componente: " + tipoComponente;
    }
}
