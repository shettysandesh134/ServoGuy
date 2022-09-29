package com.sandeshshetty.servoguy.business.domain.util

/**
 * @author sandeshshetty
 * Created 9/19/22 at {TIME}
 */
interface EntityMapper <Entity, DomainModel> {

    fun mapFromEntity(entity: Entity): DomainModel

    fun mapToEntity(domainModel: DomainModel): Entity

}