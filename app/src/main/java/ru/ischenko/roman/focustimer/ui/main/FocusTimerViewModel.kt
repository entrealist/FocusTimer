package ru.ischenko.roman.focustimer.ui.main

import android.arch.lifecycle.MutableLiveData

/**
 * User: roman
 * Date: 22.07.18
 * Time: 21:06
 */
class FocusTimerViewModel {

    var goal: MutableLiveData<String> = MutableLiveData()
        private set

    init {
        goal.value = "Написать семь абзацев для сатьи про новый компилятор"
    }
}
