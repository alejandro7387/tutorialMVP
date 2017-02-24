package com.nakva.tutorial.Saludo;

import com.nakva.tutorial.Models.Saludo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juancho on 24/02/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class SaludoModel  implements ISaludoModel {

    private List<Saludo> mList;
    private ISaludoModelCallback callback;

    public SaludoModel() {
        this.mList = new ArrayList<>();
    }

    @Override
    public void addSaludo(String mensaje, int count, ISaludoModelCallback listener) {

        Saludo saludo = new Saludo();
        saludo.setMessage(mensaje);
        saludo.setNumber(count);

        this.mList.add(saludo);
        listener.updateSaludos(this.mList);
    }
}
