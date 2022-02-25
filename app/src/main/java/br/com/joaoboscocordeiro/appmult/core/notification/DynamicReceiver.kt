package br.com.joaoboscocordeiro.appmult.core.notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by João Bosco on 24/02/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class DynamicReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_BOOT_COMPLETED) {
            Toast.makeText(context, "app reinicio com sucesso", Toast.LENGTH_SHORT).show()
        }
        if(intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            Toast.makeText(context, "modo avião foi alterado", Toast.LENGTH_LONG).show()
        }
    }
}