package com.formatoweb.git06072020.services;

import com.formatoweb.git06072020.entity.Padres;

import java.util.List;

public interface PadreService {
    List<Padres> getPadres();
    Padres savePadres(Padres padres);
    Padres getPadresById(Long id);
    void deletePadre(Long id);
}
