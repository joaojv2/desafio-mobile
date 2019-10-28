package com.fullab.desafio.mobile.application

import com.fullab.desafio.mobile.dto.CategoryDTO

interface ICategoryApplication {

    fun getCategoryTree(onError: (Throwable) -> Unit, onSuccess: (List<CategoryDTO>) -> Unit)
}