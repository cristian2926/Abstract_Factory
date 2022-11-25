/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.FabricaAbstracta;

import pe.edu.upeu.app.ProLeche.IProductoLeche;
import pe.edu.upeu.app.ProSaborizante.IProductoSaborizante;

/**
 *
 * @author INTEL
 */
public interface IFabricaAbstracta {
    public void crearProductos();
    IProductoLeche ObtenerProductoLeche();
    IProductoSaborizante ObtenerProductoSaborizante(); 
}
