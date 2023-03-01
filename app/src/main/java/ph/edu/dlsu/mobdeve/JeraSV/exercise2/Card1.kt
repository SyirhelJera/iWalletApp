package ph.edu.dlsu.mobdeve.JeraSV.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class Card1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card1)

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)

        val imageView = findViewById<ImageView>(R.id.mainView)
        imageButton1.setOnClickListener{
            imageView.setImageResource(R.drawable.wallet);
        }

        imageButton2.setOnClickListener{
            imageView.setImageResource(R.drawable.wallet2);
        }

    }
}