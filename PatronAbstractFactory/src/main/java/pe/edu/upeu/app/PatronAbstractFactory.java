/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.app;

import pe.edu.upeu.app.FabricaAbstracta.FabricaNatural;
import pe.edu.upeu.app.FabricaAbstracta.FabricaQuimica;
import pe.edu.upeu.app.FabricaAbstracta.IFabricaAbstracta;
import pe.edu.upeu.app.ProLeche.IProductoLeche;
import pe.edu.upeu.app.ProSaborizante.IProductoSaborizante;

/**
 *
 * @author INTEL
 */
public class PatronAbstractFactory {

    public static void main(String[] args) {
        System.out.println("----------------Fabrica Quimica--------------------");
        IFabricaAbstracta fabricaQ = new FabricaQuimica();
        fabricaQ.crearProductos();
        
        IProductoLeche leche1 = fabricaQ.ObtenerProductoLeche();
        IProductoSaborizante sabor1 = fabricaQ.ObtenerProductoSaborizante();
         //Proceso de produccion dependiendo el objeto que halla elegido
        leche1.producir();
        sabor1.obteners();
        //informacion de cada uno de los productos
        System.out.println("Mi bedida es de: " + leche1.getDatos() + " y " + sabor1.informacion());
        
        
        System.out.println("----------------Fabrica Natural--------------------");
        IFabricaAbstracta fabricaN = new FabricaNatural();
        fabricaN.crearProductos();
        
        IProductoLeche leche2 = fabricaN.ObtenerProductoLeche();
        IProductoSaborizante sabor2 = fabricaN.ObtenerProductoSaborizante();
         //Proceso de produccion dependiendo el objeto que halla elegido
       
        //informacion de cada uno de los productos
        System.out.println("Mi bedida es de: " + leche2.getDatos()+ " y " +sabor2.informacion());
    }
}
