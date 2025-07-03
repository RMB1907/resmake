package com.example.resmake

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.resmake.data.Form
import com.example.resmake.data.Repository
import com.example.resmake.databinding.ActivityFormBinding


class FormActivity : AppCompatActivity() {
    private val repo = Repository()
    private lateinit var binding: ActivityFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // for what ?
        binding = ActivityFormBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            setUpViews()
        }
    }

    private fun ActivityFormBinding.setUpViews() {  // extension function
        btnSave.setOnClickListener {
            try {
                saveValues()
            }catch (e: Exception){
                Toast.makeText(root.context, "Failed to save data", Toast.LENGTH_SHORT).show()
               println("Failed to save data: ${e.message}")
            }
        }
    }

    private fun ActivityFormBinding.saveValues() {
        val name = etName.text.toString()
        val title = etTitle.text.toString()
        val address = etAddress.text.toString()
        val city = etCity.text.toString()
        val country = etCountry.text.toString()
        val phone = etPhone.text.toString()
        val email = etEmail.text.toString()
        val year = etYear.text.toString()
        val degree = etDegree.text.toString()
        val institution = etInstitution.text.toString()
        val grade = etGrade.text.toString()
        val employer = etEmployer.text.toString()
        val eduDescription = etEduDescription.text.toString()
        val expYear = etExpYear.text.toString()
        val jobTitle = etJobTitle.text.toString()
        val empCity = etEmpCity.text.toString()
        val expDescription = etExpDescription.text.toString()
        val project1Title = etProject1Title.text.toString()
        val project1Description = etProject1Description.text.toString()
        val project2Title = etProject2Title.text.toString()
        val project2Description = etProject2Description.text.toString()
        val skill1Title = etSkill1Title.text.toString()
        val skill1Description = etSkill1Description.text.toString()
        val skill2Title = etSkill2Title.text.toString()
        val skill2Description = etSkill2Description.text.toString()
        val latex = """ \documentclass[11pt,a4paper,sans]{moderncv}

    \moderncvstyle{casual}
    \moderncvcolor{blue}

    \name{\$name}{}
    \title{\$title}
    \address{\$address}{\$city}
    \phone[mobile]{\$phone}
    \email{\$email}

    \begin{document}
    \makecvtitle

    \section{Education}
    \cventry{\$year}{\$degree}{\$institution}{\$city}{\textit{\$grade}}{\$eduDescription}

    \section{Experience}
    \cventry{\$expYear}{\$jobTitle}{\$employer}{\$empCity}{}{\$expDescription}

    \section{Projects}
    \cvitem{\$project1Title}{\$project1Description}
    \cvitem{\$project2Title}{\$project2Description}

    \section{Skills}
    \cvitem{\$skill1Title}{\$skill1Description}
    \cvitem{$skill2Title}{\$skill2Description}

    \end{document}"""

        val forms = repo.getForms()

        if (forms.isNotEmpty()) {
            val firstForm = forms.first()

            val form = Form(
                id = firstForm.id,
                name = name,
                title = title,
                address = address,
                city = city,
                country = country,
                phone = phone,
                email = email,
                year = year,
                degree = degree,
                institution = institution,
                grade = grade,
                employer = employer,
                eduDescription = eduDescription,
                expYear = expYear,
                jobTitle = jobTitle,
                empCity = empCity,
                expDescription = expDescription,
                project1Title = project1Title,
                project1Description = project1Description,
                project2Title = project2Title,
                project2Description = project2Description,
                skill1Title = skill1Title,
                skill1Description = skill1Description,
                skill2Title = skill2Title,
                skill2Description = skill2Description,
                latex = latex
            )

            repo.updateForm(form)
        } else {
            val form = Form(
                name = name,
                title = title,
                address = address,
                city = city,
                country = country,
                phone = phone,
                email = email,
                year = year,
                degree = degree,
                institution = institution,
                grade = grade,
                employer = employer,
                eduDescription = eduDescription,
                expYear = expYear,
                jobTitle = jobTitle,
                empCity = empCity,
                expDescription = expDescription,
                project1Title = project1Title,
                project1Description = project1Description,
                project2Title = project2Title,
                project2Description = project2Description,
                skill1Title = skill1Title,
                skill1Description = skill1Description,
                skill2Title = skill2Title,
                skill2Description = skill2Description,
                latex = latex
            )

            repo.saveForm(form)
        }

        finish()
    }
}
