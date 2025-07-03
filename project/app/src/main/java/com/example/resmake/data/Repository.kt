package com.example.resmake.data

import androidx.lifecycle.LiveData
import com.example.resmake.App

class Repository{

    private val formDao: FormDao

    init {
        val db = App.getDb()
        formDao = db!!.formDao()
    }

    fun saveForm(form: Form) {
        formDao.insertAll(form)
    }

    fun updateForm(form: Form) {
        formDao.update(form)
    }

    fun getForms(): List<Form> {
        return formDao.getAll()
    }

    fun delete(id: Int) {
        formDao.deleteById(id)
    }

    fun deleteForm(form: Form): Int = formDao.delete(form)

    fun getLatest(): LiveData<Form> {
        return formDao.getLatestForm()
    }
}
