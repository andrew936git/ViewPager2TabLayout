package com.example.viewpager2tablayout

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fragment: MainActivity, val pageList: MutableList<Page>):
FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("picture" to pageList[position])
        return fragment
    }
}