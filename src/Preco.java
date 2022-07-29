import java.time.LocalDate;
import java.time.LocalDateTime;

public class Preco {
    private final double valor;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Preco(double valor) {
        this.valor = valor;
        this.setInicio(LocalDateTime.now().plusSeconds(5));
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public boolean finalNullo() {
        return this.fim == null;
    }

    public double valor() {
        return valor;
    }

    public void setDataFim() {
        this.fim = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    @Override
    public String toString() {
        return "Preco{" +
                "valor=" + valor +
                '}';
    }
}
