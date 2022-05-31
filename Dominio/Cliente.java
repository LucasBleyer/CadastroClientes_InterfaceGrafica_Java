package Dominio;

import java.util.ArrayList;

public abstract class Cliente{
    
    public ArrayList listClientes;
    
    protected String nome;
    protected int idade;
    protected String telefone;
    protected String sexo;
    protected String estadoCivil;

    public Cliente(String nome, int idade, String telefone, String sexo, String estadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Clientes "
                + "\nNome: " + nome 
                + "\nIdade:" + idade 
                + "\nTelefone: " + telefone 
                + "\nSexo: " + sexo 
                + "\nEstadoCivil: " + estadoCivil;
    }
}