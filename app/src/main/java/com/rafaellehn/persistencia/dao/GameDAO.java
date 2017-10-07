package com.rafaellehn.persistencia.dao;

import com.activeandroid.query.Select;
import java.util.List;
import com.rafaellehn.persistencia.model.Game;
public class GameDAO {
    public List<Game> findAll() {
        return new Select()
                .from(Game.class)
                .orderBy("titulo ASC")
                .execute();
    }
}
