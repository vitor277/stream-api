package desafios;
import java.util.List;
import java.util.Arrays;

public class Desafio1 {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

   numeros.stream().sorted().forEach(System.out::print);

  }
}
