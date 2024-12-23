package tech.uzpro.android_kotlin_crud

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tech.uzpro.android_kotlin_crud.db.SubscriberRepository

class SubscriberViewModelFactory(private val repository: SubscriberRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)) {
            SubscriberViewModel(repository) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}