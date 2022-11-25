/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.ProSaborizante;

public class SaborChocolate implements IProductoSaborizante {

    @Override
    public void obteners() {
        System.out.print("Procesamiento de C7H8N4O2 ");
    }

    @Override
    public String informacion() {
        return "Sabor a chocolate";
    }

}
