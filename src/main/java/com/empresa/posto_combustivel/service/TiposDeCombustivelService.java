package com.empresa.posto_combustivel.service;

import com.empresa.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.empresa.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.empresa.posto_combustivel.infrastructure.repositories.BombasDeCombustivelRepository;
import com.empresa.posto_combustivel.infrastructure.repositories.TipoDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {

    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;

    public void criar(TiposDeCombustivel tiposDeCombustivel){
    tipoDeCombustivelRepository.save(tiposDeCombustivel);
    }

    public TiposDeCombustivel buscartiposDeCombustivelPorId(Integer id){
        return tipoDeCombustivelRepository.findById(id).orElseThrow(()
                ->new NullPointerException("Tipo de combustivel não encontrado"));
    }
    public List<TiposDeCombustivel> buscarTiposDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarTipoDeCombustivel(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }

    public void alterarTipoDeCombustivel(Integer id, TiposDeCombustivel tiposDeCombustivel){
        TiposDeCombustivel tipo = buscartiposDeCombustivelPorId(id);
        tiposDeCombustivel.setId(tipo.getId());
        tipoDeCombustivelRepository.save(tiposDeCombustivel);

    }


}
