/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario.Objetos;

/**
 *
 * @author asantos
 */
public class Datos {

    private String nombre_completo;
    private String nit;
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private String fecha_ingreso;
    private String hora_ingreso;
    private String fecha_salida;
    private String hora_salida;
    private double monto;

    public Datos() {
    }

    public Datos(String nombre_completo, String nit, String placa, String marca, String modelo, int anio, String fecha_ingreso, String hora_ingreso, String fecha_salida, String hora_salida, double monto) {
        this.nombre_completo = nombre_completo;
        this.nit = nit;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.fecha_ingreso = fecha_ingreso;
        this.hora_ingreso = hora_ingreso;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.monto = monto;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(String hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

   
}
