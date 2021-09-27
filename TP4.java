package tp4aydalgoritmos;

import java.util.Arrays;
import java.util.Scanner;


public class TP4AYDalgoritmos {

    static int cont;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n,total_discos,i;
        
        System.out.println("Coloque la cantidad de discos a Ingresar: ");
        n=entrada.nextInt();
        
        total_discos=n*2;
        char[] discos = new char[total_discos];
        
        
        for(i=0;i<total_discos;i++){
            discos[i]='r';
            discos[i+1]='a';
            i++;
        }
        
        System.out.println("Discos sin ordenar: "+Arrays.toString(discos));
        System.out.println("Discos Ordenados: "+Arrays.toString(ordenar(discos)));
        System.out.println("Cantidad de permutaciones realizadas: "+cont);
        
        
    }
    
    public static char[] ordenar(char[]d){
        char aux;
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d.length-1;j++){
                if(d[j]=='a' && d[j+1]=='r'){
                    aux= d[j];
                    d[j]= d[j+1];
                    d[j+1]=aux;
                    cont++;
                }
            }
        }
        return d;
    }
    
}
