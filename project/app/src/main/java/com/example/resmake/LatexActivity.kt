package com.example.resmake

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.resmake.data.Repository
import com.example.resmake.databinding.ActivityLatexBinding

class LatexActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLatexBinding
    private val repo = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize the binding object
        binding = ActivityLatexBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            try {
                setupViews()
            }catch (e: Exception){
                Toast.makeText(root.context, "Failed to load latex data", Toast.LENGTH_SHORT).show()
                println("Failed to load latex data: ${e.message}")
            }
        }
        //setUpViews()
    }

    private fun ActivityLatexBinding.setupViews() {
        val forms = repo.getForms()
        if (forms.isNotEmpty()) {
            tvDisplay.text = forms.first().latex ?: getString(R.string.no_data_to_display)
        } else {
            tvDisplay.text = getString(R.string.no_data_to_display)
        }
    }

    /*  private fun setUpViews() {
          binding.btnCopy.setOnClickListener {
              repo.getLatex()?.observe(this@LatexActivity, Observer { form ->
                  form?.let {
                      val latexString = it.latex
                      binding.tvDisplay.text = latexString
                      copyToClipboard(latexString)
                      Toast.makeText(this@LatexActivity, "Copied to clipboard", Toast.LENGTH_SHORT).show()
                  } ?: run {
                      Toast.makeText(this@LatexActivity, "No form found", Toast.LENGTH_SHORT).show()
                  }
              })
          }
      }

      private fun copyToClipboard(text: String) {
          val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
          val clip = ClipData.newPlainText("LaTeX", text)
          clipboard.setPrimaryClip(clip)
      }
  */
}
