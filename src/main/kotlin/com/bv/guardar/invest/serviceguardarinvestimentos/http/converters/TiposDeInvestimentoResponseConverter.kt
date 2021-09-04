package com.bv.guardar.invest.serviceguardarinvestimentos.http.converters

import com.bv.guardar.invest.serviceguardarinvestimentos.entities.Investimento
import com.bv.guardar.invest.serviceguardarinvestimentos.http.output.TiposDeInvestimentoResponse
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class TiposDeInvestimentoResponseConverter :
    Converter<List<Investimento>, List<TiposDeInvestimentoResponse>> {

    override fun convert(investimentos: List<Investimento>): List<TiposDeInvestimentoResponse>? {

        val investimentosDisponiveis = mutableListOf<TiposDeInvestimentoResponse>()

        for (investimento in investimentos) {
            investimentosDisponiveis.add(
                TiposDeInvestimentoResponse(
                    investimento.nome,
                    investimento.tipo
                )
            )
        }

        return  investimentosDisponiveis
    }
}