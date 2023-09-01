/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.model;

/**
 *
 * @author LABINFO
 */
public class Pessoa {

    private int idPessoa;
    private String nomePessoa;
    private String nacionalidadePessoa;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nomePessoa, String nacionalidadePessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.nacionalidadePessoa = nacionalidadePessoa;
    }

    /**
     * @return the idPessoa
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * @param idPessoa the idPessoa to set
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    /**
     * @return the nomePessoa
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    /**
     * @param nomePessoa the nomePessoa to set
     */
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    /**
     * @return the nacionalidadePessoa
     */
    public String getNacionalidadePessoa() {
        return nacionalidadePessoa;
    }

    /**
     * @param nacionalidadePessoa the nacionalidadePessoa to set
     */
    public void setNacionalidadePessoa(String nacionalidadePessoa) {
        this.nacionalidadePessoa = nacionalidadePessoa;
    }

}
