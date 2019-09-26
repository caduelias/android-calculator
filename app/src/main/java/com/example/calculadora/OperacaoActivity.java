package com.example.calculadora;

public class OperacaoActivity {

    double a = 0;
    double b = 0;
    double resultado;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double soma(){
        resultado = getA() + getB();
        return resultado;
    }

    public double subtrai(){
        resultado = getA() - getB();
        return resultado;
    }

    public double divide(){
        resultado = getA() / getB();
        return resultado;
    }

    public double multiplica(){
        resultado = getA() * getB();
        return resultado;
    }

}
