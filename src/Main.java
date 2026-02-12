import model.*;
import service.CalculadoraDeDesconto;
import service.SistemaDeDescontos;

public class Main {
    public static void main(String[] args) {

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Pedido pedido = new Pedido("1", 100, 5, "leandro@gmail.com");


        double descontoVip =  calculadoraDeDesconto.calcularDesconto(pedido.getValorBruto(), new Vip());
        double descontoCupom =  calculadoraDeDesconto.calcularDesconto(pedido.getValorBruto(), new Cupom());
        double descontoSazonal =  calculadoraDeDesconto.calcularDesconto(pedido.getValorBruto(), new Sazonal());
        double descontoAniversario =  calculadoraDeDesconto.calcularDesconto(pedido.getValorBruto(), new Aniversario());
        System.out.println("O valor a ser pago é: " + descontoVip);
        System.out.println("O valor a ser pago é: " + descontoCupom);
        System.out.println("O valor a ser pago é: " + descontoSazonal);
        System.out.println("O valor a ser pago é: " + descontoAniversario);


    }
}