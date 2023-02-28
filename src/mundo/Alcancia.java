/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Guía 2 - Actividad 2
 * Ejercicio: alcancia
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

public class Alcancia {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Número de monedas de $50 que hay en la alcancía.
     */
    private int numeroMonedas50;

    /**
     * Número de monedas de $100 que hay en la alcancía.
     */
    private int numeroMonedas100;

    /**
     * Número de monedas de $200 que hay en la alcancía.
     */
    private int numeroMonedas200;

    /**
     * Número de monedas de $500 que hay en la alcancía.
     */
    private int numeroMonedas500;

    /**
     * Número de monedas de $1000 que hay en la alcancía.
     */
    private int numeroMonedas1000;

    /**
     * Estado de la alcancía. <br>
     * 0 indica que no está rota. <br>
     * 1 indica que está rota.
     */
    private int estado;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye la alcancía. <br>
     * <b>post: </b> El número de monedas de 50, número de monedas de 100, número de monedas de 200, número de monedas de 500, número de monedas de 1000 <br>
     * y el estado fueron inicializados en 0.
     */
    public Alcancia() {
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
        estado = 0;
    }

    /**
     * Retorna el número de monedas de $50 que hay en la alcancía.
     *
     * @return Número de monedas de $50 en la alcancía.
     */
    public int darNumeroMonedas50() {
        return numeroMonedas50;
    }

    /**
     * Retorna el número de monedas de $100 que hay en la alcancía.
     *
     * @return Número de monedas de $100 en la alcancía.
     */
    public int darNumeroMonedas100() {
        return numeroMonedas100;
    }

    /**
     * Retorna el número de monedas de $200 que hay en la alcancía.
     *
     * @return Número de monedas de $200 en la alcancía.
     */
    public int darNumeroMonedas200() {
        return numeroMonedas200;
    }

    /**
     * Retorna el número de monedas de $500 que hay en la alcancía.
     *
     * @return Número de monedas de $500 en la alcancía.
     */
    public int darNumeroMonedas500() {
        return numeroMonedas500;
    }

    /**
     * Retorna el número de monedas de $1000 que hay en la alcancía.
     *
     * @return Número de monedas de $1000 en la alcancía.
     */
    public int darNumeroMonedas1000() {
        return numeroMonedas1000;
    }

    /**
     * Informa si la alcancía está rota o no.
     *
     * @return Retorna "ROTA" si está rota, "NO ROTA" en caso contrario.
     */
    public String darEstado() {
        if(estado == 1)
        {
            return "ROTA";
        }
        else
        {
            return "NO ROTA";
        }
    }

    /**
     * Retorna el total de dinero que hay en la alcancía.
     *
     * @return Total de dinero que hay en la alcancía.
     */
    public int calcularTotalDinero() {
        int totalDinero = numeroMonedas50 * 50 +
                numeroMonedas100 * 100 +
                numeroMonedas200 * 200 +
                numeroMonedas500 * 500 +
                numeroMonedas1000 * 1000;
        return totalDinero;
    }

    /**
     * Retorna el estado de la alcancía. <br>
     * <b>pre: </b> La alcancía no está rota.
     *
     * @return Cadena que informa la cantidad de monedas que había en la alcancía y la cantidad total de dinero.
     */
    public String darEstadoAlcancia() {
        int totalDinero = calcularTotalDinero();

        return "La alcancía tenía: \n " + numeroMonedas50 + " moneda(s) de $50 \n " + numeroMonedas100 + " moneda(s) de $100 \n " + numeroMonedas200 + " moneda(s) de $200 \n " + numeroMonedas500 + " moneda(s) de $500 \n " + numeroMonedas1000
                + " moneda(s) de $1000 \n " + "Para un total de $" + totalDinero + " pesos.";
    }

    /**
     * Agrega una moneda de $50 a la alcancía. <br>
     * <b>pre: </b> La alcancía no está rota. <br>
     * <b>post: </b> Aumentó en uno la cantidad de monedas de $50 en la alcancía.
     */
    public void agregarMoneda50() {
        if(estado == 0)
        {
            numeroMonedas50 = numeroMonedas50 + 1;
        }
    }

    /**
     * Agrega una moneda de $100 a la alcancía. <br>
     * <b>pre: </b> La alcancía no está rota. <br>
     * <b>post: </b> Aumentó en uno la cantidad de monedas de $100 en la alcancía.
     */
    public void agregarMoneda100() {
        if(estado == 0)
        {
            numeroMonedas100 = numeroMonedas100 + 1;
        }
    }

    /**
     * Agrega una moneda de $200 a la alcancía. <br>
     * <b>pre: </b> La alcancía no está rota. <br>
     * <b>post: </b> Aumentó en uno la cantidad de monedas de $200 en la alcancía.
     */
    public void agregarMoneda200() {
        if(estado == 0)
        {
            numeroMonedas200 = numeroMonedas200 + 1;
        }
    }

    /**
     * Agrega una moneda de $500 a la alcancía. <br>
     * <b>pre: </b> La alcancía no está rota. <br>
     * <b>post: </b> Aumentó en una la cantidad de monedas de $500 en la alcancía.
     */
    public void agregarMoneda500() {
        if(estado == 0)
        {
            numeroMonedas500 = numeroMonedas500 + 1;
        }
    }

    /**
     * Agrega una moneda de $1000 a la alcancía. <br>
     * <b>pre: </b> La alcancía no está rota. <br>
     * <b>post: </b> Aumentó en uno la cantidad de monedas de $1000 en la alcancía.
     */
    public void agregarMoneda1000() {
        if(estado == 0)
        {
            numeroMonedas1000 = numeroMonedas1000 + 1;
        }
    }

    /**
     * Rompe la alcancía. Es decir, cambia el estado a 1<br>
     */
    public void romperAlcancia() {
        estado = 1;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * De las 5 denominaciones de monedas que hay en la alcancía (de 50, de 100,
     * de 200, de 500 y de 1000), retorna cuál tiene la mayor cantidad de monedas.
     *
     * @return la denominación más numerosa en la alcancía: 50 o 100 o 200 o 500 o 1000.
     */
    public int obtenerDenominacionMasNumerosa() {
        int denominacionMasNumerosa = 0;
        int numeroMayor = 0;

        if(numeroMonedas50 > numeroMayor)
        {
            numeroMayor = numeroMonedas50;
            denominacionMasNumerosa = 50;
        }

        if(numeroMonedas100 > numeroMayor)
        {
            numeroMayor = numeroMonedas100;
            denominacionMasNumerosa = 100;
        }

        if(numeroMonedas200 > numeroMayor)
        {
            numeroMayor = numeroMonedas200;
            denominacionMasNumerosa = 200;
        }

        if(numeroMonedas500 > numeroMayor)
        {
            numeroMayor = numeroMonedas500;
            denominacionMasNumerosa = 500;
        }

        if(numeroMonedas1000 > numeroMayor)
        {
            numeroMayor = numeroMonedas1000;
            denominacionMasNumerosa = 1000;
        }

        return denominacionMasNumerosa;
    }

    /**
     * Una alcancía es valiosa si solo posee monedas de 1000 y de 500, y no hay
     * monedas de otras denominaciones.
     *
     * Este método permite determinar si la alcancía es valiosa, o sea, solo posee
     * monedas de 1000 pesos y de 500
     *
     * @return si es valiosa o no
     */
    public boolean valiosa() {
        int sumaMonedasNoValiosas = numeroMonedas50 + numeroMonedas100 + numeroMonedas200;
        int sumaMonedasValiosas = numeroMonedas500 + numeroMonedas1000;
        return sumaMonedasNoValiosas == 0 && sumaMonedasValiosas > 0;
    }
}
