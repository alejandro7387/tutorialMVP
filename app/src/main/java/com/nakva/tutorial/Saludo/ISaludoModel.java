package com.nakva.tutorial.Saludo;

/**
 * Created by Juancho on 24/02/17.
 * Nakva
 * linanjm90@gmail.com
 */

public interface ISaludoModel {

    void addSaludo(String mensaje, int count, ISaludoModelCallback listener);
}
