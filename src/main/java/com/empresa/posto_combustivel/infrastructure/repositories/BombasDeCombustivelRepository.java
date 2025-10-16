package com.empresa.posto_combustivel.infrastructure.repositories;

import com.empresa.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.empresa.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombasDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Integer> {
}
