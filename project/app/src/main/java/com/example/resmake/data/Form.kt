package com.example.resmake.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "form") // always lowercase for tablename
data class Form(
    @PrimaryKey(autoGenerate = true) val id: Int?=0,
    @ColumnInfo("name") val name: String?,
    @ColumnInfo("title") val title: String?,
    @ColumnInfo("address") val address: String?,
    @ColumnInfo("city") val city: String?,
    @ColumnInfo("country") val country: String?,
    @ColumnInfo("phone") val phone: String?,
    @ColumnInfo("email") val email: String?,
    @ColumnInfo("year") val year: String?,
    @ColumnInfo("degree") val degree: String?,
    @ColumnInfo("institution") val institution: String?,
    @ColumnInfo("grade") val grade: String?,
    @ColumnInfo("edu_description") val eduDescription: String?,
    @ColumnInfo("exp_year") val expYear: String?,
    @ColumnInfo("job_title") val jobTitle: String?,
    @ColumnInfo("employer") val employer: String?,
    @ColumnInfo("emp_city") val empCity: String?,
    @ColumnInfo("exp_description") val expDescription: String?,
    @ColumnInfo("project1_title") val project1Title: String?,
    @ColumnInfo("project1_description") val project1Description: String?,
    @ColumnInfo("project2_title") val project2Title: String?,
    @ColumnInfo("project2_description") val project2Description: String?,
    @ColumnInfo("skill1_title") val skill1Title: String?,
    @ColumnInfo("skill1_description") val skill1Description: String?,
    @ColumnInfo("skill2_title") val skill2Title: String?,
    @ColumnInfo("skill2_description") val skill2Description: String?,
    @ColumnInfo("latex") val latex: String?
)

