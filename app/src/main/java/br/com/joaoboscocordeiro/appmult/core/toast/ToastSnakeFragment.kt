package br.com.joaoboscocordeiro.appmult.core.toast

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.com.joaoboscocordeiro.appmult.R
import br.com.joaoboscocordeiro.appmult.databinding.FragmentToastSnakeBinding
import br.com.joaoboscocordeiro.appmult.util.toast
import com.google.android.material.snackbar.Snackbar

/**
 * Created by João Bosco on 23/02/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class ToastSnakeFragment : Fragment(R.layout.fragment_toast_snake) {

    private lateinit var binding: FragmentToastSnakeBinding

    @SuppressLint("ShowToast")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

        binding = FragmentToastSnakeBinding.bind(view)

        binding.toast.setOnClickListener {
            val msg = "Minha mensagem para você!"
            Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()
        }

        // Material design guideline:
        // https://material.io/archive/guidelines/components/snackbars-toasts.html#snackbars-toasts-usage
        binding.snake.setOnClickListener {
            Snackbar.make(view, "Oi Snake", Snackbar.LENGTH_LONG).show()
        }

        binding.snakeAction.setOnClickListener {
            Snackbar
                .make(view, "Snake with Action", Snackbar.LENGTH_LONG)
                .setAction(R.string.ok) { toast("I am a snake!") }
                .show()
        }
    }
}