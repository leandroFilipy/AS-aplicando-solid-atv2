package model;

import service.SistemaDeDescontos;

public class Vip implements SistemaDeDescontos {

    @Override
    public double descontar(Double valor){

        return valor * 0.85;
    }
}
