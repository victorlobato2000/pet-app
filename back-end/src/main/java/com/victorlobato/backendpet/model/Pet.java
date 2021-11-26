package com.victorlobato.backendpet.model;

import javax.persistence.*;

@Entity
@Table(name = "Pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "nome_dono")
    private String nomeDono;
    @Column(name = "email_dono")
    private String emailDono;

    public Pet(String nome, String nomeDono, String emailDono) {
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.emailDono = emailDono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getEmailDono() {
        return emailDono;
    }

    public void setEmailDono(String emailDono) {
        this.emailDono = emailDono;
    }
}
