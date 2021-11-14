package com.rick.cafebistro.mainscreen.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

internal class TabAdapter(
    activity: AppCompatActivity,
    val totalTabs: Int
): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return totalTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> TabBreakFast()
            1 -> TabMainCourse()
            2 -> TabDessert()
            else -> TabBreakFast()
        }
    }
}