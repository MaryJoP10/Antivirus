/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author data
 */
public class Virus {
    private String nomVirus;
    private byte [] secuVirus;
    
    public Virus(String nomVirus, byte[] secuVirus){
        this.nomVirus = nomVirus;
        this.secuVirus = secuVirus;
    }

    public byte[] getSecuVirus() {
        return secuVirus;
    }
    
    
}
