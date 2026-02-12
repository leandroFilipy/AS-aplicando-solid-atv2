package model;

import service.SistemaDeDescontos;

public class Sazonal implements SistemaDeDescontos {

    public double descontar(Double valor){

        return valor * 0.95;
    }
}
