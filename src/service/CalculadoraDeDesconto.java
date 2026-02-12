package service;


public class CalculadoraDeDesconto {

    public double calcularDesconto (Double valor, SistemaDeDescontos reduzir){

        return reduzir.descontar(valor);
    }

    }


