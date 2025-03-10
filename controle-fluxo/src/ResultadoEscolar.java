public class ResultadoEscolar {
    public static void main(String[] args) {
        primeiraProva();
    }

    public static void primeiraProva() {
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota > 5 && nota < 7){
            System.out.println("Prova de recuperação");
            provaRecuperacao();
        }else 
            System.out.println("Reprovado");
             
    }

    public static void provaRecuperacao() {
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : (nota > 5 && nota < 7 ? "Prova de recuperação" : "Reprovado");

        System.out.println(resultado);
    }
}
