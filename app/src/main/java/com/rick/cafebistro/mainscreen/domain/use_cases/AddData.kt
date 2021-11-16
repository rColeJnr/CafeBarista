package com.rick.cafebistro.mainscreen.domain.use_cases

import com.rick.cafebistro.mainscreen.domain.*

class SaveMainCourse(
    private val repository: IMainCourseRepository
) {

    suspend operator fun invoke(mainCourse: MainCourse){
        if (mainCourse.name.isEmpty()) throw InvalidDataException("The name of the course can't be empty")
        repository.saveMain(mainCourse)
    }

}

class SaveDessert(
    private val repository: IDessertRepository
) {

    suspend operator fun invoke(dessert: Dessert){
        if (dessert.name.isEmpty()) throw InvalidDataException("The name of the dessert can't be empty")
        repository.saveDessert(dessert)
    }

}

class SaveBreakFast(
    private val repository: IBreakFastRepository
) {

    suspend operator fun invoke(breakFast: BreakFast){
        if (breakFast.name.isEmpty()) throw InvalidDataException("The name of the breakfast can't be empty")
        repository.saveBreak(breakFast)
    }

}