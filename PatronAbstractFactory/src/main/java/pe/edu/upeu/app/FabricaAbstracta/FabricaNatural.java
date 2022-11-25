/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.FabricaAbstracta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import pe.edu.upeu.app.ProLeche.IProductoLeche;
import pe.edu.upeu.app.ProLeche.LecheAlmendras;
import pe.edu.upeu.app.ProLeche.LecheCoco;
import pe.edu.upeu.app.ProSaborizante.IProductoSaborizante;
import pe.edu.upeu.app.ProSaborizante.SaborFresa;

public class FabricaNatural implements IFabricaAbstracta{
    private IProductoLeche leche;
    private IProductoSaborizante Sabor;
    @Override
    public void crearProductos() {
        String seleccion;
        System.out.println("Estamos Creando tu Bebida");
        System.out.println("1) Leche de Almendras, 2) Leche de Coco");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
        try {
            System.out.println("Ingrese tu seleccion: ");
            seleccion = br.readLine();
            if("1".equals(seleccion)){
            leche = new LecheAlmendras();
            }else{
            leche = new LecheCoco();
            }
            System.out.println("Ahora aniadimos el sabor ");
            Sabor = new SaborFresa();
            Sabor.obteners();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public IProductoLeche ObtenerProductoLeche() {
        return leche;
    }
    @Override
    public IProductoSaborizante ObtenerProductoSaborizante() {
        return Sabor;
    }
    
}
