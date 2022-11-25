/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.ProLeche;

public class LecheAlmendras implements IProductoLeche{

    @Override
    public void producir() {
        System.out.print("Extrayendo leche de las almendras");
    }

    @Override
    public String getDatos() {
        return "Leche de almendras, extraido 250ml";
    }
    
}