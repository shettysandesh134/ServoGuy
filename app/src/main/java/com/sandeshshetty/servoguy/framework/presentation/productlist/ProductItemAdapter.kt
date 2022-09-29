package com.sandeshshetty.servoguy.framework.presentation.productlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.sandeshshetty.servoguy.business.domain.model.Product
import com.sandeshshetty.servoguy.databinding.ItemProductBinding

/**
 * @author sandeshshetty
 * Created 9/18/22 at {TIME}
 */
class ProductItemAdapter(private val interaction: Interaction? = null) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object DiffCallback : DiffUtil.ItemCallback<Product>() {

        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            TODO("not implemented")
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean =
            oldItem == newItem

    }

    private val differ = AsyncListDiffer(this, DiffCallback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return ProductViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProductViewHolder -> {
                holder.bind(differ.currentList.get(position), interaction)
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun submitList(list: List<Product>) {
        differ.submitList(list)
    }

    class ProductViewHolder
    constructor(
        private val binding: ItemProductBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Product, onClickListener: Interaction?) {
            binding.apply {
                root.setOnClickListener {
                    onClickListener?.onItemSelected(root, adapterPosition, item)
                }
            }

            TODO("bind view with data")
        }


        companion object {
            fun create(parent: ViewGroup): ProductViewHolder {
                val binding = ItemProductBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return ProductViewHolder(binding)
            }
        }

    }

    interface Interaction {
        fun onItemSelected(view: View, position: Int, item: Product)
    }
}