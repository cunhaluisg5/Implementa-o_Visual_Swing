/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author alunoces
 */
public class Automovel {
    private String placa;
    private String modelo;
    private String dataFabricacao;
    private String motor;
    private float valorBasico;
    private String categoria;

    public Automovel(String placa, String modelo, String dataFabricacao, String motor, float valorBasico, String categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
        this.motor = motor;
        this.valorBasico = valorBasico;
        this.categoria = categoria;
    }

    public Automovel() {
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(float valorBasico) {
        this.valorBasico = valorBasico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public float calcularImposto(int taxa){
        float imposto;
        imposto = (valorBasico * taxa / 100.0f) + (valorBasico * 0.03f);
        return imposto;
    }
    
    public double valorTotalVeiculo(int taxa) {
        float total;
        total = (valorBasico * 1.05f) + calcularImposto(taxa);
        return total;
    }
    
    public String toString() {
        return "Placa: " + this.placa +
               "\nModelo: " + this.modelo +
               "\nData de fabricação: " + this.dataFabricacao +
               "\nMotorização: " + this.motor +
               "\nValor básico: " + this.valorBasico + 
               "\nCategoria: " + this.categoria;
    }
}
