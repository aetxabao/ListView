package com.pmdm.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MerindadAdapter extends ArrayAdapter<Merindad> {

    Activity context;
    Merindad[] datos;

    public MerindadAdapter(Activity context, Merindad[] datos) {
        super(context, R.layout.listitem_merindad, datos);
        this.context = context;
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Merindad merindad = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem_merindad, parent, false);
        }
        TextView tvNumero = (TextView) convertView.findViewById(R.id.LblNumero);
        TextView tvNombre = (TextView) convertView.findViewById(R.id.LblNombre);
        TextView tvIzena = (TextView) convertView.findViewById(R.id.LblIzena);
        tvNumero.setText(merindad.getNumero());
        tvNombre.setText(merindad.getNombre());
        tvIzena.setText(merindad.getIzena());
        return convertView;
    }
}
