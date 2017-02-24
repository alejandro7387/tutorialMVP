package com.nakva.tutorial.Saludo;

import com.nakva.tutorial.Models.Saludo;

import java.util.List;

/**
 * Created by Juancho on 24/02/17.
 * Nakva
 * linanjm90@gmail.com
 */

public interface ISaludoModelCallback {
    void updateSaludos(List<Saludo> mList);
}
