package estabelecimento;

import estabelecimento.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        
        EquipamentoMultifuncional cannon = new EquipamentoMultifuncional();
        
        cannon.copiar();
        cannon.digitalizar();
        cannon.imprimir();
    }
}
