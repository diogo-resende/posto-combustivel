package com.empresa.posto_combustivel.service;

import com.empresa.posto_combustivel.infrastructure.entities.Abastecimento;
import com.empresa.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.empresa.posto_combustivel.infrastructure.repositories.AbastecimentoRepository;
import com.empresa.posto_combustivel.infrastructure.repositories.BombasDeCombustivelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepository;
    private final BombasDeCombustivelService bombasDeCombustivelService;

    public void abastecer(Integer idBomba,Long litros){
        BombasDeCombustivel bomba = bombasDeCombustivelService.buscarBombaCombustivelPorId(idBomba);
        BigDecimal valorTotal = bomba.getTiposDeCombustivel().getPreçoPorLitro()
                .multiply(BigDecimal.valueOf(litros));
        Abastecimento abastecimento = Abastecimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombasDeCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadeLitros(litros)
                .build();

        abastecimentoRepository.save(abastecimento);
    }
    public List<Abastecimento> buscarAbestecimentos(){
        return abastecimentoRepository.findAll();
    }
}
