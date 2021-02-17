/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author data
 */
public class Archivos {
    
    private File archivo;
    private byte [] contenidoArchivo;

    public Archivos(File archivo) {
        
        this.archivo = archivo;
    }

    // Obtener los bytes del archivo 
    public void leerArchivo () throws IOException {
    
        contenidoArchivo = Files.readAllBytes (archivo.toPath());
    } 

    public byte[] getContenidoArchivo() {
        return contenidoArchivo;
    }
    
    
}
