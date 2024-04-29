package com.mycompany.matrizmagicapar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int tamaño;
        
        Scanner leer = new Scanner(System.in);
        Principal matriz = new Principal();
        
        System.out.println("Digite el tamaño de la matriz par(solo se puede para 4x4, 8x8, 12x12(Escriba 4 o 8 o 12)): ");
        tamaño = leer.nextInt();
                
        int CuadroM[][] = new int[tamaño][tamaño];
        
        matriz.LlenarMatriz(tamaño-1, CuadroM);
        matriz.ImprimirMatriz(tamaño-1, CuadroM);
         
    }
    
    public void LlenarMatriz(int tamaño, int CuadroM[][]){

        int i, j, contador, auxiliar;
        
        contador = 1;
        
        for(i=0; i<=tamaño; i++){
            for(j=0; j<=tamaño; j++){
                CuadroM[i][j] = contador++;
            }
        }   
        
        if(tamaño+1 == 4){

            auxiliar =  CuadroM[0][0];
            CuadroM[0][0] = CuadroM[3][3];
            CuadroM[3][3] = auxiliar;
            
            auxiliar = CuadroM[1][1];
            CuadroM[1][1] = CuadroM[2][2];
            CuadroM[2][2] = auxiliar;
            
            auxiliar =  CuadroM[0][3];
            CuadroM[0][3] = CuadroM[3][0];
            CuadroM[3][0] = auxiliar;
            
            auxiliar = CuadroM[1][2];
            CuadroM[1][2] = CuadroM[2][1];
            CuadroM[2][1] = auxiliar;            

        }
        
        if(tamaño+1 == 8){

            auxiliar = CuadroM[0][0];
            CuadroM[0][0] = CuadroM[7][7];
            CuadroM[7][7] = auxiliar;


            auxiliar = CuadroM[0][1];
            CuadroM[0][1] = CuadroM[7][6];
            CuadroM[7][6] = auxiliar; 


            auxiliar = CuadroM[1][0];
            CuadroM[1][0] = CuadroM[6][7];
            CuadroM[6][7] = auxiliar;


            auxiliar = CuadroM[1][1];
            CuadroM[1][1] = CuadroM[6][6];
            CuadroM[6][6] = auxiliar;


            auxiliar = CuadroM[1][7];
            CuadroM[1][7] = CuadroM[6][0];
            CuadroM[6][0] = auxiliar; 


            auxiliar = CuadroM[1][6];
            CuadroM[1][6] = CuadroM[6][1];
            CuadroM[6][1] = auxiliar; 

            auxiliar = CuadroM[0][7];
            CuadroM[0][7] = CuadroM[7][0];
            CuadroM[7][0] = auxiliar; 

            auxiliar = CuadroM[0][6];
            CuadroM[0][6] = CuadroM[7][1];
            CuadroM[7][1] = auxiliar;


            auxiliar = CuadroM[2][2];
            CuadroM[2][2] = CuadroM[5][5];
            CuadroM[5][5] = auxiliar;

            auxiliar = CuadroM[2][3];
            CuadroM[2][3] = CuadroM[5][4];
            CuadroM[5][4] = auxiliar;

            auxiliar = CuadroM[3][2];
            CuadroM[3][2] = CuadroM[4][5];
            CuadroM[4][5] = auxiliar;

            auxiliar = CuadroM[3][3];
            CuadroM[3][3] = CuadroM[4][4];
            CuadroM[4][4] = auxiliar; 

            auxiliar = CuadroM[2][4];
            CuadroM[2][4]= CuadroM[5][3];
            CuadroM[5][3] = auxiliar ; 

            auxiliar = CuadroM[2][5];
            CuadroM[2][5] = CuadroM[5][2];
            CuadroM[5][2] = auxiliar;

            auxiliar = CuadroM[3][4];
            CuadroM[3][4] =  CuadroM[4][3];
            CuadroM[4][3] = auxiliar; 

            auxiliar = CuadroM[3][5];
            CuadroM[3][5] =  CuadroM[4][2];
            CuadroM[4][2] = auxiliar; 

        }
        if(tamaño+1 == 12){
            
            auxiliar = CuadroM[0][0];
            CuadroM[0][0] = CuadroM[11][11];
            CuadroM[11][11] = auxiliar;
            
            auxiliar = CuadroM[0][1];
            CuadroM[0][1] = CuadroM[11][10];
            CuadroM[11][10] = auxiliar;
            
            auxiliar = CuadroM[0][2];
            CuadroM[0][2] = CuadroM[11][9];
            CuadroM[11][9] = auxiliar;
            
            auxiliar = CuadroM[1][0];
            CuadroM[1][0] = CuadroM[10][11];
            CuadroM[10][11] = auxiliar;
            
            auxiliar = CuadroM[1][1];
            CuadroM[1][1] = CuadroM[10][10];
            CuadroM[10][10] = auxiliar;
            
            auxiliar = CuadroM[1][2];
            CuadroM[1][2] = CuadroM[10][9];
            CuadroM[10][9] = auxiliar;
            
            auxiliar = CuadroM[2][0];
            CuadroM[2][0] = CuadroM[9][11];
            CuadroM[9][11] = auxiliar;
            
            auxiliar = CuadroM[2][1];
            CuadroM[2][1] = CuadroM[9][10];
            CuadroM[9][10] = auxiliar;
            
            auxiliar = CuadroM[2][2];
            CuadroM[2][2] = CuadroM[9][9];
            CuadroM[9][9] = auxiliar;
            
            auxiliar = CuadroM[3][3];
            CuadroM[3][3] = CuadroM[8][8];
            CuadroM[8][8] = auxiliar;
            
            auxiliar = CuadroM[3][4];
            CuadroM[3][4] = CuadroM[8][7];
            CuadroM[8][7] = auxiliar; 
            
            auxiliar = CuadroM[3][5];
            CuadroM[3][5] = CuadroM[8][6];
            CuadroM[8][6] = auxiliar; 
            
            auxiliar = CuadroM[3][6];
            CuadroM[3][6] = CuadroM[8][5];
            CuadroM[8][5] = auxiliar; 

            auxiliar = CuadroM[3][7];
            CuadroM[3][7] = CuadroM[8][4];
            CuadroM[8][4] = auxiliar; 

            auxiliar = CuadroM[3][8];
            CuadroM[3][8] = CuadroM[8][3];
            CuadroM[8][3] = auxiliar;             
            
            auxiliar = CuadroM[4][3];
            CuadroM[4][3] = CuadroM[7][8];
            CuadroM[7][8] = auxiliar;
            
            auxiliar = CuadroM[4][4];
            CuadroM[4][4] = CuadroM[7][7];
            CuadroM[7][7] = auxiliar;
            
            auxiliar = CuadroM[4][5];
            CuadroM[4][5] = CuadroM[7][6];
            CuadroM[7][6] = auxiliar;
            
            auxiliar = CuadroM[4][6];
            CuadroM[4][6] = CuadroM[7][5];
            CuadroM[7][5] = auxiliar;
            
            auxiliar = CuadroM[4][7];
            CuadroM[4][7] = CuadroM[7][4];
            CuadroM[7][4] = auxiliar;

            auxiliar = CuadroM[4][8];
            CuadroM[4][8] = CuadroM[7][3];
            CuadroM[7][3] = auxiliar;            
            
            auxiliar = CuadroM[5][3];
            CuadroM[5][3] = CuadroM[6][8];
            CuadroM[6][8] = auxiliar;  
            
            auxiliar = CuadroM[5][4];
            CuadroM[5][4] = CuadroM[6][7];
            CuadroM[6][7] = auxiliar;          
                        
            auxiliar = CuadroM[5][5];
            CuadroM[5][5] = CuadroM[6][6];
            CuadroM[6][6] = auxiliar;  
                        
            auxiliar = CuadroM[5][6];
            CuadroM[5][6] = CuadroM[6][5];
            CuadroM[6][5] = auxiliar;  
                        
            auxiliar = CuadroM[5][7];
            CuadroM[5][7] = CuadroM[6][4];
            CuadroM[6][4] = auxiliar;  
                        
            auxiliar = CuadroM[5][8];
            CuadroM[5][8] = CuadroM[6][3];
            CuadroM[6][3] = auxiliar;  
            
            auxiliar = CuadroM[0][9];
            CuadroM[0][9] = CuadroM[11][2];
            CuadroM[11][2] = auxiliar;
            
            auxiliar = CuadroM[0][10];
            CuadroM[0][10] = CuadroM[11][1];
            CuadroM[11][1] = auxiliar;
            
            auxiliar = CuadroM[0][11];
            CuadroM[0][11] = CuadroM[11][0];
            CuadroM[11][0] = auxiliar;
            
            auxiliar = CuadroM[1][9];
            CuadroM[1][9] = CuadroM[10][2];
            CuadroM[10][2] = auxiliar;
            
            auxiliar = CuadroM[1][10];
            CuadroM[1][10] = CuadroM[10][1];
            CuadroM[10][1] = auxiliar;
            
            auxiliar = CuadroM[1][11];
            CuadroM[1][11] = CuadroM[10][0];
            CuadroM[10][0] = auxiliar;
            
            auxiliar = CuadroM[2][9];
            CuadroM[2][9] = CuadroM[9][2];
            CuadroM[9][2] = auxiliar;
            
            auxiliar = CuadroM[2][10];
            CuadroM[2][10] = CuadroM[9][1];
            CuadroM[9][1] = auxiliar;
            
            auxiliar = CuadroM[2][11];
            CuadroM[2][11] = CuadroM[9][0];
            CuadroM[9][0] = auxiliar;
            
        }
        
    }
    
    public void ImprimirMatriz(int tamaño, int CuadroM[][]){
        
        int i, j, constanteMagica;
        
        for(i=0; i<=tamaño; i++){
            for(j=0; j<=tamaño; j++){
                System.out.print("\t"+CuadroM[i][j]);
            }
            System.out.println("");
        }
        
        tamaño = tamaño+1;
        constanteMagica = (tamaño*((tamaño*tamaño)+1))/2;
         
        System.out.println("");
        System.out.println("");
        System.out.println("La constante magica es: "+constanteMagica);
        
    }
    
}
