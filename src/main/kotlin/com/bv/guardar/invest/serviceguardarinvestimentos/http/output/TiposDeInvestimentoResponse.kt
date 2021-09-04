package com.bv.guardar.invest.serviceguardarinvestimentos.http.output

import com.bv.guardar.invest.serviceguardarinvestimentos.entities.enumerators.TipoInvestimentoEnum

data class TiposDeInvestimentoResponse(val nome: String, val tipo: TipoInvestimentoEnum?)