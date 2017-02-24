package com.nakva.tutorial.Saludo;

import com.nakva.tutorial.Models.Saludo;

import java.util.List;

/**
 * Created by Juancho on 24/02/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class SaludoPresenter  implements ISaludoPresenter, ISaludoModelCallback {

    private ISaludoView mView;
    private ISaludoModel mModel;
    private int count;

    public SaludoPresenter(ISaludoView view, ISaludoModel model){
        this.mModel = model;
        this.mView = view;
        this.count = 0;
    }

    @Override
    public void onClickSaludo() {
        if(this.count < 5) {
            this.count++; //count = count + 1
            String mensaje = "Hola como estas";
            this.mModel.addSaludo(mensaje, this.count, this);
            this.mView.updateSaludo(mensaje);
        }
        else{
            this.mView.showErrorLimitPass();
        }
    }

    @Override
    public void updateSaludos(List<Saludo> mList) {
        this.mView.updateSaludos(mList);
    }
}
