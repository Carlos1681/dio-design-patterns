package computador.factory;

import computador.model.CPU;
import computador.model.Componente;
import computador.model.GPU;
import computador.model.RAM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponenteFactory {

    private final CPU cpu;
    private final GPU gpu;
    private final RAM ram;

    @Autowired
    public ComponenteFactory(CPU cpu, GPU gpu, RAM ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public Componente criarComponente(String tipoComponente) {
        if (tipoComponente == null || tipoComponente.isEmpty()) {
            return null;
        }
        switch (tipoComponente.toLowerCase()) {
            case "cpu":
                return cpu;
            case "gpu":
                return gpu;
            case "ram":
                return ram;
            default:
                return null;
        }
    }
}
