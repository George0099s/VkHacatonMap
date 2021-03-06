package com.huskyjam.vkmap

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

fun Fragment.navigate(resId: Int, bundle: Bundle? = null) {
    NavHostFragment.findNavController(this).navigate(resId, bundle)
}

fun Fragment.navigate(dir: NavDirections) {

    findNavController().navigate(dir)
}

fun Fragment.back() {
    NavHostFragment.findNavController(this).popBackStack()
}