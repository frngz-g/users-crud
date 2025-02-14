package tech.uzpro.android_kotlin_crud.db

import androidx.lifecycle.LiveData
import androidx.room.*
import tech.uzpro.android_kotlin_crud.db.Subscriber

@Dao
interface SubscriberDAO {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber): Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber): Int

    @Query(value = "delete from subscriber_data_table")
    suspend fun deleteAll(): Int

    @Query(value = "select * from subscriber_data_table")
    fun getAllSubscribers(): LiveData<List<Subscriber>>
}