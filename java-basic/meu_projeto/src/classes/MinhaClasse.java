package classes;

public class MinhaClasse {
    public static void main(String [] args) {

        String primeiroNome ="Gabriel";
        String segundoNome="Cavalcante";
         
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do nome:" +primeiroNome.concat(" ").concat(segundoNome);
        
    }
}
