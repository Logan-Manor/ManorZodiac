package com.example.manorzodiac
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.manorzodiac.adapter.Adapter
import com.example.manorzodiac.database.Zodiac
import com.example.manorzodiac.database.ZodiacDatabase
import com.example.zodiac1.R
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val db: ZodiacDatabase by lazy {ZodiacDatabase.getDatabase(this)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zodiacDao = db.zodiacDao()

        lifecycleScope.launch {
            val listOfZodiacSigns: List<Zodiac> = zodiacDao.getAllNames()!!

            val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
            recyclerView.adapter = Adapter(applicationContext, listOfZodiacSigns)
            recyclerView.setHasFixedSize(true)
        }

    }
}