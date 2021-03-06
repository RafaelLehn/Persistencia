package com.rafaellehn.persistencia.dao;

/**
 * Created by logonrm on 06/10/2017.
 */

import com.activeandroid.query.Select;
import java.util.List;
import com.rafaellehn.persistencia.model.Game;
import com.rafaellehn.persistencia.model.Genero;

public class GeneroDAO {
    public List<Genero> findAll() {
        return new Select()
                .from(Genero.class)
                .orderBy("descricao ASC")
                .execute();
    }
    public void seed() {
        Genero genero = new Genero();
        genero.setDescricao("Ação");
        genero.save();
        genero = new Genero();
        genero.setDescricao("Aventura");
        genero.save();
        genero = new Genero();
        genero.setDescricao("Estratégia");
        genero.save();
        genero = new Genero();
        genero.setDescricao("RPG");
        genero.save();
        genero = new Genero();
        genero.setDescricao("Esporte");
        genero.save();
        genero = new Genero();
        genero.setDescricao("Corrida");
        genero.save();
        genero = new Genero();
        genero.setDescricao("Simulação");
        genero.save();
        genero = new Genero();
        genero.setDescricao("Outro");
        genero.save();
    }
}

