package desafios;
import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1);
        boolean numerosIguais = numeros.stream().noneMatch(n -> n.equals(n));
        System.out.println(numerosIguais);
    }
}
