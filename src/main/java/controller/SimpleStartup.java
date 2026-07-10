package controller;

public class SimpleStartup {
    int[] localDasCelulas;
    int numeroDeAcertos = 0;


    public String  checkYourself (int  palpite){
        for( int celula : localDasCelulas){
            if(celula == palpite){
                numeroDeAcertos++;
                if (numeroDeAcertos >= localDasCelulas.length){
                    return "Kill";
                }
                return "Hit";
            }
        }
        return  "Miss";
    }

    public void setLocationCells (int[] local){
        this.localDasCelulas = local ;
    }

}
