package com.tyxapp.bangumi_jetpack.main.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tyxapp.bangumi_jetpack.data.HomeDataRepository


class TimeTableViewModelFactory(
        private val repository: HomeDataRepository
) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TimeTableViewModel(repository) as T
    }
}