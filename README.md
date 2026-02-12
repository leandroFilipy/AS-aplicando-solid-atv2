Cenário: Sistema de Cálculo de Descontos OCP

**Contextualização**

A empresa fictícia "TechStore" (a mesma do cenário anterior ) precisa que seu sistema de gerenciamento de descontos seja robusto. O time de marketing lança promoções frequentemente, exigindo a introdução constante de novos tipos de desconto (ex: Desconto de Aniversário, Desconto por Volume, Desconto de Black Friday).

**O Problema: Violação do OCP**

O código atual (na classe CalculadoraDeDesconto) lida com diferentes tipos de desconto usando condicionais (if/else ou switch) com base em um enum ou um tipo. O problema é que, toda vez que um novo tipo de desconto é adicionado, o desenvolvedor é obrigado a modificar a classe CalculadoraDeDesconto para incluir a nova regra.

Essa necessidade de modificar o código central para estender a funcionalidade viola o Princípio Aberto-Fechado (OCP), que afirma: uma entidade de software deve ser aberta para extensão, mas fechada para modificação.



 1 - Da forma que estava estruturado sempre que fosse adicionado uma nova forma de desconto seria necessário mexer na classe que contém os IFs ou CASEs e isso é contra o conceito OCP


 2 - Foi criado uma interface, os tipos de descontos foi separado em models e um método de calcular que usava a interface comoparametro para calcular o desconto

 3 - Código da classe

 package model;

import service.SistemaDeDescontos;

public class Aniversario implements SistemaDeDescontos {

    @Override
    public double descontar (Double valor){

        return valor * 0.80;
    }
}
package service;


public class CalculadoraDeDesconto {

    public double calcularDesconto (Double valor, SistemaDeDescontos reduzir){

        return reduzir.descontar(valor);
    }

    }


  double descontoAniversario =  calculadoraDeDesconto.calcularDesconto(pedido.getValorBruto(), new Aniversario());



