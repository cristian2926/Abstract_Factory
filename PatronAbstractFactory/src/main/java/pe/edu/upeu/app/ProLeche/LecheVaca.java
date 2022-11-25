/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.ProLeche;

public class LecheVaca implements IProductoLeche {

    @Override
    public void producir() {
        System.out.print("Ordeñando leche de la vaca y pasteurizar");
    }

    @Override
    public String getDatos() {
        return "Leche de Vaca, extraido 250ml";
    }
}
