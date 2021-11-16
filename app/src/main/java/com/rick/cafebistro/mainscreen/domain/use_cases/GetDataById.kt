package com.rick.cafebistro.mainscreen.domain.use_cases

import com.rick.cafebistro.mainscreen.domain.*

class GetMainCourseById(
    private val repository: IMainCourseRepository
) {

    suspend operator fun invoke(id: Int): MainCourse? =
        repository.getMainById(id)

}

class GetDessertById(
    private val repository: IDessertRepository
) {

    suspend operator fun invoke(id: Int): Dessert? =
        repository.getDessertById(id)

}

class GetBreakFastById(
    private val repository: IBreakFastRepository
) {

    suspend operator fun invoke(id: Int): BreakFast? =
        repository.getBreakById(id)

}