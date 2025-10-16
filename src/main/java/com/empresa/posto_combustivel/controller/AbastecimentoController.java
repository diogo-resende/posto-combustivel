package com.empresa.posto_combustivel.controller;

import com.empresa.posto_combustivel.infrastructure.entities.Abastecimento;
import com.empresa.posto_combustivel.service.AbastecimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abastecimento")
public class AbastecimentoController {

    private final AbastecimentoService abastecimentoService;

    @PostMapping
    public ResponseEntity<Void> abastecer(@RequestParam ("quantidadeEmLitros") long litros,
                                          @RequestParam ("idBomba") Integer idBomba){
        abastecimentoService.abastecer(idBomba,litros);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<List<Abastecimento>> buscarAbastecimento(){
        return ResponseEntity.ok(abastecimentoService.buscarAbestecimentos());
    }
}
