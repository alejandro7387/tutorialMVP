package com.nakva.tutorial.Saludo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nakva.tutorial.Models.Saludo;
import com.nakva.tutorial.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Juancho on 24/02/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class SaludoAdapter  extends BaseAdapter{

    private List<Saludo> mList;
    private LayoutInflater mInflater;

    public SaludoAdapter(Activity activity){

        this.mInflater = activity.getLayoutInflater();
        this.mList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return this.mList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =  this.mInflater.inflate(R.layout.detail_saludos, parent, false);

        Saludo  saludo = (Saludo)this.getItem(position);

        TextView labelMessage = (TextView)view.findViewById(R.id.label_text);
        TextView labelNumber = (TextView)view.findViewById(R.id.label_number);

        labelMessage.setText(saludo.getMessage());
        labelNumber.setText(saludo.getNumber() + "");
        return view;
    }

    public void updateSaludos(List<Saludo> mList) {
        this.mList = mList;
        this.notifyDataSetChanged();
    }
}
