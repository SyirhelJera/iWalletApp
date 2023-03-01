package ph.edu.dlsu.mobdeve.JeraSV.exercise2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);


        //Login Button Logic
        val loginButton = findViewById<Button>(R.id.LoginButton)
        loginButton.setOnClickListener{
            val eTusername = findViewById<EditText>(R.id.Username)
            val eTpassword = findViewById<EditText>(R.id.Password)
            val username = eTusername.text.toString().trim()
            val password = eTpassword.text.toString().trim()

            if (username == "admin" && password == "admin11235") {
                val Intent = Intent(this,HomeActivity::class.java)
                startActivity(Intent)
            } else {
                // If the entered username and password are incorrect, show an error message
                Toast.makeText(this, "Invalid username or password.", Toast.LENGTH_SHORT).show()
            }

        }

        // Register Button Logic
        val registerButton = findViewById<Button>(R.id.RegisterButton)
        registerButton.setOnClickListener{
            val Intent = Intent(this,RegisterActivity::class.java)
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