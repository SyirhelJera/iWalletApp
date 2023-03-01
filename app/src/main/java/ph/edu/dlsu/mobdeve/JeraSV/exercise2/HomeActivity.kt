package ph.edu.dlsu.mobdeve.JeraSV.exercise2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoutButton = findViewById<Button>(R.id.LogoutButton)
        logoutButton.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }


        val card1Button = findViewById<CardView>(R.id.cardview1)
        card1Button.setOnClickListener{
            val Intent = Intent(this,Card1::class.java)
            startActivity(Intent)
        }

        val card2Button = findViewById<CardView>(R.id.cardview2)
        card2Button.setOnClickListener{
            val Intent = Intent(this,Card2::class.java)
            startActivity(Intent)
        }

        val card3Button = findViewById<CardView>(R.id.cardview3)
        card3Button.setOnClickListener{
            val Intent = Intent(this,Card3::class.java)
            startActivity(Intent)
        }
    }

    override fun onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed()
            finishAffinity();
        } else{
            Toast.makeText(applicationContext, "Press back again to exit app", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }

}