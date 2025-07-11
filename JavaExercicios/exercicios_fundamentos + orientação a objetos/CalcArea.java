
public sealed abstract class CalcArea permits Retangulo, Circulo {
    public abstract double calcularArea();


    public static void main(String[] args){
        CalcArea bola = new Circulo(5);
        System.out.println(String.format("Área circulo: %.2f", bola.calcularArea()));

        CalcArea retangulo = new Retangulo(3,3);
        System.out.println(String.format("Área retangulo: %.2f", retangulo.calcularArea()));
    }
}

non-sealed class  Retangulo extends CalcArea{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

non-sealed class Circulo extends CalcArea{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        final double pi = 3.1415;
        return pi * Math.pow(raio, 2);
    }

}

