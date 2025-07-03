package com.example.resmake

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.resmake.data.Repository
import com.example.resmake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repo = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            setupViews()
        }
    }

    private fun ActivityMainBinding.setupViews(){
        binding.cardViewForm.setOnClickListener {
            startActivity(Intent(root.context, FormActivity::class.java))
        }

        binding.cardViewLatex.setOnClickListener {
            val intent = Intent(root.context, LatexActivity::class.java)
            startActivity(intent)
        }

        binding.cardViewDelete.setOnClickListener {
            try {
                val forms = repo.getForms()
                if(forms.isNotEmpty()){
                   val isDeleted = repo.deleteForm(forms.first()) > 0
                    if(isDeleted){
                        Toast.makeText(root.context, "Data cleared successfully", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(root.context, "No data to clear", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(root.context, "No data to clear", Toast.LENGTH_SHORT).show()
                }
            }catch (e: Exception){
                Toast.makeText(root.context, "Failed to delete data", Toast.LENGTH_SHORT).show()
                println("Failed to delete data: ${e.message}")
            }
        }

        binding.cardViewData.setOnClickListener {
            startActivity(Intent(root.context, ViewDataActivity::class.java))
        }

        binding.cardViewPrint.setOnClickListener {
            Log.d("MainActivity", "Print CardView clicked")
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.overleaf.com"))
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}
