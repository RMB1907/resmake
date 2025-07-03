package com.example.resmake.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FormDao {
    @Query("SELECT * FROM form")
    fun getAll(): List<Form>
    @Query("SELECT * FROM form WHERE id IN (:formIds)")
    fun loadAllByIds(formIds: IntArray): List<Form>
    @Insert
    fun insertAll(vararg forms: Form)
    @Delete
    fun delete(form: Form): Int // var : class

    @Update
    fun update(form: Form)

    @Query("DELETE  FROM form WHERE id = :id")
    fun deleteById(id:Int)

    @Query("SELECT * FROM form WHERE id = :id")
    fun getById(id:Int): Form?
    @Query("SELECT * FROM form ORDER BY id DESC LIMIT 1")
    fun getLatestForm(): LiveData<Form>

}
