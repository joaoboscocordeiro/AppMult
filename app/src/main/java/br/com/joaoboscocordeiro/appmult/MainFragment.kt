package br.com.joaoboscocordeiro.appmult

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.joaoboscocordeiro.appmult.databinding.FragmentMainBinding
import br.com.joaoboscocordeiro.appmult.util.navTo

/**
 * Created by João Bosco on 22/02/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.codelabToastSnake.setOnClickListener { navTo(R.id.toastSnakeFragment) }
    }

}