/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matest;

import vistas.frmFormulario;
import vistas.frmEjercicios;
import vistas.frmResumen;

/**
 *
 * @author gaspar
 */
public final class Ejercicios {
    private frmFormulario formulario = new frmFormulario();
    private frmEjercicios ejercicios = new frmEjercicios();
    private frmResumen resumen = new frmResumen();
    
    /**
     * 1 Suma
     * 2 Resta
     * 3 Multiplicacion
     * 4 Division
     * 5 Porcentage
     */
    
    private int opcion;

    public Ejercicios(int opcion) {
        this.opcion = opcion;
        llenarFormulario();
    }
    
    private int minutos;
    private int segundos;
    private int digitos;
    private int cifras;
    
    private int cantidadejercicios;
    
    private double respuesta;
    
    private int respuestasCorrectas = 0;
    
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public int getMinutos() {
        return minutos;
    }
        
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    public int getSegundos() {
        return segundos;
    }
    
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public int getCantidadejercicios() {
        return cantidadejercicios;
    }

    public void setCantidadejercicios(int cantidadejercicios) {
        this.cantidadejercicios = cantidadejercicios;
    }

    public void setDigitos(int digitos) {
        this.digitos = digitos;
    }

    public void setCifras(int cifras) {
        this.cifras = cifras;
    }

    public double getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(double respuesta) {
        this.respuesta = respuesta;
    }

    public int getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public void setRespuestasCorrectas(int respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }
        
    public void setIdiomaSeleccionado(int idiomaSeleccionado) {
        formulario.constructor(idiomaSeleccionado,this,this.opcion);
        ejercicios.constructor(idiomaSeleccionado,this,this.opcion);
        resumen.constructor(idiomaSeleccionado, this);
    }
    
    public void llenarFormulario() {
        if (this.opcion == 2 || this.opcion > 3) {
            formulario.ocultarCifras();
        }
        
        formulario.setVisible(true);
    }
    
    public void mostrarEjercicios() {
        ejercicios.setPorTiempo(!(this.minutos == 0 && this.segundos == 0));
        ejercicios.setVisible(true);
        ejercicios.iniciarCronometro();
        formulario.dispose();
    }
    
    public void repetirEjercicios(int idiomaSeleccionado) {
        ejercicios = new frmEjercicios();
        setIdiomaSeleccionado(idiomaSeleccionado);
        mostrarEjercicios();
        resumen.dispose();
    }
    
    public void terminar() {
        resumen.llenar();
        resumen.setVisible(true);
        ejercicios.dispose();
    }
    
    public String generarSuma() {
        String problema = "";
        int numero;
        int resultado = 0;
        
        for (int i = 0; i < this.cifras; i++) {
            numero = generarNumero();
            resultado += numero;
            
            if (i == 0) {
                problema += "   ";
            } else {
                problema += " + ";
            }
            
            problema += "\t" + numero;
            
            if (this.digitos > 1) {
                problema += "\n";
            }
        }
        
        this.respuesta = resultado;
        return problema;
    }
    
    public String generarResta() {
        String problema = "";
        int [] numero = new int[2];
        int resultado;        
        
        do {            
            numero[0] = generarNumero();
        } while (numero[0] <= 1);
        do {            
            numero[1] = generarNumero();
        } while (numero[1] >= numero[0]);
        
        resultado = numero[0] - numero[1];

        problema += "   \t" + numero[0];
        if (this.digitos > 1) {
            problema += "\n";
        }
        problema += " - \t" + numero[1];
        
        this.respuesta = resultado;
        return problema;
    }
    
    public String generarMultiplicacion() {
        String problema = "";
        int numero;
        int resultado = 1;
        
        for (int i = 0; i < this.cifras; i++) {
            numero = generarNumero();
            resultado *= numero;
            
            if (i == 0) {
                problema += "   ";
            } else {
                problema += " × ";
            }
            
            problema += "\t" + numero;
            
            if (this.digitos > 1) {
                problema += "\n";
            }
        }
        
        this.respuesta = resultado;
        return problema;
    }
    
    public String generarDivision() {
        this.respuesta = generarNumero();
        int numero = generarNumero();        
        
        return (this.respuesta*numero) + " ÷ " + numero;
    }
    
    public String generarPorcentage() {
        int numero = generarNumero();
        int porcentaje = (int) (Math.random()*100) + 1;
        
        this.respuesta = numero*porcentaje/100;
        
        return porcentaje + "%\n\n" + numero;
    }
    
    public int generarNumero() {
        int numero;
        do {            
            numero = (int) (Math.random()*Math.pow(10, this.digitos));
        } while (numero == 0);
        return numero;
    }
}
