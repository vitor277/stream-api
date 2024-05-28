package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Desafio8 {
    public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
    List<Integer> digitos = numeros.stream()
    .flatMap(n -> String.valueOf(n).chars().mapToObj(c -> Character.getNumericValue(c)))
    .collect(Collectors.toList());
    
    int resultado = digitos.stream()
        .reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
