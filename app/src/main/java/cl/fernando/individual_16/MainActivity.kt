package cl.fernando.individual_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.fernando.individual_16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PaisCallback {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        adapter.setData(PaisesLatam.paises)
        adapter.callback = this
        binding.recyclerView.adapter = adapter


    }

    override fun showCountry(s: String) {
        binding.txtPoblacion.text = s
    }
}