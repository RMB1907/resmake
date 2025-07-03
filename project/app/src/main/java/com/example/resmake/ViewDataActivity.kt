package com.example.resmake

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.resmake.data.Repository
import com.example.resmake.databinding.ActivityViewDataBinding

class ViewDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewDataBinding
    private val repo = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewDataBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            try {
                setupViews()
            } catch (e: Exception) {
                Toast.makeText(root.context, "Failed to load form details", Toast.LENGTH_SHORT)
                    .show()
                println("Failed to load form details: ${e.message}")
                setupViews()
            }
        }
    }

    private fun ActivityViewDataBinding.setupViews() {
        val forms = repo.getForms()
        if (forms.isNotEmpty()) {
            val form = forms.first()
            // Cyril: Renee, setup rest of the details.
            tvDisplay.text = """
            Name: ${form.name}
        """.trimIndent()
        } else {
            tvDisplay.text = getString(R.string.no_data_to_display)
        }
    }
}
