package variaveis;

public class tipoVariaveis {

    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numerocurto2 = (short)numeroNormal;

        int numero =5;

        numero =10;

        //final diz que a variavel nao pode ser mudada
        final double numero1 = 10.0;

        System.out.println(numero + numerocurto2 +salarioMinimo + numero1);
    }
    
}