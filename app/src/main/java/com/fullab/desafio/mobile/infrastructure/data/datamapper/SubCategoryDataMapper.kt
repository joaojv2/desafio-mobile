package com.fullab.desafio.mobile.infrastructure.data.datamapper

import com.fullab.desafio.mobile.domain.entities.SubCategory
import com.fullab.desafio.mobile.dto.SubCategoryDTO
import com.fullab.desafio.mobile.infrastructure.data.datamapper.interfaces.IDataMapper

class SubCategoryIDataMapper : IDataMapper<SubCategory, SubCategoryDTO> {

    override fun map(input: SubCategory): SubCategoryDTO {
        return SubCategoryDTO(input.id, input.name)
    }
}