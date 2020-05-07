package com.example.android.dagger.di

import RegistrationComponent
import com.example.android.dagger.login.LoginComponent
import dagger.Module

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubcomponents