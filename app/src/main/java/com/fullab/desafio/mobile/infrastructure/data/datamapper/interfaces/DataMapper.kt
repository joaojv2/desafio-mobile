package com.fullab.desafio.mobile.infrastructure.data.datamapper.interfaces

interface DataMapper <I, O> {

    fun map(input: I): O
}