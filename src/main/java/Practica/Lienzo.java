package Practica;

import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    
    List<FiguraGeometrica> lienzo = new ArrayList<>();
    
    public double sumarAreas(){
        double totalAreas = 0;
        for(int i = 0; i < lienzo.size(); i++){
            totalAreas += lienzo.get(i).getArea();
        }
        return totalAreas;
    }
    
    public double sumarAreas(String color){
        double totalAreas = 0;
        for(int i = 0; i < lienzo.size(); i++){
            if(lienzo.get(i).getColor().equals(color)){
                totalAreas += lienzo.get(i).getArea();
            }
        }
        return totalAreas;
    }
      
    public double sumarPerimetros(){
        double totalPerimetros = 0;
        for(int i = 0; i < lienzo.size(); i++){
            totalPerimetros += lienzo.get(i).getPerimetro();
        }       
        return totalPerimetros;
    }
    
    public double sumarPerimetros(String color){
        double totalPerimetros = 0;

        for(int i = 0; i < lienzo.size(); i++){
            if(lienzo.get(i).getColor().equals(color)){
                totalPerimetros += lienzo.get(i).getArea();
            }
        }
        return totalPerimetros;
    }
}
