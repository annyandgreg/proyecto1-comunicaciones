/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.UnknownHostException;

/**
 *
 * @author Anny Chacon
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, UnknownHostException {
        // TODO code application logic here
        Archivo a = new Archivo();
        Servidor S = new Servidor(a.buscarArchivo());
    }

}
