package com.bv.guardar.invest.serviceguardarinvestimentos.usecase

import com.bv.guardar.invest.serviceguardarinvestimentos.entities.Investimento
import com.bv.guardar.invest.serviceguardarinvestimentos.entities.enumerators.TipoInvestimentoEnum

class ListarTiposDeInvestimentoUseCase {

    fun buscarTiposDeInvestimentoDisponiveis(): List<Investimento> {

        val lvbi11 = Investimento("LVBI11", TipoInvestimentoEnum.FII)
        val embr3 = Investimento("EMBR3", TipoInvestimentoEnum.ACAO)
        val fundoPedrinho = Investimento("Fundo do Pedrinho", TipoInvestimentoEnum.FI)

        return listOf(lvbi11, embr3, fundoPedrinho)
    }

}