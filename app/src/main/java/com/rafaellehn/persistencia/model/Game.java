package com.rafaellehn.persistencia.model;
import  com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.facebook.stetho.common.StringUtil;


/**
 * Created by logonrm on 06/10/2017.
 */

@Table(name = "game")

public class Game extends Model {

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "genero_id")
    private Genero genero;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Genero getGenero(){
        return genero;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

}
