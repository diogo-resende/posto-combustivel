package com.empresa.posto_combustivel.service;

import com.empresa.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.empresa.posto_combustivel.infrastructure.repositories.BombasDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombasDeCombustivelService {

    private final BombasDeCombustivelRepository bombasDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombasDeCombustivel){
    bombasDeCombustivelRepository.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id){
        return bombasDeCombustivelRepository.findById(id).orElseThrow(()
                ->new NullPointerException("Bomba de combustivel não encontrada"));
    }
    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){
        return bombasDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarBombaDeCombustivel(Integer id){
        bombasDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaDeCombustivel(Integer id, BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombasDeCombustivelRepository.save(bombasDeCombustivel);

    }


}
