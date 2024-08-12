package estabelecimento.equipamentos.multifuncional;

import estabelecimento.equipamentos.copiadoras.Copiadora;
import estabelecimento.equipamentos.digitalizadora.Digitalizadora;
import estabelecimento.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento MultiFuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento MultiFuncional");
    }

    public void copiar() {
        System.out.println("Copiando via equipamento MultiFuncional");
    }
    
}
