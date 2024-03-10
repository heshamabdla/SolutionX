package com.example.solutionx

import am.leon.solutionx.presentation.adapters.singleSelection.SingleSelectionCallback
import am.leon.solutionx.presentation.adapters.singleSelection.SingleSelectionViewType
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.solutionx.adapter.SingleSelection
import com.example.solutionx.adapter.SingleSelectionAdapter
import com.example.solutionx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SingleSelectionCallback {

    private lateinit var binding: ActivityMainBinding
    private val adapter: SingleSelectionAdapter by lazy {
        // You can change the viewType here....
        SingleSelectionAdapter(SingleSelectionViewType.SELECTION_CHECK, this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewInit()

        binding.btnFetchData.setOnClickListener {
            // You can change the list here....
            adapter.setItems(Mockups.getCountries(this))
        }
    }

    private fun viewInit() = with(binding) {
        recyclerSingleSelection.adapter = adapter
    }

    override fun onSingleItemSelected(selectedItem: SingleSelection) {
        Log.i("MainActivity", "onSingleItemSelected: $selectedItem")
        Toast.makeText(this, selectedItem.name, Toast.LENGTH_SHORT).show() }
}

