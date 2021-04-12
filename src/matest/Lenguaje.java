/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matest;

/**
 *
 * @author gaspar
 */
public class Lenguaje {
    private int idiomaSeleccionado = 0;

    public int getIdiomaSeleccionado() {
        return idiomaSeleccionado;
    }

    public void setIdiomaSeleccionado(int idiomaSeleccionado) {
        this.idiomaSeleccionado = idiomaSeleccionado;
    }
    
    private final String [] IDIOMAS             = {"Español","English"};
    private final String [] SUMA                = {"Suma","Addition"};
    private final String [] RESTA               = {"Resta","Substraction"};
    private final String [] MULTIPLICACION      = {"Multiplicación","Multiplication"};
    private final String [] DIVISION            = {"División","Division"};
    private final String [] PORCENTAGE          = {"Porcentage","Percentage"};
    private final String [] RESPUESTA           = {"Respuesta","Answer"};
    private final String [] SIGUIENTE           = {"Siguiente","Next"};
    private final String [] HISTORIAL           = {"Historial","History"};
    private final String [] ENTRAR              = {"Entrar","Go"};
    private final String [] IDIOMA              = {"Idioma","Language"};
    private final String [] POR_TIEMPO          = {"Por tiempo límite","By limit tyme"};
    private final String [] POR_EJERCICIOS      = {"Por cantidad de ejercicios","By amount of exercises"};
    private final String [] TIEMPO              = {"Tiempo","Time"};
    private final String [] MINUTOS             = {"Min","Min"};
    private final String [] SEGUNDOS            = {"Seg","Sec"};
    private final String [] CANTIDAD_EJERCICIOS = {"Cantidad de ejercicios","Amount of exercises"};
    private final String [] DIGITOS             = {"Cantidad de dígitos por cifra","Amount of digits by number"};
    private final String [] CIFRAS              = {"Cantidad de cifras","Amount of numbers"};
    private final String [] COMENZAR            = {"Comenzar","Start"};
    private final String [] RESUMEN             = {"Resumen","Overview"};
    private final String [] RESPUESTAS_CORRECTAS= {"Respuestas correctas","Correct answers"};
    private final String [] TIEMPO_PROMEDIO     = {"Tiempo promedio","Average time"};
    private final String [] PUNTAJE             = {"Puntaje","Points"};
    private final String [] GUARDAR             = {"Guardar","Save"};
    private final String [] REINTENTAR          = {"Reintentar","Retry"};
    private final String [] CERRAR              = {"Cerrar","Close"};

    public String [] getIDIOMAS() {
        return IDIOMAS;
    }
    
    public String getPOR_TIEMPO() {
        return POR_TIEMPO[this.idiomaSeleccionado];
    }

    public String getPOR_EJERCICIOS() {
        return POR_EJERCICIOS[this.idiomaSeleccionado];
    }

    public String getTIEMPO() {
        return TIEMPO[this.idiomaSeleccionado];
    }

    public String getMINUTOS() {
        return MINUTOS[this.idiomaSeleccionado];
    }

    public String getSEGUNDOS() {
        return SEGUNDOS[this.idiomaSeleccionado];
    }

    public String getCANTIDAD_EJERCICIOS() {
        return CANTIDAD_EJERCICIOS[this.idiomaSeleccionado];
    }

    public String getDIGITOS() {
        return DIGITOS[this.idiomaSeleccionado];
    }

    public String getCIFRAS() {
        return CIFRAS[this.idiomaSeleccionado];
    }
    
    public String getSUMA() {
        return SUMA[this.idiomaSeleccionado];
    }

    public String getRESTA() {
        return RESTA[this.idiomaSeleccionado];
    }

    public String getMULTIPLICACION() {
        return MULTIPLICACION[this.idiomaSeleccionado];
    }

    public String getDIVISION() {
        return DIVISION[this.idiomaSeleccionado];
    }

    public String getPORCENTAGE() {
        return PORCENTAGE[this.idiomaSeleccionado];
    }

    public String getRESPUESTA() {
        return RESPUESTA[this.idiomaSeleccionado];
    }

    public String getSIGUIENTE() {
        return SIGUIENTE[this.idiomaSeleccionado];
    }

    public String getHISTORIAL() {
        return HISTORIAL[this.idiomaSeleccionado];
    }

    public String getENTRAR() {
        return ENTRAR[this.idiomaSeleccionado];
    }

    public String getIDIOMA() {
        return IDIOMA[this.idiomaSeleccionado];
    }
    
    public String getCOMENZAR() {
        return COMENZAR[this.idiomaSeleccionado];
    }    
    
    public String getRESUMEN() {
        return RESUMEN[this.idiomaSeleccionado];
    }

    public String getRESPUESTAS_CORRECTAS() {
        return RESPUESTAS_CORRECTAS[this.idiomaSeleccionado];
    }

    public String getTIEMPO_PROMEDIO() {
        return TIEMPO_PROMEDIO[this.idiomaSeleccionado];
    }

    public String getPUNTAJE() {
        return PUNTAJE[this.idiomaSeleccionado];
    }
    
    public String getGUARDAR() {
        return GUARDAR[this.idiomaSeleccionado];
    }
    
    public String getREINTENTAR() {
        return REINTENTAR[this.idiomaSeleccionado];
    }
    
    public String getCERRAR() {
        return CERRAR[this.idiomaSeleccionado];
    }
}
