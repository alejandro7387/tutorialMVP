package com.nakva.tutorial.Saludo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.nakva.tutorial.Models.Saludo;
import com.nakva.tutorial.R;

import java.util.List;

/**
 * Created by Juancho on 24/02/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class SaludoActivity extends AppCompatActivity implements ISaludoView, View.OnClickListener {

    private TextView labelSaluda;
    private ISaludoPresenter mPresenter;
    private ListView mListView;

    private SaludoAdapter mAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        this.mAdapter = new SaludoAdapter(this);
        ISaludoModel model = new SaludoModel();
        this.mPresenter = new SaludoPresenter(this, model);
        this.linkViews();

    }

    private void linkViews() {
        this.labelSaluda = (TextView)this.findViewById(R.id.label_saludo);
        this.mListView = (ListView)this.findViewById(R.id.list);
        this.mListView.setAdapter(this.mAdapter);
        ((Button)this.findViewById(R.id.btn_saludo)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_saludo:
                this.mPresenter.onClickSaludo();
                break;
        }
    }

    @Override
    public void updateSaludo(String s) {
        this.labelSaluda.setText(s);
    }

    @Override
    public void showErrorLimitPass() {
        Toast.makeText(this, "Limite Sobrepasado", Toast.LENGTH_LONG).show();
    }

    @Override
    public void updateSaludos(List<Saludo> mList) {
        this.mAdapter.updateSaludos(mList);
    }
}
