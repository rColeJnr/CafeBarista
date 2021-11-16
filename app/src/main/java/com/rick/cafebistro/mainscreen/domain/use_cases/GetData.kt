package com.rick.cafebistro.mainscreen.domain.use_cases

import com.rick.cafebistro.mainscreen.domain.*
import kotlinx.coroutines.flow.Flow

class GetMainCourses(
    private val repository: IMainCourseRepository
) {

    suspend operator fun invoke(): Flow<List<MainCourse>> =
        repository.getMains()

}

class GetDesserts(
    private val repository: IDessertRepository
) {

    suspend operator fun invoke(): Flow<List<Dessert>> =
        repository.getDesserts()


}

class GetBreakFasts(
    private val repository: IBreakFastRepository
) {

    suspend operator fun invoke(): Flow<List<BreakFast>> =
        repository.getBreaks()
}