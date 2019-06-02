package com.fox.studio.testlifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class MyObserver: LifecycleObserver {

    /*важно указать аннотацию  OnLifecycleEvent и тип события в параметре
    в даанном случае функция будет выполнена по любому событию. Функцию можно обзывать как угодно*/
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(source: LifecycleOwner, event: Lifecycle.Event){
        //делаем что угодно
        Log.d("TAG", event.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG", event.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG", event.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG", event.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG", event.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG", event.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("TAG", event.toString())
    }

}