/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Datos.Virus;
/**
 *
 * @author data
 */
public class Analizador {
    
    private Virus [] listaVirus;
    private byte [] contenidoBytes;
    
    public Analizador(byte[] contenidoArchivo) {
        
        this.contenidoBytes = contenidoArchivo;
        
        cargarVirus();
    }
    private void cargarVirus (){
        
        listaVirus=new Virus [5];
        
        Virus usama = new Virus("Usama", new byte[] {32,101,115,99});
        Virus amtrax = new Virus("Amtrax", new byte[] {72,72,15,29});
        Virus ebola = new Virus("éBola", new byte[] {29,32,53,29});
        Virus ah1n1 = new Virus("ah1N1", new byte[] {72,32,32,20});
        Virus covid = new Virus("Covid19", new byte[] {30,25,20,19});
    
        listaVirus [0] = usama;
        listaVirus [1] = amtrax;
        listaVirus [2] = ebola;
        listaVirus [3] = ah1n1;
        listaVirus [4] = covid;
    }
    
    //analizar
    public void analizar (){
        for(int i=0; i<contenidoBytes.length; i++) 
        {
            if(contenidoBytes [i] == listaVirus [0].getSecuVirus()[0])
            {
                if(contenidoBytes [i+1] == listaVirus [0].getSecuVirus()[1])
                {
                    if(contenidoBytes [i+2] == listaVirus [0].getSecuVirus()[2])
                    {
                        if(contenidoBytes [i+3] == listaVirus [0].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus Usama!");
                        }
                    }
                }
            }
            if(contenidoBytes [i] == listaVirus [1].getSecuVirus()[0])
            {
                if(contenidoBytes [i+1] == listaVirus [1].getSecuVirus()[1])
                {
                    if(contenidoBytes [i+2] == listaVirus [1].getSecuVirus()[2])
                    {
                        if(contenidoBytes [i+3] == listaVirus [1].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus Amtrax!");
                        }
                    }
                }
            }
            if(contenidoBytes [i] == listaVirus [2].getSecuVirus()[0])
            {
                if(contenidoBytes [i+1] == listaVirus [2].getSecuVirus()[1])
                {
                    if(contenidoBytes [i+2] == listaVirus [2].getSecuVirus()[2])
                    {
                        if(contenidoBytes [i+3] == listaVirus [2].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus éBola!");
                        }
                    }
                }
            }
            if(contenidoBytes [i] == listaVirus [3].getSecuVirus()[0])
            {
                if(contenidoBytes [i+1] == listaVirus [3].getSecuVirus()[1])
                {
                    if(contenidoBytes [i+2] == listaVirus [3].getSecuVirus()[2])
                    {
                        if(contenidoBytes [i+3] == listaVirus [3].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus ah1N1!");
                        }
                    }
                }
            }        
            if(contenidoBytes [i] == listaVirus [4].getSecuVirus()[0])
            {
                if(contenidoBytes [i+1] == listaVirus [4].getSecuVirus()[1])
                {
                    if(contenidoBytes [i+2] == listaVirus [4].getSecuVirus()[2])
                    {
                        if(contenidoBytes [i+3] == listaVirus [4].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus Covid 19!");
                        }
                    }
                }
            }    
        }
    }
}
