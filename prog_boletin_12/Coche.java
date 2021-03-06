/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_12;

/**
 *
 * @author emendezduran
 */
public class Coche {
    
  private String matricula;
    private String marca;
    private boolean aparcado = false;
    private long entrada;

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        entrada = System.currentTimeMillis();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAparcado() {
        return aparcado;
    }

    public void setAparcado(boolean aparcado) {
        this.aparcado = aparcado;
    }

    public long getEntrada() {
        return entrada;
    }


    public String timeString() {
        long salida = System.currentTimeMillis();
        String horas = String.valueOf((salida - entrada) / 3600000);
        String minutos = String.valueOf(((salida - entrada) % 3600000) / 60000);
        String segundos = String.valueOf((((salida - entrada) % 3600000) % 60000) / 1000);
        return horas + ":" + minutos + ":" + segundos;
    }

    public long calcHoras() {
        long salida = System.currentTimeMillis();
        return (salida - entrada) / 3600000;
    }

}

