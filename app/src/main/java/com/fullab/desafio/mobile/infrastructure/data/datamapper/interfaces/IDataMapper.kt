package com.fullab.desafio.mobile.infrastructure.data.datamapper.interfaces

interface IDataMapper <I, O> {

    fun map(input: I): O
}