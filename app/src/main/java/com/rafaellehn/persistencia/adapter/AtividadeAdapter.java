package com.rafaellehn.persistencia.adapter;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import com.rafaellehn.persistencia.R;
import com.rafaellehn.persistencia.model.Game;
/**
 * Created by logonrm on 06/10/2017.
 */

public class AtividadeAdapter extends
        RecyclerView.Adapter<AtividadeAdapter.GameViewHolder> {

    private List<Game> games;
    private Activity activity;
    private int lastPositionSelected;
}
