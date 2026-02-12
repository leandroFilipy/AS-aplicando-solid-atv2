package model;

import service.SistemaDeDescontos;

public class Cupom implements SistemaDeDescontos {

    public double descontar(Double valor){

        return valor * 0.90;
    }
}
