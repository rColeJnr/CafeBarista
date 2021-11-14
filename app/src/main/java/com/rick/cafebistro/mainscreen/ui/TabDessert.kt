package com.rick.cafebistro.mainscreen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import com.rick.cafebistro.databinding.ItemBeverageBinding
import com.rick.cafebistro.databinding.TabDessertBinding
import com.rick.cafebistro.mainscreen.domain.BreakFast

class TabDessert: Fragment() {

    private var _binding: TabDessertBinding? = null
    private val binding get() = _binding!!
    private lateinit var itemBinding: ItemBeverageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TabDessertBinding.inflate(inflater, container, false)

        val breakFastAdapter = BreakFastAdapter()

        binding.dessertRV.apply {
//            breakFastAdapter.listDiffer
            adapter = breakFastAdapter
            layoutManager = GridLayoutManager(context, 3)
        }



        return binding.root
    }

    inner class BreakFastAdapter(): RecyclerView.Adapter<BreakFastAdapter.BreakFastViewHolder>(){
        inner class BreakFastViewHolder(itemBinding: ItemBeverageBinding): RecyclerView.ViewHolder(itemBinding.root){
            internal val image: ShapeableImageView = itemBinding.beverage
            internal val name: MaterialTextView = itemBinding.beverageName
        }

        private val breakDiffUtil = object : DiffUtil.ItemCallback<BreakFast>(){
            override fun areItemsTheSame(oldItem: BreakFast, newItem: BreakFast): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: BreakFast, newItem: BreakFast): Boolean {
                return oldItem.image == newItem.image
            }
        }

        internal val listDiffer = AsyncListDiffer(this, breakDiffUtil)

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): BreakFastViewHolder {
            itemBinding = ItemBeverageBinding.inflate(LayoutInflater.from(parent.context))
            return BreakFastViewHolder(itemBinding)
        }

        override fun onBindViewHolder(holder: BreakFastViewHolder, position: Int) {
            val beverage = listDiffer.currentList[position]
            with(beverage){
                with(holder){
                    this.image.setImageResource(beverage.image)
                    this.name.text = beverage.name
                }
            }
        }

        override fun getItemCount() = listDiffer.currentList.size
    }

}