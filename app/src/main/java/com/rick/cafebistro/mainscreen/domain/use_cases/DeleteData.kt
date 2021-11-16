package com.rick.cafebistro.mainscreen.domain.use_cases

import com.rick.cafebistro.mainscreen.domain.*

class DeleteMainCourse(
    private val repository: IMainCourseRepository
) {

    suspend operator fun invoke(mainCourse: MainCourse){
        repository.deleteMain(mainCourse)
    }

}

class DeleteDessert(
    private val repository: IDessertRepository
) {

    suspend operator fun invoke(dessert: Dessert){
        repository.deleteDessert(dessert)
    }

}

class DeleteBreakFast(
    private val repository: IBreakFastRepository
) {

    suspend operator fun invoke(breakFast: BreakFast){
        repository.deleteBreak(breakFast)
    }

}