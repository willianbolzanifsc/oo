import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Produto caneta = new Produto("Caneta");
        Produto lapis = new Produto("Lápis");


        //lapis.setPreco(30);
        List<Preco> listaDePrecos = new ArrayList<>();
        Preco preco1 = new Preco(5);
        preco1.setInicio(LocalDateTime.of(2022,Month.APRIL,20,0,0));
        preco1.setFim(LocalDateTime.of(2022,Month.MAY,28,0,0));
        Preco preco2 = new Preco(7);
        preco2.setInicio(LocalDateTime.of(2022,Month.MAY,30,0,0));
        listaDePrecos.add(preco1);
        listaDePrecos.add(preco2);
        caneta.setPrecos(listaDePrecos);
 caneta.setPreco(10);
          caneta.setPreco(20);
         caneta.setPreco(15);


        System.out.println(caneta.getPreco());
       for(Preco preco : caneta.getPrecos()){
           System.out.print(preco.getValor());
           System.out.print(" - ");
           System.out.print(preco.getInicio());
           System.out.print(" - ");
           System.out.print(preco.getFim());
           System.out.println("---");
       }


       // System.out.println(caneta.getPreco(LocalDateTime.of(2022, Month.JULY,28,23,49,0)));
    }
}
