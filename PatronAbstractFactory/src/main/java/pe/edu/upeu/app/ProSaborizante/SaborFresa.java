/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.ProSaborizante;

public class SaborFresa implements IProductoSaborizante {

    @Override
    public void obteners() {
        System.out.print("Procesamiento de Auxina de la fresa ");
    }

    @Override
    public String informacion() {
        return "extracto de Fresa Natural";
    }
}
