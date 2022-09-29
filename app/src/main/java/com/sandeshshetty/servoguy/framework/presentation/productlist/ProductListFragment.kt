package com.sandeshshetty.servoguy.framework.presentation.productlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.sandeshshetty.servoguy.R
import com.sandeshshetty.servoguy.business.domain.model.Product
import com.sandeshshetty.servoguy.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ProductListFragment : Fragment(), ProductItemAdapter.Interaction {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var productItemAdapter: ProductItemAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        setUpFab()
    }

    private fun setupRecyclerView() {
        binding.productItemRecylerView.apply {
            layoutManager = LinearLayoutManager(context)
            productItemAdapter = ProductItemAdapter(this@ProductListFragment)
            adapter = productItemAdapter
        }
    }

    private fun setUpFab() {
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAnchorView(R.id.fab)
                .setAction("Action", null).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemSelected(view: View, position: Int, item: Product) {
        TODO("Not yet implemented")
    }
}