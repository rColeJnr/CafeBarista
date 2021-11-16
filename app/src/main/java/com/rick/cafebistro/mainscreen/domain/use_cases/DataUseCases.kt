package com.rick.cafebistro.mainscreen.domain.use_cases

data class DataUseCases (
    val getMainCourses: GetMainCourses,
    val getDesserts: GetDesserts,
    val getBreakFasts: GetBreakFasts,
    val deleteMainCourse: DeleteMainCourse,
    val deleteDessert: DeleteDessert,
    val deleteBreakFast: DeleteBreakFast,
    val saveMainCourse: SaveMainCourse,
    val saveDessert: SaveDessert,
    val saveBreakFast: SaveBreakFast,
    val getMainCourseById: GetMainCourseById,
    val getDessertById: GetDessertById,
    val getBreakFastById: GetBreakFastById
)
