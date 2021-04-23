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
    
    private final String [] IDIOMAS             = {"Español","English","Português"};
    private final String [] SUMA                = {"Suma","Addition","Adição"};
    private final String [] RESTA               = {"Resta","Substraction","Substração"};
    private final String [] MULTIPLICACION      = {"Multiplicación","Multiplication","Multiplicação"};
    private final String [] DIVISION            = {"División","Division","Divisão"};
    private final String [] PORCENTAGE          = {"Porcentage","Percentage","Porcentagem"};
    private final String [] RESPUESTA           = {"Respuesta","Answer","Resposta"};
    private final String [] SIGUIENTE           = {"Siguiente","Next","Próximo"};
    private final String [] HISTORIAL           = {"Historial","History","Histórico"};
    private final String [] ENTRAR              = {"Entrar","Go","Entrar"};
    private final String [] IDIOMA              = {"Idioma","Language","Idioma"};
    private final String [] POR_TIEMPO          = {"Por tiempo límite","By limit tyme","Por tempo limite"};
    private final String [] POR_EJERCICIOS      = {"Por cantidad de ejercicios","By amount of exercises","Por quantidade de exércicios"};
    private final String [] TIEMPO              = {"Tiempo","Time","Tempo"};
    private final String [] MINUTOS             = {"Min","Min","Min"};
    private final String [] SEGUNDOS            = {"Seg","Sec","Seg};
    private final String [] CANTIDAD_EJERCICIOS = {"Cantidad de ejercicios","Amount of exercises","Quantidade de exércicios"};
    private final String [] DIGITOS             = {"Cantidad de dígitos por cifra","Amount of digits by number","Quantidade de digitos por número"};
    private final String [] CIFRAS              = {"Cantidad de cifras","Amount of numbers","Quantidade de números"};
    private final String [] COMENZAR            = {"Comenzar","Start","Começar"};
    private final String [] RESUMEN             = {"Resumen","Overview","Resumo"};
    private final String [] RESPUESTAS_CORRECTAS= {"Respuestas correctas","Correct answers","Resposta correta"};
    private final String [] TIEMPO_PROMEDIO     = {"Tiempo promedio","Average time","Tempo médio"};
    private final String [] PUNTAJE             = {"Puntaje","Points","Pontuação"};
    private final String [] GUARDAR             = {"Guardar","Save","Salvar"};
    private final String [] REINTENTAR          = {"Reintentar","Retry","Tentar novamente"};
    private final String [] CERRAR              = {"Cerrar","Close","Fechar"};

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
