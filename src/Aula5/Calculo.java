package Aula5;

/**
 * @author Felipe Rodrigues Gil 248543
 */
public class Calculo {
    private double altura, largura;
    
    public void setAltura(double novaAltura) {
        if (novaAltura < 0) novaAltura *= -1;
        
        this.altura = novaAltura;
    }
    public void setLargura(double novaLargura) {
        if (novaLargura < 0) novaLargura *= -1;
        
        this.largura = novaLargura;
    }
    public double calcularAreaQuadrilatero() {
        return (this.altura * this.largura);
    }
    public double calcularAreaParalelepidedoRetangulo() {
        return (this.altura * this.largura * 6);
    }
    public boolean isQuadradoOuCubo() {
        return (this.altura == this.largura);
    }
}