package com.empresa.posto_combustivel.controller;

import com.empresa.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.empresa.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.empresa.posto_combustivel.service.BombasDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bombasDeCombustivel")
public class BombasDeCombustivelController {

    private final BombasDeCombustivelService bombasDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombasDeCombustivelService.criar(bombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<List<BombasDeCombustivel>> buscarBombasDeCombustivel(){
        return  ResponseEntity.ok(bombasDeCombustivelService.buscarBombasDeCombustivel());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BombasDeCombustivel> buscarBombasDeCombustivelPorId(@PathVariable (name = "id")Integer id){
        return ResponseEntity.ok(bombasDeCombustivelService.buscarBombaCombustivelPorId(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBombasDeCombustivelPorId(@PathVariable (name = "id")Integer id){
        bombasDeCombustivelService.deletarBombaDeCombustivel(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity<Void> alterarBombasDeCombustivel(@RequestParam(name = "id") Integer id,
                                                          @RequestBody BombasDeCombustivel BombasDeCombustivel){
        bombasDeCombustivelService.alterarBombaDeCombustivel(id,BombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }
}
