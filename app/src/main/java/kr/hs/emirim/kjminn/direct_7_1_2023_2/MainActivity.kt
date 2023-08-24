package kr.hs.emirim.kjminn.direct_7_1_2023_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var editDegree : EditText
    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editDegree = findViewById(R.id.editDegree)
        imgV = findViewById(R.id.imgV)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var menuInflator = menuInflater
        menuInflator.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemRotate -> {
                imgV.rotation = editDegree.text.toString().toFloat()
                return true
            }

            R.id.item1 -> {
                imgV.setImageResource(R.drawable.moutain_hanra)
                item.setChecked(true)
                return true
            }

            R.id.item2 -> {
                imgV.setImageResource(R.drawable.island_chusa)
                item.setChecked(true)
                return true
            }

            R.id.item3 -> {
                imgV.setImageResource(R.drawable.island_bum)
                item.setChecked(true)
                return true
            }
        }

        return false
    }
}