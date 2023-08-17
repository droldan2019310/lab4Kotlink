package com.example.laboratorio4.ui.theme

import com.example.laboratorio4.R

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home : BottomNavItem("Home", R.drawable.baseline_home_24,"home")
    object MyProfile: BottomNavItem("My Profile",R.drawable.ic_profile,"my_profile")
    object Settings: BottomNavItem("Settings",R.drawable.ic_settings,"settings")
    object Emergency: BottomNavItem("emergency",R.drawable.ic_emergency,"emergency")
}