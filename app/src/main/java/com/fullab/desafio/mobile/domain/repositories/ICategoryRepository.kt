package com.fullab.desafio.mobile.domain.repositories

import com.fullab.desafio.mobile.domain.entities.Category

interface ICategoryRepository {

    fun getCategoryTree(onError: (Throwable) -> Unit, onSuccess: (List<Category>) -> Unit)
}