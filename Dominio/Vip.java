
package Dominio;

public class Vip extends Cliente implements ITratamentoVip{
    
    private double desconto;

    public Vip (String nome, int idade, String telefone, String sexo, String estadoCivil) {
        super(nome, idade, telefone, sexo, estadoCivil);
        this.desconto = 30;
    }

    @Override
    public void enviarMensagem() {
        String mensagem = "Olá "+super.nome+". "
                + "\nVenha conferir nossas promoções. Uma oferta especial te aguarda. "
                + "\nNa compra de qualquer produto você terá "+desconto+"% de desconto.";
        System.out.println(mensagem);
    }

    @Override
    public String toString() {
        return "Vip | \nDesconto: " + desconto;
    }
}