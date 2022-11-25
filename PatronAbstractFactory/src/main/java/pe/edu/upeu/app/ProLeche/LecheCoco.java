/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.ProLeche;

/**
 *
 * @author INTEL
 */
public class LecheCoco implements IProductoLeche{
   @Override
    public void producir() {
        System.out.print("Extrayendo leche de los cocos");
    }

    @Override
    public String getDatos() {
        return "Leche de coco, extraido 250ml";
    }  
}
