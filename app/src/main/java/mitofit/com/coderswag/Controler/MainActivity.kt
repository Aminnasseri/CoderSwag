package mitofit.com.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import mitofit.com.coderswag.Model.Category
import mitofit.com.coderswag.R
import mitofit.com.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)
        categoryListView.adapter =adapter


    }
}
