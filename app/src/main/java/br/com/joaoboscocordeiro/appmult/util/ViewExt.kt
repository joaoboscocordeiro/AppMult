package br.com.joaoboscocordeiro.appmult.util

import android.view.View
import android.view.animation.Animation

/**
 * Created by João Bosco on 23/02/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
fun View.startAnimation(anim: Animation, onEnd: () -> Unit) {
    anim.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationEnd(p0: Animation?) = onEnd()
        override fun onAnimationRepeat(anim: Animation?) = Unit
        override fun onAnimationStart(anim: Animation?) = Unit
    })
    this.startAnimation(anim)
}

fun View.setVisible(show: Boolean) {
    if (show) this.visibility = View.VISIBLE else this.visibility = View.GONE
}