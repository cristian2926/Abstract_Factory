/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.FabricaAbstracta;

import pe.edu.upeu.app.ProLeche.IProductoLeche;
import pe.edu.upeu.app.ProLeche.LecheVaca;
import pe.edu.upeu.app.ProSaborizante.IProductoSaborizante;
import pe.edu.upeu.app.ProSaborizante.SaborChocolate;

public class FabricaQuimica implements IFabricaAbstracta{
    private IProductoLeche leche;
    private IProductoSaborizante Sabor;

    @Override
    public void crearProductos() {
        System.out.println("Estamos procesando tu Bebida");
        leche = new LecheVaca();
        Sabor = new SaborChocolate();
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
