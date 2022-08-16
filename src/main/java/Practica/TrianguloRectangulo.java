package Practica;


public class TrianguloRectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) throws MagnitudNegativaException{
        setColor("verde");
        if(base >= 0){
            this.base = base;
        } else{
            throw new MagnitudNegativaException();
        }
        if(altura >= 0){
            this.altura = altura;
        } else{
            throw new MagnitudNegativaException();
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws MagnitudNegativaException{
        if(base >= 0){
            this.base = base;
        } else{
            throw new MagnitudNegativaException();
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws MagnitudNegativaException{
        if(altura >= 0){
            this.altura = altura;
        } else{
            throw new MagnitudNegativaException();
        }
    }
    
    
    
    
    @Override
    public double getArea() {
        return base * altura / 2;
    }

    @Override
    public double getPerimetro() {
        double hipotenusa = Math.pow(base, 2) + Math.pow(altura, 2);
        return hipotenusa + base + altura;
    }
    
}
