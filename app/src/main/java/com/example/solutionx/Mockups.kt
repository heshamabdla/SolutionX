package com.example.solutionx

import am.leon.solutionx.domain.models.Country
import am.leon.solutionx.domain.models.Currency
import am.leon.solutionx.domain.models.Filter
import android.content.Context

object Mockups {
    fun getCountries(context: Context): List<Country> = listOf(Country(1,"Saudi Arabia"
        ,"SAR","sa","00966","dd",false))

//    fun getCurrencies(context: Context): List<Currency>
//
//    fun getFilters(context: Context): List<Filter>
}