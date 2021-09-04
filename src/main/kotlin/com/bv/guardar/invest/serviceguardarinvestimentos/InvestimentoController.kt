package com.bv.guardar.invest.serviceguardarinvestimentos

import com.bv.guardar.invest.serviceguardarinvestimentos.http.converters.TiposDeInvestimentoResponseConverter
import com.bv.guardar.invest.serviceguardarinvestimentos.http.output.TiposDeInvestimentoResponse
import com.bv.guardar.invest.serviceguardarinvestimentos.usecase.ListarTiposDeInvestimentoUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InvestimentoController {

    val listarTiposDeInvestimentoUseCase = ListarTiposDeInvestimentoUseCase()
    val tiposDeInvestimentoResponseConverter = TiposDeInvestimentoResponseConverter()

    @GetMapping("/investimentos")
    fun listarTiposDeInvestimentoDisponiveis(): List<TiposDeInvestimentoResponse>? {

        return tiposDeInvestimentoResponseConverter.convert(listarTiposDeInvestimentoUseCase.buscarTiposDeInvestimentoDisponiveis())
    }
}