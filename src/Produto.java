import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private List<Preco> precos;
    public Produto(String nome) {
        this.nome = nome;
        this.precos = new ArrayList<>();
    }

    public void setPrecos(List<Preco> precos) {
        this.precos = precos;
    }

    public void setPreco(double valor) {
        Preco preco = new Preco(valor);
        if(!this.precos.isEmpty()){
            Preco precoAtual = this.getPreco();
            precoAtual.setDataFim();
            this.precos.add(preco);
        } else {
            this.precos.add(preco);
        }

    }

    public Preco getPreco(){
        for(Preco preco : precos){
            if (preco.finalNullo()){
                return preco;
            }
        }
        return null;
    }

    public Preco getPreco(LocalDateTime dataHora){
        for(Preco preco : precos){
           if((dataHora.isAfter(preco.getInicio()) && dataHora.isBefore(preco.getFim()))){
                return preco;
            }
        }
        return null;
    }

    public List<Preco> getPrecos() {
        return precos;
    }


}
