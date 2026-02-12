package model;

import service.SistemaDeDescontos;

public class Aniversario implements SistemaDeDescontos {

    @Override
    public double descontar (Double valor){

        return valor * 0.80;
    }
}
