package com.formatoweb.git06072020.services.impl;

import com.formatoweb.git06072020.entity.Padres;
import com.formatoweb.git06072020.repository.PadreRepository;
import com.formatoweb.git06072020.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PadreServiceImpl implements PadreService {
    @Autowired
    private PadreRepository padreRepository;

    @Override
    public List<Padres> getPadres() {
        return padreRepository.findAll();
    }

    @Override
    public Padres savePadres(Padres padres) {
        return padreRepository.save(padres);
    }

    @Override
    public Padres getPadresById(Long id) {
        return padreRepository.findById(id).orElse(null);
    }
}
