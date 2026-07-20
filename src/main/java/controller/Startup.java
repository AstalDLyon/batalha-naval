package controller;

import java.util.ArrayList;

public class Startup {
    ArrayList<String> localDasCelulas;
    private String nome;


    public String  checkYourself (String  palpite){
        String resultado = "Miss";
        int indice = localDasCelulas.indexOf(palpite);

        if(indice >= 0){
            localDasCelulas.remove(indice);

            if(localDasCelulas.isEmpty()){
                resultado = "Kill";
                System.out.println("Você afundou" + nome);
            } else {
                resultado = "Hit";
            }
        }
        return resultado;
    }

    public void setLocationCells (ArrayList<String> local){

        this.localDasCelulas = local ;
    }

    public void setName (String nome){
        this.nome = nome;
    }

}
