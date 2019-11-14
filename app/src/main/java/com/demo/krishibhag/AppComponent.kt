package com.demo.krishibhag

import dagger.Component
import javax.inject.Singleton

@Singleton @Component(modules = arrayOf(AppModule::class))
interface AppComponent {

     fun inject(app: App)
}