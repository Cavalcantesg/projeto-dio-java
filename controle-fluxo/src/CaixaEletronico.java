public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 10.0;
        double valorSolitictado =17.0;

        if(valorSolitictado < saldo){
            saldo = saldo - valorSolitictado;
            System.out.println("Novo saldo " + saldo);
        }else
            System.out.println("Saldo insuficiente");
    }
    
}
