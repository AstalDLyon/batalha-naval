package controller;

import java.util.ArrayList;

public class Startup {
    ArrayList<String> Lista;
    int numeroDeAcertos = 0;


    public String  checkYourself (String  palpite){
        for( String celula : this.Lista){
            if(palpite.equals(celula)){
                numeroDeAcertos++;
                if (numeroDeAcertos >= Lista.size()){
                    return "Kill";
                }
                return "Hit";
            }
        }
        return  "Miss";
    }

    public void setLocationCells (ArrayList<String> local){

        this.Lista = local ;
    }

}
